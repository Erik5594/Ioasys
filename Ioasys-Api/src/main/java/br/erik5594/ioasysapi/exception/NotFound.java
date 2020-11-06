package br.erik5594.ioasysapi.exception;

/**
 * @author erik_
 * Data Criacao: 01/11/2020 - 01:03
 */
public class NotFound extends RuntimeException {
    private String status;
    private String error;

    public NotFound(String status, String error) {
        super(error);
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
