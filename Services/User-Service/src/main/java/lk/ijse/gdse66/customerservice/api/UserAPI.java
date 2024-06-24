package lk.ijse.gdse66.customerservice.api;

import lk.ijse.gdse66.customerservice.dto.UserDTO;
import lk.ijse.gdse66.customerservice.entity.UserEntity;
import lk.ijse.gdse66.customerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Customer-Service
 * @since : 9:47 PM - 6/23/2024
 **/
@RestController
@RequestMapping("/api/v1/user")
public class UserAPI {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public UserService userService;

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);
    }

    @GetMapping("/searchUser/{id}")
    public UserDTO searchUser(@PathVariable String id) {
        return userService.searchUser(id);
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @GetMapping("/loadAllUsers")
    public List<UserEntity> loadAllUsers() {
        return userService.loadAllUsers();
    }
}