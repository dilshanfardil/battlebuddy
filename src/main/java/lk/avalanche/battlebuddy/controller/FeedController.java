package lk.avalanche.battlebuddy.controller;

import lk.avalanche.battlebuddy.dto.FeedDTO;
import lk.avalanche.battlebuddy.service.custom.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/feed")
public class FeedController {
    @Autowired
    FeedService feedService;

    @GetMapping
    @ResponseBody
    public List<FeedDTO> getCompanies(){
        return feedService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity insert(@RequestBody FeedDTO FeedDTO){
        feedService.insert(FeedDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public FeedDTO getCompanyId(@PathVariable("id") int id){
        return feedService.getrById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/{id}")
    public ResponseEntity updateCompany(@RequestBody FeedDTO FeedDTO){
        feedService.update(FeedDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCompany(@PathVariable int id){
        feedService.delete(id);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
