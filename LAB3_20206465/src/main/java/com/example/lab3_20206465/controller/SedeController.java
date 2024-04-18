package com.example.lab3_20206465.controller;

import com.example.lab3_20206465.entity.Mascota;
import com.example.lab3_20206465.entity.Sede;
import com.example.lab3_20206465.entity.Veterinario;
import com.example.lab3_20206465.repository.MascotaRepository;
import com.example.lab3_20206465.repository.SedeRepository;
import com.example.lab3_20206465.repository.VeterinarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/sede")
public class SedeController {

    final SedeRepository sedeRepository;
    final VeterinarioRepository veterinarioRepository;
    final MascotaRepository mascotaRepository;

    public SedeController(SedeRepository sedeRepository, VeterinarioRepository veterinarioRepository, MascotaRepository mascotaRepository) {
        this.sedeRepository = sedeRepository;
        this.veterinarioRepository = veterinarioRepository;
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping("/listarSedes")
    public String listarSedes(Model model){


        List<Sede> sedeList = sedeRepository.findAll();

        model.addAttribute("listaSede", sedeList);

        return "listarSedes";
    }


    @PostMapping("/buscarVeterinarioPorSede")
    public String buscarVeterinariaPorSede(@RequestParam("id") int idsede, Model model) {

        List<Veterinario> lista = veterinarioRepository.buscarVeterinarioPorSede(idsede);
        model.addAttribute("veterinarioList", lista);

        return "shipper/list";
    }

    @PostMapping("/buscarMascotaPorSede")
    public String buscarMascotaPorNombre(@RequestParam("id") int idsede, Model model) {

        List<Mascota> lista = mascotaRepository.buscarMascotaPorSede(idsede);
        model.addAttribute("mascotaList", lista);

        return "shipper/list";
    }
}
