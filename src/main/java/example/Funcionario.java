package example;

import example.interfaces.IFerias;
import example.interfaces.ISalario;

public abstract class Funcionario {
    //Agregação com campo do tipo da estratégia criada pera gerenciar salários
    protected ISalario salario;
    protected IFerias ferias;
    //Atributos e métodos diversos relacionados ao funcionário
    public void calcularSalario() {
        salario.calcularSalario();
    }

    public void calcularFerias() {
        ferias.calcularFerias();
    }
}
