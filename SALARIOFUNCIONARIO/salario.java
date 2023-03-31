package SALARIOFUNCIONARIO;

import java.util.Scanner;
// by @BernardoSsilva

public class salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeFunc, comecarLaco, funcionarioMenorSal = "", funcionarioMaiorSal = "", finalizarLaco;
        int repeticoes = 0, diasTrabalhados, filhosFunc, totalDeFilhos = 0, salariosAcimaDoismil = 0;
        float salarioMes, salarioDia, salarioAbn, salarioBase, somaSalarios = 0, menorSalario = 9000, maiorSalario = 0;
        float mediaSalarial = 0;
        /*
         * Crie um programa que enquanto o usuário não decidir sair do
         * programa ele irá digitar o nome de um funcionário, seu salário,
         * dias trabalhados e número de filhos.
         * Agora os seguintes requisitos devem ser cumpridos
         */
        Boolean continuarLaco = true;
        System.out.println("Deseja iniciar?(S/N)");
        while (continuarLaco) {
            comecarLaco = scan.nextLine().toUpperCase();
            if (comecarLaco.equals("N")) {
                break;
            } else {
                repeticoes++;
                // Deve ser digitado o nome do funcionário

                System.out.print("Digite o nome do funcionario: ");
                nomeFunc = scan.next();

                System.out.println(" ");

                // Deve ser digitado o salário do funcionário.
                System.out.print("Digite o salario do funcionario: ");
                salarioMes = scan.nextFloat();
                salarioDia = (salarioMes / 30);

                System.out.println(" ");

                // Deve ser digitado os dias trabalhados (Atenção calcule o salário baseado nos
                // dias trabalhados)

                System.out.print("Digite a quantidade de dias trabalhados: ");
                diasTrabalhados = scan.nextInt();
                System.out.print(" ");

                salarioBase = salarioDia * diasTrabalhados;

                /*
                 * Deve ser digitado a quantidade de filhos, aqui vai calculado
                 * o seguinte para cada filho será dado um abono de R$ 100,00,
                 * limitado a 4 filhos
                 */

                System.out.print("Digite a quantidade de filhos: ");
                filhosFunc = scan.nextInt();

                if (filhosFunc > 4) {
                    filhosFunc = 4;
                }

                // Deve retornar o salário total do funcionário, ou seja, o seu salário + abono
                salarioAbn = salarioBase + (100 * filhosFunc);
                System.out.printf("O salario do mês sera de: %.2f", salarioAbn);
                System.out.println(" ");

                // O usuário irá decidir se deseja sair ou continuar cadastrando as vendas, para
                // sair deve ser digitado ‘S’
                System.out.print("Voce deseja finalizar o funcionamento?(S/N): ");
                finalizarLaco = scan.next().toUpperCase();
                /*
                 * Caso o usuário decida sair as seguintes condições devem ser atendidas
                 *  Mostrar a soma total dos salários
                 *  Mostrar o nome do funcionário e o salário do menor salário
                 * calculado
                 *  Mostrar o nome do funcionário e o salário do maior salário
                 * calculado.
                 *  Mostrar a média geral de salário.
                 *  Mostrar a quantidade de funcionário com salário >= 2600
                 *  Mostrar a quantidade total de filhos.
                 */
                totalDeFilhos += filhosFunc;
                somaSalarios += salarioAbn;
                mediaSalarial += salarioAbn;
                if (salarioAbn < menorSalario) {
                    menorSalario = salarioAbn;
                    funcionarioMenorSal = nomeFunc;
                }
                if (salarioAbn > maiorSalario) {
                    maiorSalario = salarioAbn;
                    funcionarioMaiorSal = nomeFunc;
                }

                if (salarioAbn >= 2600) {
                    salariosAcimaDoismil += 1;
                }
                if (finalizarLaco.equals("S")) {
                    continuarLaco = false;
                    break;
                } else {
                    continuarLaco = true;
                }

                System.out.println("*****************************");
                System.out.println(" ");

            }
        }
        System.out.println("=============================");

        System.out.printf("Soma de todos os salarios: %.2f", somaSalarios);
        System.out.println("- ");
        System.out.printf("Funcionario com menor salario: " + funcionarioMenorSal + " , R$ %.2f", menorSalario);
        System.out.println("- ");
        System.out.printf("Funcionario com o maior salario: " + funcionarioMaiorSal + ", R$ %.2f", maiorSalario);
        System.out.println("- ");
        System.out.printf("Media salarial: R$ %.2f", (mediaSalarial / repeticoes));
        System.out.println("- ");
        System.out.print("Salarios >= 2600:" + salariosAcimaDoismil);
        System.out.println("- ");
        System.out.println("Quantidade total de filhos: " + totalDeFilhos);
        System.out.println("- ");
        System.out.println("Finalizado");
    }
}