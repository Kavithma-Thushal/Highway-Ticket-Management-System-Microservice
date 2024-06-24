package lk.ijse.gdse66.customerservice.service.impl;

import lk.ijse.gdse66.customerservice.dto.PaymentDTO;
import lk.ijse.gdse66.customerservice.entity.PaymentEntity;
import lk.ijse.gdse66.customerservice.repo.PaymentRepo;
import lk.ijse.gdse66.customerservice.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Payment-Service
 * @since : 10:37 AM - 6/24/2024
 **/
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    public ModelMapper modelMapper;

    @Autowired
    public PaymentRepo paymentRepo;

    @Override
    public void savePayment(PaymentDTO paymentDTO) {
        if (!paymentRepo.existsById(paymentDTO.getPayment_id())) {
            paymentRepo.save(modelMapper.map(paymentDTO, PaymentEntity.class));
        }
    }

    @Override
    public PaymentDTO searchPayment(String id) {
        return paymentRepo.findById(id).map(paymentEntity -> modelMapper.map(paymentEntity, PaymentDTO.class)).orElse(null);
    }

    @Override
    public void updatePayment(PaymentDTO paymentDTO) {
        paymentRepo.save(modelMapper.map(paymentDTO, PaymentEntity.class));
    }

    @Override
    public void deletePayment(String id) {
        paymentRepo.deleteById(id);
    }

    @Override
    public List<PaymentEntity> loadAllPayments() {
        return paymentRepo.findAll();
    }
}
