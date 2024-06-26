package com.app.Doll.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {
    private Long id_user;
    private String TypeDocument;
    private Long NumberDocument;
    private String Name;
    private String LastName;
    private String Address;
    private String Email;
    private Long Telephone ;
    private String Password;

}







