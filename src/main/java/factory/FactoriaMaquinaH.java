package factory;

import datos.InterfazDatos;
import maquina.InterfazMaquina;
import maquina.MaquinaH;

public class FactoriaMaquinaH implements InterfazFactoriaMaquina {
    public InterfazMaquina crearMaquina(InterfazDatos datos) {
        return (InterfazMaquina) new MaquinaH( datos);
    }
}
