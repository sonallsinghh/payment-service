package com.namma.payment.Service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {
    private String userId;
    private String username;
    private String status;
}
