package com.etiya.customerservice.entity;

import com.etiya.customerservice.core.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor TODO: why we didn't use noargs?
@Entity
@Table(name = "Customers")
@Inheritance(strategy = InheritanceType.JOINED)
//TODO: add relations
public class Customer extends BaseEntity {
//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL) //cascade olacak mı?
//    private List<Address> addresses;

    //private Contac contact;
    //TODO: rename!

}
