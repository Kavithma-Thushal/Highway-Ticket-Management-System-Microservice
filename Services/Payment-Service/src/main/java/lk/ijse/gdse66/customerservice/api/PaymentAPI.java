package lk.ijse.gdse66.customerservice.api;

import lk.ijse.gdse66.customerservice.dto.PaymentDTO;
import lk.ijse.gdse66.customerservice.entity.PaymentEntity;
import lk.ijse.gdse66.customerservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Payment-Service
 * @since : 9:47 PM - 6/23/2024
 **/
@RestController
@RequestMapping("/api/v1/payment")
public class PaymentAPI {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public PaymentService paymentService;

    @PostMapping("/savePayment")
    public void savePayment(@RequestBody PaymentDTO paymentDTO) {
        paymentService.savePayment(paymentDTO);
    }

    @GetMapping("/searchPayment/{id}")
    public PaymentDTO searchPayment(@PathVariable String id) {
        return paymentService.searchPayment(id);
    }

    @PutMapping("/updatePayment")
    public void updatePayment(@RequestBody PaymentDTO paymentDTO) {
        paymentService.updatePayment(paymentDTO);
    }

    @DeleteMapping("/deletePayment/{id}")
    public void deletePayment(@PathVariable String id) {
        paymentService.deletePayment(id);
    }

    @GetMapping("/loadAllPayments")
    public List<PaymentEntity> loadAllPayments() {
        return paymentService.loadAllPayments();
    }
}