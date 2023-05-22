package maquina;

import datos.InterfazDatos;

public class DecoratorMaquinaA extends DecoratorMaquina{
    public DecoratorMaquinaA(InterfazMaquina maquina) {
        super(maquina);
    }


    @Override
    public void run(InterfazDatos datos) {
        if (maquinaDecorada.getDatos().isStuck()) {
            System.out.println("Maquina A esta atascada");
        } else {
            System.out.println("Maquina A esta funcionando");
        }
    }

    @Override
    public InterfazDatos getDatos() {
        return null;
    }

    @Override
    public void setMaquina(InterfazMaquina maquina) {

    }
}
