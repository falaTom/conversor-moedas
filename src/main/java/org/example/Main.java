package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import com.google.gson.Gson;
public class Main {
    public static void
    main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        //bloco de texto usando as aspas triplas (Text Blocks) do Java moderno
            String menu = """
    
    ********************************************************************************************************************
    ******************
                         Seja bem-vindo/a ao conversor de Moedas!
    
                1) Peso Argentino =>> Bolívar Venezuelano
                2) Dólar Americano =>> Peso Argentino
                3) Euro (Espanha)  =>> Real Brasileiro
                4) Real Brasileiro =>> Bolívar Venezuelano
                5) Dólar Americano =>> Bolívar Venezuelano
                6) Euro (Espanha) =>> Peso Argentino
                7) Sair
                
                Escolha uma opção válida:
                *****************
                """;

        while (opcao != 7) {
            System.out.println(menu);

            if (leitura.hasNextInt()) {
                opcao = leitura.nextInt();
            } else {
                System.out.println("Por favor, digite um número de 1 a 7.");
                leitura.next();
                continue;
            }

            if (opcao == 7) {
                System.out.println("Finalizando o programa. Até logo!");
                break;
            }

            if (opcao >= 1 && opcao <= 6) {
                System.out.println("Digite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                ConsultaMoeda consulta = new ConsultaMoeda();

                String base = "";
                String alvo = "";

                // Define as moedas com base no seu menu diversificado
                switch (opcao) {
                    case 1 -> { base = "ARS"; alvo = "VES"; } // Peso Arg => Bolívar
                    case 2 -> { base = "USD"; alvo = "ARS"; } // Dólar => Peso Arg
                    case 3 -> { base = "EUR"; alvo = "BRL"; } // Euro => Real
                    case 4 -> { base = "BRL"; alvo = "VES"; } // Real => Bolívar
                    case 5 -> { base = "USD"; alvo = "VES"; } // Dólar => Bolívar
                    case 6 -> { base = "EUR"; alvo = "ARS"; } // Euro => Peso Arg
                }

                try {
                    double taxa = consulta.buscaTaxa(base, alvo);
                    double resultado = valor * taxa;
                    System.out.printf(">>> Valor %.2f [%s] equivale a: %.2f [%s]%n", valor, base, resultado, alvo);
                } catch (Exception e) {
                    System.out.println("Erro na consulta: " + e.getMessage());
                }
            } else {
                System.out.println("Opção inválida! Escolha entre 1 e 7.");
            }
        }
        leitura.close();
    }
}