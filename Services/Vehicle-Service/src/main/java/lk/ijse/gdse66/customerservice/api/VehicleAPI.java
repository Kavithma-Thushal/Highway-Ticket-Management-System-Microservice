package lk.ijse.gdse66.customerservice.api;

import lk.ijse.gdse66.customerservice.dto.VehicleDTO;
import lk.ijse.gdse66.customerservice.entity.VehicleEntity;
import lk.ijse.gdse66.customerservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Vehicle-Service
 * @since : 9:47 PM - 6/23/2024
 **/
@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleAPI {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public VehicleService vehicleService;

    @PostMapping("/saveVehicle")
    public void saveVehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.saveVehicle(vehicleDTO);
    }

    @GetMapping("/searchVehicle/{id}")
    public VehicleDTO searchVehicle(@PathVariable String id) {
        return vehicleService.searchVehicle(id);
    }

    @PutMapping("/updateVehicle")
    public void updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.updateVehicle(vehicleDTO);
    }

    @DeleteMapping("/deleteVehicle/{id}")
    public void deleteVehicle(@PathVariable String id) {
        vehicleService.deleteVehicle(id);
    }

    @GetMapping("/loadAllVehicles")
    public List<VehicleEntity> loadAllVehicles() {
        return vehicleService.loadAllVehicles();
    }
}