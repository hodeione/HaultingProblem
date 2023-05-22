package factory;

import datos.InterfazDatos;
import maquina.InterfazMaquina;

public interface  InterfazFactoriaMaquina {
    InterfazMaquina crearMaquina(InterfazDatos datos);
}
