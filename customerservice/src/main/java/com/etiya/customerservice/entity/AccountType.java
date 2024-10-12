package com.etiya.customerservice.entity;

import com.etiya.customerservice.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Account_Types")
public class AccountType extends BaseEntity {
    @Column(name = "name")
    private String name;
}
