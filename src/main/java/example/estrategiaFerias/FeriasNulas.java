package example.estrategiaFerias;

import example.interfaces.IFerias;

public class FeriasNulas implements IFerias {

    @Override
    public void calcularFerias() {
        System.out.println("Férias Nulas");
    }
}