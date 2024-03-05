package com.taller1.poryecto1.tablas;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Lazy;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "partidas")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Partidas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String creador;
    @Column
    private String deporte;
    @Column
    private String ciudad;
    @Column
    private String provincia;
    @Temporal(TemporalType.DATE)
    private LocalDateTime fecha;
    @Temporal(TemporalType.TIME)
    private LocalDateTime hora_comienzo;
    @Temporal(TemporalType.TIME)
    private LocalDateTime hora_final;
    @Column
    private Integer participantes;
    @Column
    private Integer suplentes;
    @Column
    private String comentarios;

    @ManyToMany(mappedBy = "partidas")
    private List<Usuarios> usuarios;
}
