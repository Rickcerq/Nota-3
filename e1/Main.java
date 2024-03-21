package e1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Digite: 1 - se deseja se cadastrar como gerente, ou 2 - se deseja se cadastrar como diretor");
        int x = input.nextInt();

            if (x == 1) {
                Gerente g1 = new Gerente();

                System.out.println("Digite seu nome:");
                g1.setNome(input.next());

                g1.setHorasTrab(12);

                g1.setValopH(300);

                System.out.println("Digite o nome de seu departamento:");
                g1.setDepartamento(input.next());

                g1.setSalario(0);

                g1.calcular_salario();

                g1.setSalarioBonus(0);

                g1.calcularBonus();

                g1.exibirDadosGerente();
            } else {
                Diretor d1 = new Diretor();

                System.out.println("Digite seu nome:");
                d1.setNome(input.next());

                d1.setHorasTrab(14);

                d1.setValopH(600);

                System.out.println("Digite a quantidade de suas ações:");
                d1.setAções(input.nextInt());

                d1.setSalario(0);
                d1.calcular_salario();

                d1.exibir_dadosDiretor();
            }
    }

    }
}
