import java.util.Scanner;

public class Seguranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 6){
            System.out.println("===== Segurança Digital =====");

            System.out.println("Digite 1 para ler sobre senhas");
            System.out.println("Digite 2 para ler sobre ameaças e golpes");
            System.out.println("Digite 3 para ler sobre navegação e redes");
            System.out.println("Digite 4 para ler sobre privacidade e dados");
            System.out.println("Digite 5 para ler sobre manutenção e recuperação");
            System.out.println("Digite 6 para sair");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("senhas");
                    break;

                case 2:
                    System.out.println("ameaças e golpes");
                    break;

                case 3:
                    System.out.println("navegação e redes");
                    break;

                case 4:
                    System.out.println("privacidade e dados");
                    break;
                
                case 5:
                    System.out.println("manutenção e recuperação");
                    break;

                case 6:
                    System.out.println("saindo...");
                    break;

                default:
                    System.out.println("Esta opção é inválida");
            }
        }
        
        sc.close();
    }
}
