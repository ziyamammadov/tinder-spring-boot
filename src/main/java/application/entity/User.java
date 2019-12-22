package application.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String mail;
    private String password;
    private String pic;
    private String gender;
    private String country;
    private Date birthdate;
    private String roles;

    @Transient
    private final String ROLES_DELIMITER = ":";

    public User(String username, String password, String... roles) {  //change username into mail
        this.username = username;
        this.password = password;
        setRoles(roles);
    }

    public String[] getRoles() {
        if (this.roles == null || this.roles.isEmpty()) return new String[]{};
        return this.roles.split(ROLES_DELIMITER);
    }

    public void setRoles(String[] roles) {
        this.roles = String.join(ROLES_DELIMITER, roles);
    }
}

