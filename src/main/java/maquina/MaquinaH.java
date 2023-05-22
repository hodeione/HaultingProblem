package maquina;

import datos.InterfazDatos;

public class MaquinaH extends AbstractMaquina{

        public MaquinaH( InterfazDatos datos) {
            super(datos);
        }

        @Override
        public void run(InterfazDatos datos) {

                if (datos.isStuck()){
                    System.out.println("Maquina H esta atascada");
                } else {
                    System.out.println("Maquina H esta funcionando");
                }
        }

        @Override
        public InterfazDatos getDatos() {
            return null;
        }


}
