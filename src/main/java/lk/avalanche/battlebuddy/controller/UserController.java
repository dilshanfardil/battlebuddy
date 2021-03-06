package lk.avalanche.battlebuddy.controller;

import lk.avalanche.battlebuddy.dto.UserDTO;
import lk.avalanche.battlebuddy.service.custom.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/23/2019
 * Time: 11:08 PM}
 */

@CrossOrigin
@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

//    @GetMapping
//    @ResponseBody
//    public List<UserDTO> getCompanies(){
//        return userService.findAll();
//    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity insert(@RequestBody UserDTO UserDTO){
        userService.insert(UserDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public UserDTO getCompanyId(@PathVariable("id") int id){
        return userService.getrById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/{id}")
    public ResponseEntity updateCompany(@RequestBody UserDTO UserDTO){
        userService.update(UserDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCompany(@PathVariable int id){
        userService.delete(id);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
