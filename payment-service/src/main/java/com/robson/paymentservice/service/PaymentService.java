package com.robson.paymentservice.service;

import com.robson.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
