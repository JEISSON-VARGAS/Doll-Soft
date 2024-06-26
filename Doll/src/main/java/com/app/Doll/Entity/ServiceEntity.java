package com.app.Doll.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table (name = "Services")
public class ServiceEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service", nullable = false)
    private Long id_service;
//
    @Column(name = "NameService", nullable = false)
    private String NameService;
//
    @Column(name = "DateStart", nullable = false)
    private LocalDate DateStart;
//
    @Column(name = "DateFinish", nullable = false)
    private LocalDate DateFinish;
//
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_user", referencedColumnName = "id_user")
    private UserEntity fk_id_user;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_company", referencedColumnName = "id_company")
    private CompaniesEntity fk_id_company;
}
