package com.example.demo1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "buku")
public class Buku {
    @Id
    private String isbn;

    private String isbn13;

    @Column(nullable = false)
    private String judul;

    @Column
    private String pengarang2;
    
}
