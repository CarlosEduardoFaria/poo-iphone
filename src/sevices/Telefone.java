package sevices;

import java.util.InputMismatchException;
import java.util.Scanner;

import interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

    private static Scanner opcao = new Scanner(System.in);

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para: "+ String.valueOf(numero) +"\n");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...\n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando Correio de Voz...\n");
    }

    public static void telefone () {

        System.out.println("Escolha a funcionalidade desejada: ");
        System.out.println("1 - Ligar");
        System.out.println("2 - Atender");
        System.out.println("3 - Correio de Voz");
        
        final Telefone t = new Telefone();

        switch (opcao.nextInt()) {

            case 1:
                System.out.println("\nDigite o número para ligação: ");
                try {
                    Scanner entrada = new Scanner(System.in);
                    t.ligar(entrada.nextInt());
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("\nValor digitado não é um número!");
                    break;
                }
                
            case 2:
                t.atender();
                break;

            case 3:
                t.iniciarCorreioVoz();
                break;
        
            default:
                System.out.println("\nFuncionalidade não suportada");
                break;
            }    
    }
}
