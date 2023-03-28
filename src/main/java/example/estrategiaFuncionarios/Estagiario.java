package example.estrategiaFuncionarios;

import example.estrategiaFerias.FeriasCLT;
import example.Funcionario;
import example.estrategiaSalario.SalarioPorHora;

public class Estagiario extends Funcionario {
    public Estagiario() {
        salario = new SalarioPorHora();
        ferias = new FeriasCLT();
    }
}