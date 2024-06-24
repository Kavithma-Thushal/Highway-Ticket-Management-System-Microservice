package lk.ijse.gdse66.customerservice.service.impl;

import lk.ijse.gdse66.customerservice.dto.UserDTO;
import lk.ijse.gdse66.customerservice.entity.UserEntity;
import lk.ijse.gdse66.customerservice.repo.UserRepo;
import lk.ijse.gdse66.customerservice.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : User-Service
 * @since : 10:37 AM - 6/24/2024
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    public ModelMapper modelMapper;

    @Autowired
    public UserRepo userRepo;

    @Override
    public void saveUser(UserDTO userDTO) {
        if (!userRepo.existsById(userDTO.getUser_id())) {
            userRepo.save(modelMapper.map(userDTO, UserEntity.class));
        }
    }

    @Override
    public UserDTO searchUser(String id) {
        return userRepo.findById(id).map(userEntity -> modelMapper.map(userEntity, UserDTO.class)).orElse(null);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, UserEntity.class));
    }

    @Override
    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<UserEntity> loadAllUsers() {
        return userRepo.findAll();
    }
}
