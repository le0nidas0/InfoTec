package com.example.InfoTec.controller;


import com.example.InfoTec.pecas.Pecas;
import com.example.InfoTec.pecas.PecasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pecas")

public class InfoTecController {

    @Autowired
    private PecasRepository repository;
    @GetMapping
    public List getAll() {

        List<Pecas> pecasList = repository.findAll();
        return pecasList;
    }
}
