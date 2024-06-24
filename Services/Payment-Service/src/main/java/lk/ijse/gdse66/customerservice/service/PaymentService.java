package lk.ijse.gdse66.customerservice.service;

import lk.ijse.gdse66.customerservice.dto.PaymentDTO;
import lk.ijse.gdse66.customerservice.entity.PaymentEntity;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Payment-Service
 * @since : 10:36 AM - 6/24/2024
 **/
public interface PaymentService {

    void savePayment(PaymentDTO paymentDTO);

    PaymentDTO searchPayment(String id);

    void updatePayment(PaymentDTO paymentDTO);

    void deletePayment(String id);

    List<PaymentEntity> loadAllPayments();
}
