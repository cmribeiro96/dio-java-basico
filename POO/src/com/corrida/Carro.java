package com.corrida;

public class Carro extends Veiculo{
    private String chassi;
    public String getChassi(){
        return chassi;
    };
    public void setChassi(String args) {
        this.chassi = chassi;
    }
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel(){
        System.out.println("conferindo combustível");
    }
    private void confereCambio(){
        System.out.println("conferindo câmbio em P");
    }
}
