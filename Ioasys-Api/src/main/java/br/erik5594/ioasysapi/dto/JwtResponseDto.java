package br.erik5594.ioasysapi.dto;

import java.io.Serializable;

/**
 * @author erik_
 * Data Criacao: 05/11/2020 - 20:56
 */
public class JwtResponseDto implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponseDto(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getJwttoken() {
        return jwttoken;
    }
}
