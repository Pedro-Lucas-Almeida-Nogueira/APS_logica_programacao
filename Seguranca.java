import java.util.Scanner;

public class Seguranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção: ");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.print("esta é a opção 1");
                break;

            case 2:
                System.out.print("esta é a opção 2");
                break;

            case 3:
                System.out.print("esta é a opção 2");
                break;

            case 4:
                System.out.print("esta é a opção 4");
                break;

        }

        sc.close();
    }
}
