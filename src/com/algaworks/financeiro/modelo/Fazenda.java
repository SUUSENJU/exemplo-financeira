package com.algaworks.financeiro.modelo;

public class Fazenda extends Empresa {
    public static final double LIMITE_APROVACAO_FINANCIAMENTO = 3000000;
    private double tamanhoEmHectares;

    public Fazenda(String razaoSocial, double totalFaturamento, double tamanhoEmHectares) {
        super(razaoSocial, totalFaturamento);
        this.tamanhoEmHectares = tamanhoEmHectares;
    }

    public double getTamanhoEmHectares() {
        return tamanhoEmHectares;
    }

    public void setTamanhoEmHectares(double tamanhoEmHectares) {
        this.tamanhoEmHectares = tamanhoEmHectares;
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }

    @Override
    public double calcularJuros(double valorSocilitado) {
        return 0;
    }
}
