package com.algaworks.financeiro.modelo;

public abstract class Empresa {
    private String razaoSocial;
    private double totalFaturamento;

    public Empresa(String razaoSocial, double totalFaturamento) {
        this.razaoSocial = razaoSocial;
        this.totalFaturamento = totalFaturamento;
    }

    public abstract double calcularLimiteAprovado();

    public abstract double calcularJuros(double valorSocilitado);
}
