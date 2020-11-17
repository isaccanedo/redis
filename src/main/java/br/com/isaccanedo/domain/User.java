package br.com.isaccanedo.domain;

import java.io.Serializable;

/**
 * @author Isac Canedo
 */
public class User implements Serializable{
    private static final long serialVersionUID = -5720806027779615048L;
    private String userName;
    private Integer age;

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
