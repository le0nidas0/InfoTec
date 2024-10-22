package com.example.InfoTec.pecas;

import jakarta.persistence.*;

@Table(name = "pecas")
@Entity(name = "pecas")
public class Pecas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
