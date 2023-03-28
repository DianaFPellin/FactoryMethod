package example.estrategiaFuncionarios;

import example.estrategiaFerias.FeriasCLT;
import example.Funcionario;
import example.estrategiaSalario.SalarioFixo;

public class HomeOffice extends Funcionario {
    public HomeOffice() {
        salario = new SalarioFixo();
        ferias = new FeriasCLT();
    }
}
