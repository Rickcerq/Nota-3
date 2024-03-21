package e3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Você deseja: 1 - Se cadastrar como conta corrente, ou 2 - Se cadastrar como conta poupança");
        int x = input.nextInt();

        
        switch (x) {
            case 1:
                conta_corrente c1 = new conta_corrente();

                System.out.println("Qual o seu nome?");
                c1.setNome(input.next());

                
                System.out.println("Digite: 1 - para depositar dinheiro, 2 - para sacar dinheiro, 3 - para usar o cheque especial, 4 - para exibir os dados da conta");
                int y = input.nextInt();

                 if (y == 1){
                    System.out.println("Quanto você deseja depositar em sua conta?");
                    c1.setDinheiroDepositado(input.nextDouble());
                    c1.DepositarDinheiro();
                } 
                 
                 else if (y == 2) {
                    System.out.println("Quanto você deseja sacar em sua conta?");
                    c1.setDinheiroSacado(input.nextDouble());
                    c1.SacarDinheiro();
                }

                 else if (y == 3) {
                    c1.cheque_especial();
                }

                 else {
                    c1.exibir();
                }
            break;
        
            case 2:
                conta_poupança c2 = new conta_poupança();

                System.out.println("Qual o seu nome?");
                c2.setNome(input.next());

                System.out.println("Digite: 1 - para depositar dinheiro, 2 - para sacar dinheiro, 3 - para calcular rendimento, 4 - para exibir dados da conta");
                int z = input.nextInt();

                 if (z == 1) {
                   System.out.println("Quanto você deseja depositar em sua conta?");
                   c2.setDinheiroDepositado(input.nextDouble());
                   c2.DepositarDinheiro();
                   
                }

                 else if (z == 2) {
                  System.out.println("Quanto você deseja sacar em sua conta?");
                  c2.setDinheiroSacado(input.nextDouble());
                  c2.SacarDinheiro();
                  
                }

                else if (z == 3) {
                  c2.calcular_rendimento();
                  
                }

                else {
                 c2.mostrar_dados_poupança();
            
                }
                break;
        }
    }
}
