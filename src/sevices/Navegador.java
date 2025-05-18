package sevices;

import java.util.Scanner;

import interfaces.NavegadorInternet;

public class Navegador implements NavegadorInternet{

    private static Scanner entrada = new Scanner(System.in);

    @Override
    public void exibirPagina(String url) {
        System.out.println("\nExibindo página '"+url+"'\n");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("\nAdicionando aba...\n");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("\nAtualizando página...\n");
    }

    public static void navegador () {

        System.out.println("1 - Exibir Pagina");
        System.out.println("2 - Adicionar Aba");
        System.out.println("3 - Atualizar Pagina");

        final int opcao = entrada.nextInt();
        final Navegador n = new Navegador();

        switch (opcao) {
            case 1:
                System.out.println("\nDigite a página desejada : ");
                n.exibirPagina(entrada.next());
                break;

            case 2:
                n.adicionarNovaAba();
                break;

            case 3:
                n.atualizarPagina();
                break;
        
            default:
            System.out.println("\nFuncionalidade não suportada");
        }  
    }
}
