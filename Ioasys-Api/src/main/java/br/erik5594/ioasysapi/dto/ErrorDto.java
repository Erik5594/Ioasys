package br.erik5594.ioasysapi.dto;

/**
 * @author erik_
 * Data Criacao: 01/11/2020 - 01:00
 */
public class ErrorDto {

    private String status;
    private String error;

    public ErrorDto(String status, String error) {
        this.status = status;
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
