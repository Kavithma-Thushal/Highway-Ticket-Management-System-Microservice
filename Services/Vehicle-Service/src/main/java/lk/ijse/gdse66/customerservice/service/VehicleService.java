package lk.ijse.gdse66.customerservice.service;

import lk.ijse.gdse66.customerservice.dto.VehicleDTO;
import lk.ijse.gdse66.customerservice.entity.VehicleEntity;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Vehicle-Service
 * @since : 10:36 AM - 6/24/2024
 **/
public interface VehicleService {

    void saveVehicle(VehicleDTO vehicleDTO);

    VehicleDTO searchVehicle(String id);

    void updateVehicle(VehicleDTO vehicleDTO);

    void deleteVehicle(String id);

    List<VehicleEntity> loadAllVehicles();
}
