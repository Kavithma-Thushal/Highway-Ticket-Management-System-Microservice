package lk.ijse.gdse66.customerservice.service;

import lk.ijse.gdse66.customerservice.dto.UserDTO;
import lk.ijse.gdse66.customerservice.entity.UserEntity;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Customer-Service
 * @since : 10:36 AM - 6/24/2024
 **/
public interface UserService {

    void saveUser(UserDTO userDTO);

    UserDTO searchUser(String id);

    void updateUser(UserDTO userDTO);

    void deleteUser(String id);

    List<UserEntity> loadAllUsers();
}
