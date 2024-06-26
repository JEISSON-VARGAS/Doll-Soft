package com.app.Doll.Entity;
// Importations
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
// End Importations


// Call Importations
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Roles")
public class RolesEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private Long id_rol;
//
    @Column(name = "Rol", nullable = false)
    private String Rol;

}
