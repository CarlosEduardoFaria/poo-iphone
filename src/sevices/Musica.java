package sevices;

import java.util.Scanner;

import interfaces.ReprodutorMusical;

public class Musica implements ReprodutorMusical {

    private static Scanner entrada = new Scanner(System.in);

    @Override
    public void tocar() {
        System.out.println("\nTocando a música...\n");
    }

    @Override
    public void pausar() {
        System.out.println("\nPausando a música...\n");
    }

    @Override
    public void selecionarMusica(String musica) {

        if (musica != null && !musica.isEmpty()) {
            System.out.println("\nTocando a música: " + musica + "\n");
        } else {
            System.out.println("\nNão foi selecionada uma música para reprodução!");
        }
    }

    public static void player () {

        System.out.println("Escolha a funcionalidade desejada: ");
        System.out.println("1 - Tocar Musica");
        System.out.println("2 - Pausar Musica");
        System.out.println("3 - Selecionar Musica");
        
        final int opcao = entrada.nextInt();
        final Musica m = new Musica();

        switch (opcao) {
            case 1:
                m.tocar();
                break;

            case 2:
                m.pausar();
                break;

            case 3:
                System.out.println("\nDigite a musica desejada : ");
                m.selecionarMusica(entrada.next());
                break;
        
            default:
            System.out.println("\nFuncionalidade não suportada");
        }
    }
}
