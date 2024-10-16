package com.etiya.customerservice.core.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
//TODO: id should be auto incremented
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
    @Column(name = "deleted_date")
    private LocalDateTime deletedDate;
}
