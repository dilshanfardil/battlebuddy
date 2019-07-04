package lk.avalanche.battlebuddy.entity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/23/2019
 * Time: 11:43 PM}
 */

@Entity
@Table(name = "user")
public class User {
    public static BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder(11);

    @Id
    @GeneratedValue()
    @Column(name = "user_id")
    private int UserId;

    @Column(name = "name")
    private String name;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(String name, String userName, String password) {
        this.name = name;
        this.username = userName;
        setPassword(password);
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = passwordEncoder.encode(password);
    }
}
