package org.bd.demo.web;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bd.demo.dtos.CustomerDTO;
import org.bd.demo.exceptions.CustomerNotFoundException;
import org.bd.demo.services.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")

public class CustomerRestController {
    private BankAccountService bankAccountService;

    @GetMapping("/customers")
    public List<CustomerDTO> customers(){
        return bankAccountService.listCustomers();
    }

    @GetMapping("/customers/{id}")
    public CustomerDTO getCustomer(@PathVariable(name="id") Long  customerId) throws CustomerNotFoundException{
        return  bankAccountService.getCustomer(customerId);
    }

    @PostMapping("/customers")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        return bankAccountService.saveCustomer(customerDTO);
    }

    @PutMapping("/customers/{customerId}")
    public CustomerDTO updateCustomer(@PathVariable Long customerId, @RequestBody CustomerDTO customerDTO){
        customerDTO.setId(customerId);
        return bankAccountService.updateCustomer(customerDTO);
    }

    @DeleteMapping ("/customers/{id}")
    public void deleteCustomer(@PathVariable  Long id){
        bankAccountService.deleteCustomer(id);
    }
    }




