package com.example.InfoTec.controller;


import com.example.InfoTec.pecas.Pecas;
import com.example.InfoTec.pecas.PecasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pecas")

public class InfoTecController {

    @Autowired
    private PecasRepository repository;
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void savePecas(@RequestBody PecasRequestDTO data){
        Pecas pecasData = new Pecas(data);
        repository.save(pecasData);
        return;
    }

    @GetMapping
    public List<PecasReponseDTO> getAll() {

        List<PecasReponseDTO> pecasList = repository.findAll().stream().map(PecasReponseDTO::new).toList();
        return pecasList;
    }
}
