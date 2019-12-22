package application.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String username;
    private String password;
    private String pic;
    private String gender;
    private String country;
    private Date birthDate;
    private String roles;

    @Transient
    private final String ROLES_DELIMITER = ":";

    public User(String username, String password, String... roles) {
        this.username = username;
        this.password = password;
        setRoles(roles);
    }

    public String[] getRoles() {
        if (this.roles == null || this.roles.isEmpty()) return new String[]{};
        return this.roles.split(ROLES_DELIMITER);
    }

    private void setRoles(String[] roles) {
        this.roles = String.join(ROLES_DELIMITER, roles);
    }
}

