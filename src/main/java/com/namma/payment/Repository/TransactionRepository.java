//package com.namma.payment.Repository;
//
//import com.namma.payment.Model.Transaction;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.List;
//
//public interface TransactionRepository extends JpaRepository<Transaction, String> {
//    List<Transaction> findTop5ByUserIdOrderByTimestampDesc(String userId);
//}
//
