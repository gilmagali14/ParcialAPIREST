package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Libro")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Libro extends Base{

    @Column(name = "fecha")
    private int fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @Column(name = "titulo")
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(name = "libro_autor",
            joinColumns = @JoinColumn(name = "fk_libro"),
            inverseJoinColumns = @JoinColumn(name = "fk_autor"))
    private List<Autor> autores = new ArrayList<Autor>();

}
