package cauculadoraVolume;


import java.util.Scanner;

public class volumeCubico_rev02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Calcular volume de um cubo");
            System.out.println("2. Calcular volume de um paralelepípedo");
            System.out.println("0. Sair");
            System.out.println("----------------");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateCubeVolume();
                    break;
                case 2:
                    calculateParallelepipedVolume();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    public static void calculateCubeVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da aresta do cubo: ");
        double side = scanner.nextDouble();
        double volume = Math.pow(side, 3);

        System.out.println("O volume do cubo é: " + volume);
    }

    public static void calculateParallelepipedVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do comprimento do paralelepípedo: ");
        double length = scanner.nextDouble();
        System.out.print("Digite o tamanho da largura do paralelepípedo: ");
        double width = scanner.nextDouble();
        System.out.print("Digite o tamanho da altura do paralelepípedo: ");
        double height = scanner.nextDouble();

        double volume = length * width * height;

        System.out.println("O volume do paralelepípedo é: " + volume);
    }
}
