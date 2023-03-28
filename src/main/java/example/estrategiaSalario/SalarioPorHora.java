package example.estrategiaSalario;

import example.interfaces.ISalario;

public class SalarioPorHora implements ISalario {
    @Override
    public void calcularSalario() {
        System.out.println("Salario por hora");
    }
}
