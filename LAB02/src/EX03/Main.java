package EX03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ponto p1 = new Ponto();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ponto X: ");
        int x = entrada.nextInt();
        System.out.println("\nDigite o valor de y: ");
        int y = entrada.nextInt();

        p1.soma(x, y);

        System.out.println("Digite o ponto X1: ");
        int x1 = entrada.nextInt();
        System.out.println("Digite o ponto y1: ");
        int y1 = entrada.nextInt();
        System.out.println("Digite o ponto X2: ");
        int x2 = entrada.nextInt();
        System.out.println("Digite o ponto y2: ");
        int y2 = entrada.nextInt();

        p1.soma2(x1, x2, y1, y2);

        System.out.println("Digite o ponto X1: ");
        int x3 = entrada.nextInt();
        System.out.println("Digite o ponto y1: ");
        int y3 = entrada.nextInt();
        System.out.println("Digite o ponto X2: ");
        int x4 = entrada.nextInt();
        System.out.println("Digite o ponto y2: ");
        int y4 = entrada.nextInt();

        p1.areaRetangulo(x3,x4,y3,y4);

        System.out.println("Digite o ponto: ");
        int p = entrada.nextInt();
        System.out.println("Digite a constante: ");
        int c = entrada.nextInt();
        p1.multi(p,y);

    }
}
