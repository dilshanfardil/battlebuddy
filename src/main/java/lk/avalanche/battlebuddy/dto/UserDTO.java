package lk.avalanche.battlebuddy.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/24/2019
 * Time: 10:00 PM}
 */


public class UserDTO extends SuperDTO {

    private int UserId;
    private String name;
    private String userName;
    private String password;

    public UserDTO() {
    }

    public UserDTO(int userId, String name, String userName, String password) {
        UserId = userId;
        this.name = name;
        this.userName = userName;
        this.password = password;
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
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
