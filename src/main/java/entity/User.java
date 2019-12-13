package entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private long id;
    private String name;
    private String surname;
    private  String mail;
    private String password;
    private String pic_url;
    private String user_name;
    private String gender;
    private String country;
    private int age;
    private String phone;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getMail() { return mail; }

    public void setMail(String mail) { this.mail = mail; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getPic_url() { return pic_url; }

    public void setPic_url(String pic_url) { this.pic_url = pic_url; }

    public String getUser_name() { return user_name; }

    public void setUser_name(String user_name) { this.user_name = user_name; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }
}

