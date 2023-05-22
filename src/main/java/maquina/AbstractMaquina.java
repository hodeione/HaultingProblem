package maquina;

import datos.InterfazDatos;

public abstract class AbstractMaquina implements InterfazMaquina {
    protected InterfazDatos datos;

    public AbstractMaquina(InterfazDatos datos) {
        this.datos = datos;

    }
}
