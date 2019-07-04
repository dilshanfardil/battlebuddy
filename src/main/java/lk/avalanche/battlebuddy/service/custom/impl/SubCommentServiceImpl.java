package lk.avalanche.battlebuddy.service.custom.impl;

import lk.avalanche.battlebuddy.dto.SubCommentDTO;
import lk.avalanche.battlebuddy.entity.SubComment;
import lk.avalanche.battlebuddy.repository.SubCommetRepository;
import lk.avalanche.battlebuddy.service.custom.SubCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class SubCommentServiceImpl implements SubCommentService {
    @Autowired
    SubCommetRepository subCommetRepository;

    @Override
    public List<SubCommentDTO> findAll() {
        return subCommetRepository.findAll().stream().map(x ->
                new SubCommentDTO(x.getSubCommentId(),x.getUser(),x.getComment(),x.getBody(),x.getLikes(),x.getCreatedTime())).collect(Collectors.toList());
    }

    @Override
    public SubCommentDTO getrById(int id) {
        SubComment subComment = subCommetRepository.getOne(id);
        return new SubCommentDTO(subComment.getSubCommentId(),subComment.getUser(),subComment.getComment(),subComment.getBody(),subComment.getLikes(),subComment.getCreatedTime());
    }

    @Override
    public void update(SubCommentDTO subCommentDTO) {
        SubComment subComment = new SubComment(subCommentDTO.getSubCommentId(), subCommentDTO.getUser(), subCommentDTO.getComment(), subCommentDTO.getBody(), subCommentDTO.getLikes(), subCommentDTO.getCreatedTime());
        subCommetRepository.save(subComment);
    }

    @Override
    public void delete(int id) {
        subCommetRepository.deleteById(id);
    }

    @Override
    public void insert(SubCommentDTO subCommentDTO) {
        SubComment subComment = new SubComment(subCommentDTO.getUser(), subCommentDTO.getComment(), subCommentDTO.getBody(), subCommentDTO.getLikes(), subCommentDTO.getCreatedTime());
        subCommetRepository.save(subComment);
    }
}
