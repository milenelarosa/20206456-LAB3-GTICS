package com.example.lab3_20206465.repository;

import com.example.lab3_20206465.controller.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends JpaRepository<Sede,Integer> {

}
