package com.app.Doll.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDto {
    private Long id_service;
    private String NameService;
    private LocalDate DateStart;
    private LocalDate DateFinish;
}
