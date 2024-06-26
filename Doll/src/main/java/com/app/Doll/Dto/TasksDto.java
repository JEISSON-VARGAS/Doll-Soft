package com.app.Doll.Dto;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TasksDto {
    private Long id_task;
    private String Description;
    private LocalDate DateAssignment;
    private LocalDate  DateLimit;
    private String  Status;
}
