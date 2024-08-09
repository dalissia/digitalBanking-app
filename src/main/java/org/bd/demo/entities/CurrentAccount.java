package org.bd.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bd.demo.dtos.CustomerDTO;
import org.bd.demo.enums.AccountStatus;

import java.util.Date;


@Entity
@DiscriminatorValue("CA")
@Data @NoArgsConstructor @AllArgsConstructor
public class CurrentAccount extends BankAccount {

    private double overDraft;
}