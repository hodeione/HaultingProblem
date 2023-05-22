package maquina;

import datos.InterfazDatos;

public class DecoratoMaquinaH extends DecoratorMaquina {

public DecoratoMaquinaH(InterfazMaquina maquinaDecorada) {
        super(maquinaDecorada, maquinaDecorada.getDatos());
    }

    @Override
    public void run(InterfazDatos datos) {
        if (maquinaDecorada.getDatos().isStuck()) {
            System.out.println("Maquina H esta atascada");
        } else {
            System.out.println("Maquina H esta funcionando");
        }
    }

    @Override
    public InterfazDatos getDatos() {
        return null;
    }

    @Override
    public void setMaquina(InterfazMaquina maquina) {
        this.maquinaDecorada = maquina;
    }

}
