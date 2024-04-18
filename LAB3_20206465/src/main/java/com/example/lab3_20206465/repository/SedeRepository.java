package com.example.lab3_20206465.repository;

import com.example.lab3_20206465.entity.Mascota;
import com.example.lab3_20206465.entity.Sede;
import com.example.lab3_20206465.entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SedeRepository extends JpaRepository<Sede,Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM veterinaria.veterinario where sede_id = ?1")
    List<Veterinario> buscarVeterinarioPorSede(int id);

    @Query(nativeQuery = true, value = "SELECT * FROM veterinaria.mascota where sede_id = ?1")
    List<Mascota> buscarMascotaPorSede(int id);


}
