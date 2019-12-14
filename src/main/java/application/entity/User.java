package application.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private String mail;
    private String password;
    private String pic_url;
    private String user_name;
    private String gender;
    private String country;
    private int age;
    private String phone;


}

