package com.endmodul4.repository;

import com.endmodul4.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
//    @Query("SELECT t FROM Transaction t WHERE t.customer.name LIKE %:keyword% OR t.serviceType LIKE %:keyword%")
//    Page<Transaction> searchByCustomerNameOrServiceType(String keyword, Pageable pageable);
}