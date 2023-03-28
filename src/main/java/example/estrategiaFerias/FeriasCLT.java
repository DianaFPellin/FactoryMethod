package example.estrategiaFerias;

import example.interfaces.IFerias;
import example.interfaces.ISalario;

public class FeriasCLT implements IFerias {

    @Override
    public void calcularFerias() {
        System.out.println("Férias CLT");
    }
}
