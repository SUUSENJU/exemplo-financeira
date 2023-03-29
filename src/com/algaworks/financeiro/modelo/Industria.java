package com.algaworks.financeiro.modelo;

public class Industria extends Empresa {
    private boolean compensaEmissaoDeCo2;

    public boolean isCompensaEmissaoDeCo2() {
        return compensaEmissaoDeCo2;
    }

    public void setCompensaEmissaoDeCo2(boolean compensaEmissaoDeCo2) {
        this.compensaEmissaoDeCo2 = compensaEmissaoDeCo2;
    }

    public Industria(String razaoSocial, double totalFaturamento, boolean compensaEmissaoDeCo2){
        super(razaoSocial, totalFaturamento);
        this.compensaEmissaoDeCo2 = compensaEmissaoDeCo2;
    }

    public double calcularLimiteAprovado(){
        return 0;
    }

    @Override
    public double calcularJuros(double valorSocilitado) {
        return 0;
    }

}
