package br.erik5594.ioasysapi.exception;

/**
 * @author erik_
 * Data Criacao: 31/10/2020 - 22:29
 */
public class Validation extends RuntimeException {
    private int status;
    private String error;

    public Validation(int status, String error) {
        super(error);
        this.status = status;
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
