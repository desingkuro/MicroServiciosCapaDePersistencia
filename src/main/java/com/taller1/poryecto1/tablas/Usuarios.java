package com.taller1.poryecto1.tablas;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "usuarios")

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private Integer edad;
    @Column
    private String password;
    @Column
    private String re_password;
    @Column
    private Boolean enable;
    @Column
    private String foto;
    @Column
    private String rol;
    @Temporal(TemporalType.DATE)
    private LocalTime create_at;

    @OneToMany(mappedBy = "usuario")
    private List<Sugerencias> sugerencias;

    @ManyToMany()
    @JoinTable(name = "usuarios_partidas", joinColumns = @JoinColumn(name = "idUsuarios",referencedColumnName = "id"),inverseJoinColumns=@JoinColumn(name = "idPartida",referencedColumnName = "id"))
    private List<Partidas> partidas;

    @OneToMany(mappedBy = "usuario")
    private List<Mensajes> mensajes;


}
