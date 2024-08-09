package org.bd.demo.services;

import org.bd.demo.dtos.BankAccountDTO;
import org.bd.demo.dtos.CurrentBankAccountDTO;
import org.bd.demo.dtos.CustomerDTO;
import org.bd.demo.dtos.SavingBankAccountDTO;
import org.bd.demo.entities.BankAccount;
import org.bd.demo.exceptions.BalanceNotSufficientException;
import org.bd.demo.exceptions.BankAccountNotFoundException;
import org.bd.demo.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;

    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void  credit( String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long id);
}
