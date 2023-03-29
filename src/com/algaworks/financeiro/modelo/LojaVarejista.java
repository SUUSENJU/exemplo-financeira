package com.algaworks.financeiro.modelo;

public class LojaVarejista extends Empresa {
    private double valorTotalEstoque;

    public LojaVarejista(String razaoSocial, double totalFaturamento, double valorTotalEstoque) {
        super(razaoSocial, totalFaturamento);
        this.valorTotalEstoque = valorTotalEstoque;
    }

    public double getValorTotalEstoque() {
        return valorTotalEstoque;
    }

    public void setValorTotalEstoque(double valorTotalEstoque) {
        this.valorTotalEstoque = valorTotalEstoque;
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
