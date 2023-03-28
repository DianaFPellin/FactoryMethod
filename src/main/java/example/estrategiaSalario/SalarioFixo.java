package example.estrategiaSalario;

import example.interfaces.ISalario;

public class SalarioFixo implements ISalario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário Fixo");
    }
}
