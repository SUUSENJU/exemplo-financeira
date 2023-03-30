import com.algaworks.financeira.modelo.Fazenda;
import com.algaworks.financeira.modelo.Funcionario;
import com.algaworks.financeira.modelo.PessoaBonificavel;

public class Principal2 {

    public static void main(String[] args) {
//        Fazenda fazenda = new Fazenda("Raio de luz", 1_000_000, 5);
//        fazenda.calcularBonus();

        PessoaBonificavel funcionario = new Funcionario("Matheus Moura", 5000);
        funcionario.calcularBonus(80);
    }

}
