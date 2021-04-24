import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] a: table) {
            for (int i: a) {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
