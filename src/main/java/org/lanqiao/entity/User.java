package org.lanqiao.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String mail;

    private Date birthday;

    public User(Integer id, String username, String password, Integer age, String mail, Date birthday) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.mail = mail;
		this.birthday = birthday;
	}

	public User(String username, String password, Integer age, String mail, Date birthday) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.mail = mail;
		this.birthday = birthday;
	}

	public User() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}