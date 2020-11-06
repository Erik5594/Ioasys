package br.erik5594.ioasysapi.dto;

import java.io.Serializable;

/**
 * @author erik_
 * Data Criacao: 05/11/2020 - 20:55
 */
public class JwtRequestDto implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private String email;
    private String password;

    public JwtRequestDto() {
    }

    public JwtRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
