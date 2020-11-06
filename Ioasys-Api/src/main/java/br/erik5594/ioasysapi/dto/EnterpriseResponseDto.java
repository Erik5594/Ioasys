package br.erik5594.ioasysapi.dto;

/**
 * @author erik_
 * Data Criacao: 31/10/2020 - 23:56
 */
public class EnterpriseResponseDto {

    private EnterpriseDto enterprise;
    private boolean success;

    public EnterpriseResponseDto(EnterpriseDto enterprise) {
        this.enterprise = enterprise;
        this.success = true;
    }

    public EnterpriseDto getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseDto enterprise) {
        this.enterprise = enterprise;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
