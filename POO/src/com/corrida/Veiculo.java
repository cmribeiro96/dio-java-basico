package com.corrida;

public abstract class Veiculo {
    private String chassi;
    public String getChassi(){
        return chassi;
    };
    public void setChassi(String args) {
        this.chassi = chassi;
    }
    public abstract void ligar();
}
