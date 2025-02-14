package com.namma.payment.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {
    private String userId;
    private String paymentMethod;
}

