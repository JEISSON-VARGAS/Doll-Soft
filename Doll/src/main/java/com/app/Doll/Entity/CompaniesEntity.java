package com.app.Doll.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Companies")

public class CompaniesEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company", nullable = false)
    private Long id_company;

    @Column(name = "Nit", nullable = false)
    private Long Nit;

    @Column(name = "Name", nullable = false)
    private String Name;

    @Column(name = "Address", nullable = false)
    private Long Address;

    @Column(name = "Telephone", nullable = false)
    private Long Telephone;

    @Column(name = "Email", nullable = false)
    private String Email;

    @Column(name = "Status", nullable = false)
    private Long Status;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_user", referencedColumnName = "id_user")
    private UserEntity fk_id_user;
}
