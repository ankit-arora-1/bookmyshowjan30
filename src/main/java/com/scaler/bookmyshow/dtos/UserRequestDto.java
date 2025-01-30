package com.scaler.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

public class UserRequestDto {
    private String name;
    private String email;
    private String passowrd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
