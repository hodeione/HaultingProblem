import maquina.InterfazMaquina;

public class MauinaHstrategy implements MenuStrategy {
    private final InterfazMaquina maquina;

    public MauinaHstrategy(InterfazMaquina maquina){
        this.maquina = maquina;
    }

    @Override
    public void ejecutar() {
        maquina.run( maquina.getDatos());
    }
}
