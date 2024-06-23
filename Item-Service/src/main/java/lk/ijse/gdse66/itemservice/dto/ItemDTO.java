package lk.ijse.gdse66.itemservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Kavithma Thushal
 * @project : Customer-Service
 * @since : 9:49 PM - 6/23/2024
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDTO {
    private String code;
    private String description;
    private String unitPrice;
    private String quantity;
}
