package factory;

import datos.InterfazDatos;
import maquina.InterfazMaquina;

public abstract class FactoriaMaquina {
    InterfazMaquina crearMaquina(InterfazDatos datos);
}
