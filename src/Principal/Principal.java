package Principal;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void  main(String[] args )  throws IOException, InterruptedException {

        String apresentacao = """
                ***************************************************
                *         BEM VINDO AO CONVERSOR DE MOEDAS        *
                *                  DOLLAR LATINO                  *
                ***************************************************
                * Converta facilmente o Dollar para as principais *
                * moedas latinas ou vice e versa.                 *
                ***************************************************
                """;

        String menuInicial = """
                ****** [MENU INICIAL] ******
                ****************************
                * [1] - Iniciar Conversão  *
                * [2] - Sair do Sistema    *
                ****************************
                """;

        Scanner leitura = new Scanner(System.in);

        System.out.println(apresentacao);

        while(true) {
            System.out.println(menuInicial);
            var opcoes = leitura.nextInt();
            switch (opcoes) {

                case 1:
                    System.out.println("Vamos lá...");
                    PrincipalConversor.executar();
                    break;

                case 2:
                    System.out.println("Até a próxima! :)");
                    leitura.close();
                    return;

                default:
                    System.out.println("Por favor selecione uma das opções acima!");


            }
        }
    }

}
