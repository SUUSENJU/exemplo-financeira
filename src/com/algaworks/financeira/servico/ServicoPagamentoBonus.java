package com.algaworks.financeira.servico;

import com.algaworks.financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada){
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);
    }

}
