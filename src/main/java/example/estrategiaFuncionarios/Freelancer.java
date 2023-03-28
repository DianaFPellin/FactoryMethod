package example.estrategiaFuncionarios;

import example.estrategiaFerias.FeriasNulas;
import example.Funcionario;
import example.estrategiaSalario.SalarioPorComissao;

public class Freelancer extends Funcionario {
    public Freelancer() {
        salario = new SalarioPorComissao();
        ferias = new FeriasNulas();
    }
}
