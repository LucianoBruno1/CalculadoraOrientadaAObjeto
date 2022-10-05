import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculadora c1 = new Calculadora(1, 4);

        while (true) {

            System.out.print("Valor 1: ");
            c1.setNum1(input.nextInt());

            System.out.print("Valor 2: ");
            c1.setNum2(input.nextInt());


            System.out.println("\nA soma é: " + c1.somar(c1.getNum1(), c1.getNum2()));
            System.out.println("A subtração é: " + c1.subtrair(c1.getNum1(), c1.getNum2()));
            System.out.println("A multiplicação é: " + c1.multiplicar(c1.getNum1(), c1.getNum2()));
            System.out.println("A divisão é: " + c1.dividir(c1.getNum1(), c1.getNum2()));
            System.out.println();

            while (true) {
                System.out.println("Deseja continuar? 1-SIM / 2-NÃO");
                c1.setDecisao(input.nextInt());

                if (c1.getDecisao() == 1) {
                    break;
                } else if (c1.getDecisao() != 2) {
                    System.out.println("Você digitou uma opção inválida, Digite novamente:");
                    continue;
                } else if (c1.getDecisao() == 2) {
                    System.out.println("Obrigado por utilizar o programa");
                    return;
                }

            }
        }
    }
}