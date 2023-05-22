package maquina;

import datos.InterfazDatos;

public interface InterfazMaquina {
     void run(InterfazDatos datos);

     InterfazDatos getDatos();
}
