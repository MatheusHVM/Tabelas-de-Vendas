package entities;

import java.util.Arrays;
import java.util.List;

public class EntregaUtils {

    public static List<Entrega> entregas = Arrays.asList(
            new Entrega(1, "SEDEX", 50.00, "5 Dias uteis"),
            new Entrega(2, "FEDEX", 40.00, "10 Dias uteis"),
            new Entrega(3, "CORREIOS", 25.00, "30 Dias uteis"),
            new Entrega(4, "BRASPRES", 15.00, "45 Dias uteis")
    );


    public static void exibir(){
        System.out.print("==============================================================================\n");
        System.out.print("|                           MENU DE COMPRAS - ENTREGA                        |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Servico 1: SEDEX               Preco: 50,00          Tempo: 5 Dias uteis    |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Servico 2: FEDEX               Preco: 40,00          Tempo: 10 Dias uteis   |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Servico 3: CORREIOS            Preco: 25,00          Tempo: 30 Dias uteis   |\n");
        System.out.print("==============================================================================\n");
        System.out.print("|Servico 4: BRASPRES            Preco: 15,00          Tempo: 45 Dias uteis   |\n");
        System.out.print("==============================================================================\n");
    }

    public static Entrega buscarPorId(int id) {
        return entregas.get(id - 1);
    }
}
