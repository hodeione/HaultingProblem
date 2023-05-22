// Menu.java
import datos.DatosMaquinaA;
import datos.DatosMaquinaH;
import datos.InterfazDatos;
import factory.FactoriaMaquinaA;
import factory.FactoriaMaquinaH;
import factory.InterfazFactoriaMaquina;
import maquina.InterfazMaquina;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    private final MenuStrategy[] strategies;

    public Menu(MenuStrategy[] strategies) {
        this.strategies = strategies;
    }

    public void show() {
        while (true) {
            System.out.println("Por favor, elija una opción:");
            System.out.println("1. Ejecutar Maquina A");
            System.out.println("2. Ejecutar Maquina H");
            System.out.println("3. Salir");

            String userInput = scanner.nextLine();

            if (userInput.equals("3")) {
                break;
            }

            int strategyIndex = Integer.parseInt(userInput) - 1;

            if (strategyIndex >= 0 && strategyIndex < strategies.length) {
                strategies[strategyIndex].ejecutar();
            } else {
                System.out.println("Opción inválida");
            }
        }
    }
    public static Menu initializeMenu() {
        InterfazDatos datosMaquinaA = new DatosMaquinaA();
        InterfazDatos datosMaquinaH = new DatosMaquinaH();

        InterfazFactoriaMaquina factoryA = new FactoriaMaquinaA();
        InterfazFactoriaMaquina factoryH = new FactoriaMaquinaH();

        InterfazMaquina maquinaA = factoryA.crearMaquina(datosMaquinaA);
        InterfazMaquina maquinaH = factoryH.crearMaquina(datosMaquinaH);

        MenuStrategy[] strategies = {
                new MaquinaAstrategy(maquinaA),
                new MauinaHstrategy(maquinaH)
        };

        return new Menu(strategies);
    }

}

