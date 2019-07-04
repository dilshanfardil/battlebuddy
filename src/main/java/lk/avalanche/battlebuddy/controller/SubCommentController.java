package lk.avalanche.battlebuddy.controller;

import lk.avalanche.battlebuddy.dto.SubCommentDTO;
import lk.avalanche.battlebuddy.service.custom.SubCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/sub_comment")
public class SubCommentController {
    @Autowired
    SubCommentService subCommentService;

    @GetMapping
    @ResponseBody
    public List<SubCommentDTO> getCompanies(){
        return subCommentService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity insert(@RequestBody SubCommentDTO SubCommentDTO){
        subCommentService.insert(SubCommentDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public SubCommentDTO getCompanyId(@PathVariable("id") int id){
        return subCommentService.getrById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/{id}")
    public ResponseEntity updateCompany(@RequestBody SubCommentDTO SubCommentDTO){
        subCommentService.update(SubCommentDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCompany(@PathVariable int id){
        subCommentService.delete(id);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
