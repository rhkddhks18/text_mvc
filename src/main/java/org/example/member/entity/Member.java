package org.example.member.entity;

public class Member {
    private long id;
    private String userId;
    private String password;
    private String regDate;

    public Member(String userId, String password, String regDate) {
        this.userId = userId;
        this.password = password;
        this.regDate = regDate;
    }

    public long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
