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
                    System.out.println(
                        "Senhas:\r\n" +
                        "Atualmente as senhas são a principal forma que usamos para a segurança\r\n" + 
                        "de nossas contas online, porém as pessoas não dão a devida importância às\r\n" + 
                        "suas senhas como deveriam.\r\n" + //
                        "Aqui vão algumas dicas para deixar suas senhas mais seguras. Utilize letras\r\n" + 
                        "maiúsculas, minúsculas, números e caracteres especiais nas suas senhas.\r\n" + 
                        "Essa diversidade de caracteres aumenta as possíveis combinações de\r\n" + 
                        "senhas, deixando mais difícil de um computador quebrá-la. Evite reutilizar a\r\n" + 
                        "mesma senha em várias contas diferentes, pois caso alguma de suas contas\r\n" + 
                        "tenha a senha vazada você não comprometeria as outras contas. Utilize\r\n" + 
                        "gerenciadores de senhas, um gerenciador de senhas são softwares que\r\n" + 
                        "permitem criar, armazenar e gerenciar senhas, eles criam senhas fortes para\r\n" + 
                        "suas contas e você só precisa lembrar de uma senha mestra para\r\n" + 
                        "acessá-las."
                    );
                    break;

                case 2:
                    System.out.println(
                        "Ameaças e Golpes:\r\n" +
                        "Aqui estão alguns exemplos de golpes digitais:\r\n" +
                        "   -phishing: É uma maneira de tentar obter dados confidenciais ou\r\n" +
                        "instalar malwares nos dispositivos das vítimas. Os golpistas se passam por\r\n" +
                        "entidades confiáveis como bancos, etc. e através de e-mails ou mensagens, muito\r\n" +
                        "bem disfarçadas, tentam induzir a vítima a clicar em um link que instalará um\r\n" +
                        "malware ou pegará seus dados.\r\n" +
                        "   -smishing: É um tipo de phishing que acontece através de mensagens em\r\n" +
                        "dispositivos móveis como sms. Esse tipo de golpe é mais comum porque é mais\r\n" +
                        "fácil para golpistas conseguir o número de telefone das vítimas do que e-mails, pois\r\n" +
                        "telefones só usam números como caracteres.\r\n" +
                        "   -vishing: É basicamente um fishing por voz, ao conseguir o número de\r\n" +
                        "telefone das vítimas os golpistas por meio de ligações telefônicas se passam por\r\n" +
                        "entidades como lojas ou bancos e induzem as vítimas a compartilhar suas\r\n" +
                        "informações confidenciais."
                    );
                    break;

                case 3:
                    System.out.println(
                        "Navegação e Redes:\r\n" +
                        "Uma rede segura é uma infraestrutura de rede que utiliza medidas para\r\n" + 
                        "garantir a confidencialidade dos dados que trafegam nelas.\r\n" + 
                        "VPNs: (rede privada virtual) faz uma ligação entre seu computador e o\r\n" + 
                        "servidor de um fornecedor de VPN ele encripta seus dados e esconde seu\r\n" + 
                        "endereço IP como se fosse você. O VPN é interessante quando você está\r\n" + 
                        "usando uma rede pública e quer esconder os dados que você está\r\n" + 
                        "acessando."
                    );
                    break;

                case 4:
                    System.out.println(
                        "Privacidade e Dados:\r\n" +
                        "A LGPD (Lei Geral de Proteção de Dados Pessoais) estabelece diretrizes\r\n" + 
                        "obrigatórias sobre a coleta, processamento e armazenamento de dadospessoais.\r\n" + 
                        "O dono dos dados tem vários direitos sobre esses dados ao qual o\r\n" + 
                        "controlador desses dados deve cumprir como acessar qualquer dado que\r\n" + 
                        "seja seu, correção de dados que estejam incorretos ou desatualizados ou até\r\n" + 
                        "revogar o consentimento de gerenciarem seus dados."
                    );
                    break;
                
                case 5:
                    System.out.println(
                        "Manutenção e Recuperação\r\n" +
                        "Existe uma regra na manutenção de dados chamada regra 3-2-1 que\r\n" + 
                        "consiste em ter 3 cópias dos dados, uma original e duas de backup,\r\n" + 
                        "armazenar essas cópias em 2 mídias diferentes e salvar 1 das cópias em um\r\n" + 
                        "local físico diferente do original.\r\n" + 
                        "É importante sempre manter sistemas operacionais e app atualizados, pois\r\n" + 
                        "estas atualizações mais novas acabam trazendo soluções para brechas que\r\n" + 
                        "existiam no sistema em versões anteriores."
                    );
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
