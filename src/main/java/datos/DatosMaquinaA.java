package datos;

public class DatosMaquinaA implements InterfazDatos{
    public boolean isStuck() {
        if (Math.random() < 0.5) {
            return false;
        }else {
            return true;
        }
    }
}
