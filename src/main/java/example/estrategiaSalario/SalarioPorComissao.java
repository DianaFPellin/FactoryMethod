package example.estrategiaSalario;

import example.interfaces.ISalario;

public class SalarioPorComissao implements ISalario {
    @Override
    public void calcularSalario() {
        System.out.println("Salario por comissão");
    }
}
