//package com.namma.payment.Service;
//
//import com.namma.payment.Model.Transaction;
//import com.namma.payment.Repository.TransactionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PaymentHistoryService {
//    @Autowired
//    private TransactionRepository transactionRepository;
//
//    public List<Transaction> getPaymentHistory(String userId) {
//        return transactionRepository.findTop5ByUserIdOrderByTimestampDesc(userId);
//    }
//}
//
