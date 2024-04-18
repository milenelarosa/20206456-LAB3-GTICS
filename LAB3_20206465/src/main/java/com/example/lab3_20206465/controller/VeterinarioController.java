package com.example.lab3_20206465.controller;

import com.example.lab3_20206465.entity.Mascota;
import com.example.lab3_20206465.entity.Veterinario;
import com.example.lab3_20206465.repository.VeterinarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/veterinarios")
public class VeterinarioController {

    final VeterinarioRepository veterinarioRepository;

    public VeterinarioController(VeterinarioRepository veterinarioRepository) {
        this.veterinarioRepository = veterinarioRepository;
    }

    @GetMapping("/listarVeterinario")
    public String listarVeterinario(Model model){

        List<Veterinario> veterinarioList = veterinarioRepository.findAll();
        model.addAttribute("listaveterinario", veterinarioList);

        return "listaVeterinarios";
    }
}
