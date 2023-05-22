package maquina;

import datos.InterfazDatos;

public class MaquinaA extends AbstractMaquina {
    public MaquinaA(InterfazDatos datos) {
        super(datos);
    }


    @Override
    public void run(InterfazDatos datos) {

            if (datos.isStuck()){
                System.out.println("Maquina A esta atascada");
            } else {
                System.out.println("Maquina A esta funcionando");
            }
    }

    @Override
    public InterfazDatos getDatos() {
        return null;
    }
}
