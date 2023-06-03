package Matrix;
import java.util.Scanner;
import java.util.Random;
public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк ");
        int x = in.nextInt();
        System.out.print("Введите количество столбцов ");
        int y = in.nextInt();
        Random rnd = new Random();
        int[][] matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(10) + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        task2:
        while (true) {
            System.out.println("1. Столбец");
            System.out.println("2. Строка");
            System.out.println("3. Диагональ");
            System.out.println("4. Побочная диагональ");
            System.out.println("5. Сумма чисел матрицы");
            System.out.println("6. Вычитание чисел матрицы");
            System.out.println("7. Умножение чисел матрицы");
            System.out.println("0. Закончить операции");
            int k = in.nextInt();
            switch (k) {
                case 1 -> {
                    System.out.print("Номер столбца, который хотите вываести(Начиная с 0): ");
                    int a = in.nextInt();
                    for (int i = 0; i < matrix.length; i++) {
                        System.out.println(matrix[i][a]);
                    }
                }
                case 2 -> {
                    System.out.print("Номер строки, которую хотите вываести(Начиная с 0): ");
                    int a1 = in.nextInt();
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[a1][j] + " ");
                    }
                    System.out.print("\n");
                }
                case 3 -> {
                    for (int i = matrix.length - 1; i >= 0; i--) {
                        System.out.print(matrix[i][i] + " ");
                    }
                    System.out.print("\n");
                }
                case 4 -> {
                    for (int i = matrix.length - 1; i >= 0; i--) {
                        System.out.print(matrix[i][matrix.length - 1 - i] + " ");
                    }
                    System.out.print("\n");
                }
                case 5 -> {
                    int sum = 0;
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            sum += matrix[i][j];
                        }
                    }
                    System.out.print("Сумма = " + sum + "\n");
                }
                case 6 -> {
                    int Sub = 0;
                    int n = 0;
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            n -= matrix[i][j];
                            Sub = n + matrix[0][0];
                        }
                    }
                    System.out.print("Разность = " + Sub + "\n");
                }
                case 7 -> {
                    double Mul = 1;
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            Mul = Mul * matrix[i][j];
                        }
                    }
                    System.out.print("Произведение = " + Mul + "\n");
                }
                default -> {
                    break task2;
                }
            }
        }
    }
}