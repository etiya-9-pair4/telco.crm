package com.etiya.customerservice.entity;

import com.etiya.customerservice.core.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Contacts")
//TODO: rename!
public class Contact extends BaseEntity {

    @Column(name = "email")
    private String email;
    @Column(name = "mobile_phone")
    private String mobilePhone;
    @Column(name = "home_phone")
    private String homePhone;
    @Column(name = "fax_number")
    private String faxNumber;

    //private List<Customer> customers;


}
