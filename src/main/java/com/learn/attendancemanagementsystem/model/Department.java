package com.learn.attendancemanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "department")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = false)
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<User> users;
}