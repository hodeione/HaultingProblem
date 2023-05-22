package factory;

import datos.InterfazDatos;
import maquina.InterfazMaquina;
import maquina.MaquinaA;

public class FactoriaMaquinaA implements InterfazFactoriaMaquina {
    public InterfazMaquina crearMaquina(InterfazDatos datos) {
        return new MaquinaA(datos);
    }

}
