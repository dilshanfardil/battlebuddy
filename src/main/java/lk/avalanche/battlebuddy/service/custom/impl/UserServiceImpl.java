package lk.avalanche.battlebuddy.service.custom.impl;

import lk.avalanche.battlebuddy.dto.UserDTO;
import lk.avalanche.battlebuddy.entity.User;
import lk.avalanche.battlebuddy.repository.UserRepository;
import lk.avalanche.battlebuddy.service.custom.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/26/2019
 * Time: 8:25 PM}
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public UserDTO getrById(int id) {
        User user = userRepository.getOne(id);
        return new UserDTO(user.getUserId(),user.getName(),user.getUserName(),user.getPassword());
    }

    @Override
    public void update(UserDTO userDTO) {
        User user = userRepository.getOne(userDTO.getUserId());
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setUserName(userDTO.getUserName());
        userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        User user = userRepository.getOne(id);
        userRepository.delete(user);
    }

    @Override
    public void insert(UserDTO userDTO) {
        User user=new User();
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setUserName(userDTO.getUserName());
        userRepository.save(user);
    }
}
