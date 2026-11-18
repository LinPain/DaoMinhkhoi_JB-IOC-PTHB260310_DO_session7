package com.quickbite.paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentHealthController {
    @GetMapping("/payments/health")
    public String health() {
        return "payment-service is running";
    }
}
