package com.example.lab3_20206465.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="sede")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id", nullable = false)
    private Integer idsede;

    @Getter @Setter @Column(name="nombre", nullable = false, length = 50)
    private String nombresede;

    @Getter @Setter @Column(name="direccion", nullable = false, length = 100)
    private String direccionsede;

    @Getter @Setter @Column(name="telefono", nullable = false, length = 45)
    private String telefonosede;

}
