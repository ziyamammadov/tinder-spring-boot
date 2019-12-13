package entity;

public class User {
    private final int id;
    private final String surname;
    private final String name;
    private final String email;
    private final String password;
    private final String picUrl;
//    private EmptyPhoto empty_pic;


    public User(int id, String name, String surname, String email, String password, String picUrl) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.picUrl = picUrl;
    }

    public User(int id, String name, String surname, String email, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.picUrl = "https://icon-library.net/images/no-profile-pic-icon/no-profile-pic-icon-5.jpg";
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPicUrl() {
        return picUrl;
    }
}

