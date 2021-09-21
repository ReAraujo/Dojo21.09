import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;


        do{
            System.out.println("Escolha uma opção:\n 1 - Números pares \n 2 - Números ìmpares \n 3 - Números Primos \n 4 - Investimento \n 5 - Sair");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

                default:
                    System.out.println("______Opção inválida______");
                    System.out.println("Digite novamente");

            }
        }while (opcao <=0 || opcao > 5);
    }
}
