package com.example.InfoTec.controller;

import com.example.InfoTec.pecas.Pecas;

public record PecasReponseDTO(Long id, String title, String image, Integer price) {

    public PecasReponseDTO(Pecas pecas){
        this(pecas.getId(), pecas.getTitle(), pecas.getImage(), pecas.getPrice());
    }
}
