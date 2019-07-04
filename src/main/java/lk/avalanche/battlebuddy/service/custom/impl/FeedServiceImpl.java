package lk.avalanche.battlebuddy.service.custom.impl;

import lk.avalanche.battlebuddy.dto.FeedDTO;
import lk.avalanche.battlebuddy.entity.Feed;
import lk.avalanche.battlebuddy.repository.FeedRepository;
import lk.avalanche.battlebuddy.repository.UserRepository;
import lk.avalanche.battlebuddy.service.custom.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class FeedServiceImpl implements FeedService {
    @Autowired
    FeedRepository feedRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public List<FeedDTO> findAll() {
        return feedRepository.findAll().stream().map(x ->
                new FeedDTO(x.getFeedId(),x.getUser().getUserId(),x.getTitle(),x.getVideo(),x.getLikes(),x.getText())).collect(Collectors.toList());
    }

    @Override
    public FeedDTO getrById(int id) {
        Feed x = feedRepository.getOne(id);
        return new FeedDTO(x.getFeedId(),x.getUser().getUserId(),x.getTitle(),x.getVideo(),x.getLikes(),x.getText());
    }

    @Override
    public void update(FeedDTO feedDTO) {
        Feed feed = new Feed(feedDTO.getFeedId(),userRepository.getOne(feedDTO.getUserId()), feedDTO.getTitle(), feedDTO.getVideo(), feedDTO.getLikes(), feedDTO.getText());
        feedRepository.save(feed);
    }

    @Override
    public void delete(int id) {
        feedRepository.deleteById(id);
    }

    @Override
    public void insert(FeedDTO feedDTO) {
        Feed feed = new Feed(userRepository.getOne(feedDTO.getUserId()), feedDTO.getTitle(), feedDTO.getVideo(), feedDTO.getLikes(), feedDTO.getText());
        feedRepository.save(feed);
    }
}
