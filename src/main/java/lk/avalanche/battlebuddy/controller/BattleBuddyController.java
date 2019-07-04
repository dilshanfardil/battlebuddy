package lk.avalanche.battlebuddy.controller;

import lk.avalanche.battlebuddy.dto.BattleBuddyDTO;
import lk.avalanche.battlebuddy.service.custom.BattleBuddyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/battle_buddy")
public class BattleBuddyController {
    @Autowired
    BattleBuddyService battleBuddyService;

    @GetMapping
    @ResponseBody
    public List<BattleBuddyDTO> getCompanies(){
        return battleBuddyService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity insert(@RequestBody BattleBuddyDTO battleBuddyDTO){
        battleBuddyService.insert(battleBuddyDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public BattleBuddyDTO getCompanyId(@PathVariable("id") int id){
        return battleBuddyService.getrById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/{id}")
    public ResponseEntity updateCompany(@RequestBody BattleBuddyDTO battleBuddyDTO){
        battleBuddyService.update(battleBuddyDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCompany(@PathVariable int id){
        battleBuddyService.delete(id);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
