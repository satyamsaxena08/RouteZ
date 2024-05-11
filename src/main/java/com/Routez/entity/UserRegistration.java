package com.Routez.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_registration")
public class UserRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;
    @Lob  //this annotation is use for image uploading
    @Column(name = "profile_picture" , length = 100024)
    private byte[] profilePicture; //data type of file uploading is suppose to be byte array
}
