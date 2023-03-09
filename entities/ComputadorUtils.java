package entities;

import java.util.Arrays;
import java.util.List;

public class ComputadorUtils {

    public static final List<Computador> computadores = Arrays.asList(
            new Computador(1, "AD Astra", 23000),
            new Computador(2, "Tempest", 12000),
            new Computador(3, "Atlas", 11500),
            new Computador(4, "Heavy", 13600)
    );


    public static void exibir() {
        System.out.print("==============================================================================\n");
        System.out.print("|                           MENU DE COMPRAS - COMPUTADORES                   |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Computador Gamer 1: AD Astra                           Preco: 23.000,00     |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Computador Gamer 2: Tempest                            Preco: 12.000,00     |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Computador Gamer 3: Atlas                              Preco: 11.500,00     |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Computador Gamer 4: Heavy                              Preco: 13.600,00     |\n");
        System.out.print("==============================================================================\n");
    }

    public static Computador buscarPorId(int id) {
        return computadores.get(id - 1);
    }
}
