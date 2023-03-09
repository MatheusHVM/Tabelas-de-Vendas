package application;

import entities.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        double valorTotal = 0;

        Scanner sc = new Scanner(System.in);



        ComputadorUtils.exibir();
        System.out.println();
        System.out.print("Selecione a opção desejada: ");

        int idMaquina = sc.nextInt();
        valorTotal = ComputadorUtils.buscarPorId(idMaquina).getPreco();

        AcessorioUtils.exibir();
        System.out.println();
        System.out.print("Selecione a opção desejada: ");

        int idAcessorio = sc.nextInt();
        valorTotal += AcessorioUtils.buscarPorId(idAcessorio).getPreco();

        EntregaUtils.exibir();
        System.out.println();
        System.out.print("Selecione a opção desejada: ");

        int idEntrega = sc.nextInt();
        valorTotal += EntregaUtils.buscarPorId(idEntrega).getPreco();

        PagamentoUtils.exibir();
        System.out.println();
        System.out.print("Selecione a opção desejada: ");

        int idPagamento = sc.nextInt();

        Pagamento pagamento = PagamentoUtils.buscarPorId(idPagamento);


        valorTotal = PagamentoUtils.getValorTotalPorPagamento(pagamento, valorTotal);

        System.out.println("Valor total a pagar: " + valorTotal);
        System.out.println();
        System.out.println("Digite o valor que irá pagar: ");

        double valorPago = sc.nextDouble();
        double troco = PagamentoUtils.getTroco(valorTotal, valorPago);

        if (troco < 0) {
            System.out.println("Valor faltante: " + troco * -1);
        } else {
            System.out.println("Seu troco: " + troco);
        }
        sc.close();
    }
}
