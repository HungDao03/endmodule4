package com.endmodul4.service;

import com.endmodul4.model.Transaction;

import java.util.List;

public interface ITransactionService extends IGenerateService<Transaction> {
    List<Transaction> searchByCustomerNameOrServiceType(String keyword);
}
