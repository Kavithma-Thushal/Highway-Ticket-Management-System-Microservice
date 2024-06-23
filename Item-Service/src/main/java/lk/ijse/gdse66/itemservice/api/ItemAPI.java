package lk.ijse.gdse66.itemservice.api;

import lk.ijse.gdse66.itemservice.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Kavithma Thushal
 * @project : Customer-Service
 * @since : 9:47 PM - 6/23/2024
 **/
@RestController
@RequestMapping("/api/v1/item")
public class ItemAPI {

    @Autowired
    public RestTemplate restTemplate;

    @PostMapping("/saveItem")
    public void saveItem(@RequestBody ItemDTO itemDTO) {
        System.out.println(itemDTO.getCode());
        System.out.println(itemDTO.getDescription());
        System.out.println(itemDTO.getUnitPrice());
        System.out.println(itemDTO.getQuantity());
    }

    @GetMapping("/searchItem")
    public String searchItem() {
        return "I00-001, Mouse, 1200, 800";
    }
}