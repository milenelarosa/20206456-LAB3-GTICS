package com.example.lab3_20206465.controller;

import com.example.lab3_20206465.entity.Mascota;
import com.example.lab3_20206465.entity.Sede;
import com.example.lab3_20206465.repository.MascotaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/mascotas")
public class MascotaController {
    final MascotaRepository mascotaRepository;

    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping("/listarMascota")
    public String listarSedes(Model model){

        List<Mascota> mascotaList = mascotaRepository.findAll();
        model.addAttribute("listamascota", mascotaList);

        return "listaMascotas";
    }

}
