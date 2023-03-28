package example.estrategiaFuncionarios;

import example.estrategiaFerias.FeriasNulas;
import example.Funcionario;
import example.estrategiaSalario.SalarioNulo;

public class Voluntario extends Funcionario {
    public Voluntario() {
        salario = new SalarioNulo();
        ferias = new FeriasNulas();

    }
}
