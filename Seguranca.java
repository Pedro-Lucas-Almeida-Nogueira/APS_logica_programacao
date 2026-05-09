import java.util.Scanner;

public class Seguranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 5){

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("esta é a opção 1");
                    break;

                case 2:
                    System.out.println("esta é a opção 2");
                    break;

                case 3:
                    System.out.println("esta é a opção 2");
                    break;

                case 4:
                    System.out.println("esta é a opção 4");
                    break;

                case 5:
                    System.out.println("saindo...");
                    break;
            }
        }
        
        sc.close();
    }
}
