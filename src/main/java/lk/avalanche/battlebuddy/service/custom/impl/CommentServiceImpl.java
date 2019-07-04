package lk.avalanche.battlebuddy.service.custom.impl;

import lk.avalanche.battlebuddy.dto.CommentDTO;
import lk.avalanche.battlebuddy.entity.Comment;
import lk.avalanche.battlebuddy.repository.CommentRepository;
import lk.avalanche.battlebuddy.repository.UserRepository;
import lk.avalanche.battlebuddy.service.custom.CommentServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/26/2019
 * Time: 10:09 PM}
 */

@Service
public class CommentServiceImpl implements CommentServiece {
    @Autowired
    private CommentRepository commetRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public List<CommentDTO> findAll() {
        return commetRepository.findAll().stream().map(x ->
                new CommentDTO(x.getCommentId(),x.getUser().getUserId(),x.getFeedId(),x.getBody(),x.getLikes(),x.getCreatedTime())).collect(Collectors.toList());
    }

    @Override
    public CommentDTO getrById(int id) {
        Comment x = commetRepository.getOne(id);
        return new CommentDTO(x.getCommentId(),x.getUser().getUserId(),x.getFeedId(),x.getBody(),x.getLikes(),x.getCreatedTime());
    }

    @Override
    public void update(CommentDTO commentDTO) {
        Comment subComment = new Comment(commentDTO.getCommentId(),userRepository.getOne(commentDTO.getUserId()), commentDTO.getFeedId(), commentDTO.getBody(), commentDTO.getLikes(), commentDTO.getCreatedTime());
        commetRepository.save(subComment);
    }

    @Override
    public void delete(int id) {
        commetRepository.deleteById(id);
    }

    @Override
    public void insert(CommentDTO commentDTO) {
        Comment subComment = new Comment(userRepository.getOne(commentDTO.getUserId()), commentDTO.getFeedId(), commentDTO.getBody(), commentDTO.getLikes(), commentDTO.getCreatedTime());
        commetRepository.save(subComment);
    }
}
