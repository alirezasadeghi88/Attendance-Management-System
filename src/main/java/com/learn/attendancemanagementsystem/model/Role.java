package com.learn.attendancemanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(updatable = true, unique = false)
    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<User> users;
}
