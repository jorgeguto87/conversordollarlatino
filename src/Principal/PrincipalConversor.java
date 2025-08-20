package Principal;

import modelos.Conversor;
import modelos.Moedas;
import modelos.moedasConv;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalConversor {
    public static void executar() throws IOException, InterruptedException {


        String menu = """
                ********************* [MENU PRINCIPAL] *********************
                ************************************************************
                ****** [SELECIONE A MOEDA QUE GOSTARIA DE CONVERTER] *******
                *                                                          *
                *    [1] - USD - Dollar (Estados Unidos)                   *
                *    [2] - ARS - Argentine Peso (Argentina)                *
                *    [3] - BOB - Bolivian Boliviano (Bolívia)              *
                *    [4] - BRL - Brazilian Real (Brasil)                   *
                *    [5] - CLP - Chilean Peso (Chile)                      *
                *    [6] - COP - Colombian Peso (Colômbia)                 *
                *    [7] - CRC - Costa Rican Colon (Costa Rica)            *
                *    [8] - CUP - Cuban Peso (Cuba)                         *
                *    [9] - DOP - Dominican Peso (República Dominicana)     *
                *    [10] - GTQ - Guatemalan Quetzal (Guatemala)           *
                *    [11] - HNL - Honduran Lempira (Honduras)              *
                *    [12] - MXN - Mexican Peso (México)                    *
                *    [13] - NIO - Nicaraguan Córdoba (Nicarágua)           *
                *    [14] - PAB - Panamanian Balboa (Panamá)               *
                *    [15] - PYG - Paraguayan Guaraní (Paraguai)            *
                *    [16] - PEN - Peruvian Sol (Peru)                      *
                *    [17] - UYU - Uruguayan Peso (Uruguai)                 *
                *    [18] - VES - Venezuelan Bolívar Soberano (Venezuela)  *
                *    [0] - Voltar ao menu inicial                          *
                ************************************************************
                """;

        String opcoesConversao = """
                ************************************************************
                *    [1] - USD - Dollar (Estados Unidos)                   *
                *    [2] - ARS - Argentine Peso (Argentina)                *
                *    [3] - BOB - Bolivian Boliviano (Bolívia)              *
                *    [4] - BRL - Brazilian Real (Brasil)                   *
                *    [5] - CLP - Chilean Peso (Chile)                      *
                *    [6] - COP - Colombian Peso (Colômbia)                 *
                *    [7] - CRC - Costa Rican Colon (Costa Rica)            *
                *    [8] - CUP - Cuban Peso (Cuba)                         *
                *    [9] - DOP - Dominican Peso (República Dominicana)     *
                *    [10] - GTQ - Guatemalan Quetzal (Guatemala)           *
                *    [11] - HNL - Honduran Lempira (Honduras)              *
                *    [12] - MXN - Mexican Peso (México)                    *
                *    [13] - NIO - Nicaraguan Córdoba (Nicarágua)           *
                *    [14] - PAB - Panamanian Balboa (Panamá)               *
                *    [15] - PYG - Paraguayan Guaraní (Paraguai)            *
                *    [16] - PEN - Peruvian Sol (Peru)                      *
                *    [17] - UYU - Uruguayan Peso (Uruguai)                 *
                *    [18] - VES - Venezuelan Bolívar Soberano (Venezuela)  *
                ************************************************************
                """;

        String opcaoFinal = """
                ************************************
                *     O QUE DESEJA FAZER AGORA?    *
                * [1] - Converter outro valor.     *
                * [2] - Retornar ao menu principal *
                ************************************
                """;

        Conversor minhaConversao = new Conversor();
        Scanner leitura = new Scanner(System.in);

        while(true){
            System.out.println(menu);
            var opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    minhaConversao.setMoedaAConverter("USD");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    var valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    var opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 2:

                    minhaConversao.setMoedaAConverter("ARS");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 3:

                    minhaConversao.setMoedaAConverter("BOB");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 4:

                    minhaConversao.setMoedaAConverter("BRL");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 5:

                    minhaConversao.setMoedaAConverter("CLP");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 6:

                    minhaConversao.setMoedaAConverter("COP");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 7:

                    minhaConversao.setMoedaAConverter("CRC");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 8:

                    minhaConversao.setMoedaAConverter("CUP");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 9:

                    minhaConversao.setMoedaAConverter("DOP");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 10:

                    minhaConversao.setMoedaAConverter("GTQ");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 11:

                    minhaConversao.setMoedaAConverter("HNL");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 12:

                    minhaConversao.setMoedaAConverter("MXN");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 13:

                    minhaConversao.setMoedaAConverter("NIO");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 14:

                    minhaConversao.setMoedaAConverter("PAB");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 15:

                    minhaConversao.setMoedaAConverter("PYG");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 16:

                    minhaConversao.setMoedaAConverter("PEN");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 17:

                    minhaConversao.setMoedaAConverter("UYU");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 18:

                    minhaConversao.setMoedaAConverter("VES");
                    System.out.println("Maravilha! Digite o valor a converter abaixo:");
                    valor = leitura.nextDouble();
                    minhaConversao.setValorAConverter(valor);
                    System.out.println("Agora selecione a moeda que gostaria da conversão:");
                    System.out.println(opcoesConversao);
                    opcaoDois = leitura.nextInt();
                    switch (opcaoDois){
                        case 1:
                            minhaConversao.setMoedaConvertida(moedasConv.USD);
                            break;

                        case 2:
                            minhaConversao.setMoedaConvertida(moedasConv.ARS);
                            break;

                        case 3:
                            minhaConversao.setMoedaConvertida(moedasConv.BOB);
                            break;

                        case 4:
                            minhaConversao.setMoedaConvertida(moedasConv.BRL);
                            break;

                        case 5:
                            minhaConversao.setMoedaConvertida(moedasConv.CLP);
                            break;

                        case 6:
                            minhaConversao.setMoedaConvertida(moedasConv.COP);
                            break;

                        case 7:
                            minhaConversao.setMoedaConvertida(moedasConv.CRC);
                            break;

                        case 8:
                            minhaConversao.setMoedaConvertida(moedasConv.CUP);
                            break;

                        case 9:
                            minhaConversao.setMoedaConvertida(moedasConv.DOP);
                            break;

                        case 10:
                            minhaConversao.setMoedaConvertida(moedasConv.GTQ);
                            break;

                        case 11:
                            minhaConversao.setMoedaConvertida(moedasConv.HNL);
                            break;

                        case 12:
                            minhaConversao.setMoedaConvertida(moedasConv.MXN);
                            break;

                        case 13:
                            minhaConversao.setMoedaConvertida(moedasConv.NIO);
                            break;

                        case 14:
                            minhaConversao.setMoedaConvertida(moedasConv.PAB);
                            break;

                        case 15:
                            minhaConversao.setMoedaConvertida(moedasConv.PYG);
                            break;

                        case 16:
                            minhaConversao.setMoedaConvertida(moedasConv.PEN);
                            break;

                        case 17:
                            minhaConversao.setMoedaConvertida(moedasConv.UYU);
                            break;

                        case 18:
                            minhaConversao.setMoedaConvertida(moedasConv.VES);
                            break;

                        default:
                            System.out.println("Por favor selecione uma opção do menu!");
                    }

                    try {
                        String resultado = minhaConversao.converterMoeda();
                        System.out.println(resultado);
                        System.out.println(opcaoFinal);
                        opcaoDois = leitura.nextInt();
                        switch (opcaoDois){
                            case 1:
                                PrincipalConversor.executar();
                                return;

                            case 2:
                                return;

                            default:
                                System.out.println("Por favor escolha uma opção do menu acima!");

                        }
                    } catch (Exception e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Retornando ao menu principal");
                    return;

                default:
                    System.out.println("Por favor escolha uma opção do menu acima!");

            }
        }
    }
}