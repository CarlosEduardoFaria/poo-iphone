import java.util.InputMismatchException;
import java.util.Scanner;

import sevices.Musica;
import sevices.Navegador;
import sevices.Telefone;

public class Iphone {

    public static void main(String[] args) throws Exception {

        while (true) {

            System.out.println("Escolha a operação desejada: ");
            System.out.println("T - TELEFONE");
            System.out.println("N - NAVEGADOR");
            System.out.println("M - MUSICA");
            System.out.println("SAIR - Desligar");
            
            try {  

                Scanner in = new Scanner(System.in);
                final String funcao = in.nextLine();

                clearConsole();

                if (funcao.equalsIgnoreCase("T")) {
                    Telefone.telefone();

                } else if (funcao.equalsIgnoreCase("N")) {
                    Navegador.navegador();

                } else if (funcao.equalsIgnoreCase("M")) {
                    Musica.player();

                } else if (funcao.equalsIgnoreCase("SAIR")) {
                    in.close();
                    clearConsole();
                    System.out.println("iPhone Desligado!\n");
                    System.exit(0);
                
                } else {
                    System.out.println("Operação não suportada\n");
                }             
            } catch (InputMismatchException e) {
                    System.out.println("Operação não suportada\n");
                }
            }
    }
        public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
