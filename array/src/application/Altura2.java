package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Altura2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        People[] pessoas = new People[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            pessoas[i] = new People(nome, idade, altura);
        }

        double somaAltura = 0.0;
        int menores16 = 0;

        for (int i = 0; i < n; i++) {
            somaAltura += pessoas[i].getAltura();
            if (pessoas[i].getIdade() < 16) {
                menores16++;
            }
        }

        double mediaAltura = somaAltura / n;
        double porcentagem = menores16 * 100.0 / n;

        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < n; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
