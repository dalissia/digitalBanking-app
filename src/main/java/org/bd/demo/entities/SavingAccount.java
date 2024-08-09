package org.bd.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bd.demo.dtos.CustomerDTO;
import org.bd.demo.enums.AccountStatus;

import java.util.Date;


@Entity
@DiscriminatorValue("SA")
@Data @NoArgsConstructor @AllArgsConstructor
public class SavingAccount extends BankAccount {

    private double interestRate;
}