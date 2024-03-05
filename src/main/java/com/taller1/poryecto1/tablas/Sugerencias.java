package com.taller1.poryecto1.tablas;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "estudiantes")

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Sugerencias {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String descripcion;
    @Temporal(TemporalType.DATE)
    private LocalDateTime create_at;

    @ManyToOne()
    @JoinColumn(name = "usuario",nullable = false)
    private Usuarios usuario;
}
