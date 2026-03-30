package org.example.base_code.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}