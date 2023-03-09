package entities;

import java.util.Arrays;
import java.util.List;

public class AcessorioUtils {

    public static List<Acessorio> acessorios = Arrays.asList(
            new Acessorio(1,"Mouse Gamer Delux M700", 185.00),
            new Acessorio(2,"Mouse Redragon Cobra", 116.00),
            new Acessorio(3,"Mouse Gamer Logitech G403 Hero", 220.00),
            new Acessorio(4,"Mouse Gamer Razer DeathAdder", 200.00)
    );

    public static void exibir(){
        System.out.print("==============================================================================\n");
        System.out.print("|                           MENU DE COMPRAS - ACESSORIOS                     |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Acessorio 1: Mouse Gamer Delux M700                      Preco: 185,00      |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Acessorio 2: Mouse Gamer Redragon Cobra                  Preco: 116,00      |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Acessorio 3: Mouse Gamer Logitech G403 Hero              Preco: 220,00      |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Acessorio 4: Mouse Gamer Razer DeathAdder                Preco: 200,00      |\n");
        System.out.print("==============================================================================\n");
    }

    public static Acessorio buscarPorId(int id) {
        return acessorios.get(id - 1);
    }
}
