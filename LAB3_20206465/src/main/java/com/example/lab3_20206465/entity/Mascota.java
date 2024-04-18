package com.example.lab3_20206465.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id", nullable = false)
    private Integer idmascota;

    @Getter @Setter @Column(name="nombre", nullable = false, length = 45)
    private String nombremascota;

    @Getter @Setter @Column(name="edad", nullable = false)
    private Integer edadmascota;

    @Getter @Setter @Column(name="genero", nullable = false, length = 45)
    private String generomascota;

    @Getter @Setter @Column(name="diagnostico", nullable = false, length = 100)
    private String diagnostico;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Getter @Setter @Column(name="fecha_cita", nullable = false)
    private LocalDate fechacita;

    @Getter @Setter @Column(name="numero_consultorio", nullable = false)
    private Integer numconsultorio;

}
