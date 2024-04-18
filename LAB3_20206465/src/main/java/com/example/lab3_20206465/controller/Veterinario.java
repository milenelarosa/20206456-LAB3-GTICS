package com.example.lab3_20206465.controller;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="veterinario")
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id", nullable = false)
    private Integer idveterinario;

    @Getter @Setter @Column(name="nombre", nullable = false, length = 50)
    private String nombreveterinario;

    @Getter @Setter @Column(name="correo", nullable = false, length = 50)
    private String correoveterinario;
}
