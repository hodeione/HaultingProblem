package observers;

import maquina.InterfazMaquina;

public class ObserveRresultados implements Observer{
    private InterfazMaquina maquina;

    public ObserveRresultados(InterfazMaquina maquina) {
        this.maquina = maquina;
    }

    public void update() {
        maquina.run(maquina.getDatos());
    }
}
