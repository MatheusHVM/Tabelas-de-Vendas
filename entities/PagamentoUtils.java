package entities;

import java.util.Arrays;
import java.util.List;

public class PagamentoUtils {

    public static List<Pagamento> pagamentos = Arrays.asList(
            new Pagamento(1, "Parcelado em 7x", 1, 7),
            new Pagamento(2, "Parcelado em 5x", 1, 5),
            new Pagamento(3, "A vista com 15% Off", 0.85, 1),
            new Pagamento(4, "Parcelado em 10x com juros de 5%% de Juros", 1.05, 10)
    );

    public static void exibir(){
        System.out.print("===============================================================\n");
        System.out.print("|                MENU DE COMPRAS - PAGAMENTO                  |\n");
        System.out.print("===============================================================\n");
        System.out.print("|Pagamento 1:      Parcelado em 7x                            |\n");
        System.out.print("===============================================================\n");
        System.out.print("|Pagamento 2:      Parcelado em 5x                            |\n");
        System.out.print("===============================================================\n");
        System.out.print("|Pagamento 3:      A vista com 15%% Off                       |\n");
        System.out.print("===============================================================\n");
        System.out.print("|Pagamento 4:      Parcelado em 10x com juros de 5%% de Juros |\n");
        System.out.print("===============================================================\n");
    }

    public static Pagamento buscarPorId(int id) {
        return pagamentos.get(id - 1);
    }

    public static double getValorTotalPorPagamento(Pagamento pagamento, double valorTotal){
        return valorTotal * pagamento.getPorcentagem() / pagamento.getParcela();
    }

    public static double getTroco(double valorTotal, double valorPago){
        return valorPago - valorTotal;
    }
}
