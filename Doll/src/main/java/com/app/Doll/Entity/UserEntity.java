package com.app.Doll.Entity;
// Importations
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
//// End Importations


// End Importations

//// Call Importations
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Users")
public class UserEntity  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Long id_user;
//
    @Column(name = "TypeUser", nullable = false)
    private String TypeDUser;
//
    @Column(name = "TypeDocument", nullable = false)
    private String TypeDocument;
//
    @Column(name = "NumberDocument", nullable = false)
    private Long NumberDocument;
//
    @Column(name = "Name", nullable = false)
    private String Name;
//
    @Column(name = "LastName", nullable = false)
    private String LastName;
//
    @Column(name = "Address", nullable = false)
    private String Address;
//
    @Column(name = "Email", nullable = false)
    private String Email;
//
    @Column(name = "Telephone", nullable = false)
    private Long Telephone ;
//
    @Column(name = "Password", nullable = false)
    private String Password;
//
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_rol", referencedColumnName = "id_rol")
    private RolesEntity fk_id_rol;
}