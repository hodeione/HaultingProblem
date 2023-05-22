import maquina.InterfazMaquina;

public class MaquinaAstrategy implements MenuStrategy{
    private final InterfazMaquina maquina;

public MaquinaAstrategy(InterfazMaquina maquina){
        this.maquina = maquina;
    }


    @Override
    public void ejecutar() {
        maquina.run( maquina.getDatos());
    }
}
