package lk.ijse.gdse66.customerservice.service.impl;

import lk.ijse.gdse66.customerservice.dto.VehicleDTO;
import lk.ijse.gdse66.customerservice.entity.VehicleEntity;
import lk.ijse.gdse66.customerservice.repo.VehicleRepo;
import lk.ijse.gdse66.customerservice.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Vehicle-Service
 * @since : 10:37 AM - 6/24/2024
 **/
@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    public ModelMapper modelMapper;

    @Autowired
    public VehicleRepo vehicleRepo;

    @Override
    public void saveVehicle(VehicleDTO vehicleDTO) {
        if (!vehicleRepo.existsById(vehicleDTO.getVehicle_id())) {
            vehicleRepo.save(modelMapper.map(vehicleDTO, VehicleEntity.class));
        }
    }

    @Override
    public VehicleDTO searchVehicle(String id) {
        return vehicleRepo.findById(id).map(vehicleEntity -> modelMapper.map(vehicleEntity, VehicleDTO.class)).orElse(null);
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        vehicleRepo.save(modelMapper.map(vehicleDTO, VehicleEntity.class));
    }

    @Override
    public void deleteVehicle(String id) {
        vehicleRepo.deleteById(id);
    }

    @Override
    public List<VehicleEntity> loadAllVehicles() {
        return vehicleRepo.findAll();
    }
}
