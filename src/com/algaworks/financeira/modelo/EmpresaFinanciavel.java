package com.algaworks.financeira.modelo;

public abstract class EmpresaFinanciavel extends Empresa implements ClienteFinanciavel {

    public static final double JUROS_MEDIO_RISCO = 1.0;
    public static final double JUROS_ALTO_RISCO = 1.5;

    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPeqeunoValor(valorSolicitado)){
            return JUROS_MEDIO_RISCO;
        } else if (isFinaciamentoGrandeValor(valorSolicitado)) {
            return JUROS_ALTO_RISCO;
        }
        return 2.0;
    }

    static boolean isFinaciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    static boolean isFinanciamentoPeqeunoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}
