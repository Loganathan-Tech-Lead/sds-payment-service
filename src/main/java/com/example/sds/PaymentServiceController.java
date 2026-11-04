package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "Payment service" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class PaymentServiceController {
    @GetMapping("/demo/payment-service")
    public Map<String, String> demo() {
        return Map.of("concept", "Payment service", "status", "scaffold - implement me");
    }
}
