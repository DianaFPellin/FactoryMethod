package example.estrategiaFuncionarios;

import example.estrategiaFerias.FeriasCLT;
import example.Funcionario;
import example.estrategiaSalario.SalarioFixo;

public class Contratado extends Funcionario {
    public Contratado() {
        salario = new SalarioFixo();
        ferias = new FeriasCLT();
    }
}
