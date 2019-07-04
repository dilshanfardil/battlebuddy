package lk.avalanche.battlebuddy.controller;

import lk.avalanche.battlebuddy.dto.CommentDTO;
import lk.avalanche.battlebuddy.service.custom.CommentServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/comment")
public class CommentController {
    @Autowired
    CommentServiece commentServiece;

    @GetMapping
    @ResponseBody
    public List<CommentDTO> getCompanies(){
        return commentServiece.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity insert(@RequestBody CommentDTO CommentDTO){
        commentServiece.insert(CommentDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public CommentDTO getCompanyId(@PathVariable("id") int id){
        return commentServiece.getrById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/{id}")
    public ResponseEntity updateCompany(@RequestBody CommentDTO CommentDTO){
        commentServiece.update(CommentDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCompany(@PathVariable int id){
        commentServiece.delete(id);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
