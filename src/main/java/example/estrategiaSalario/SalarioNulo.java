package example.estrategiaSalario;

import example.interfaces.ISalario;

public class SalarioNulo implements ISalario {
    @Override
    public void calcularSalario() {
        System.out.println("Não recebe salário");
    }
}
