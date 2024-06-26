package com.app.Doll.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompaniesDto {
    private Long id_company;
    private Long Nit;
    private String Name;
    private Long Address;
    private Long Telephone;
    private String Email;
    private Long Status;

}
