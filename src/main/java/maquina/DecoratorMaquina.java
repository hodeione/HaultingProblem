package maquina;

import datos.InterfazDatos;

public abstract class DecoratorMaquina extends AbstractMaquina implements InterfazMaquinaDecorator{

    protected InterfazMaquina maquinaDecorada;

    public DecoratorMaquina(InterfazMaquina maquinaDecorada, InterfazDatos datos) {
        super(datos);
        this.maquinaDecorada = maquinaDecorada;
    }

    public DecoratorMaquina(InterfazMaquina maquina) {
        super( maquina.getDatos());
    }

    public abstract void run(InterfazDatos datos);
}
