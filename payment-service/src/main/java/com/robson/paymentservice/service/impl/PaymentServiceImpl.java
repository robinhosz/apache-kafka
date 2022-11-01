package com.robson.paymentservice.service.impl;

import com.robson.paymentservice.model.Payment;
import com.robson.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Payment receive {}", payment);
    }
}
