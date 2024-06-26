package com.app.Doll.Entity;
// Importations
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
// End Importations


// Call Importations
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Tasks")
// End Importations
public class TasksEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_task", nullable = false)
    private Long id_task;

    @Column(name = "Description", nullable = false)
    private String Description;

    @Column(name = "DateAssignment", nullable = false)
    private LocalDate  DateAssignment;

    @Column(name = "DateLimit", nullable = false)
    private LocalDate  DateLimit;

    @Column(name = "Status", nullable = false)
    private String  Status;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_user", referencedColumnName = "id_user")
    private UserEntity fk_id_user;

}
