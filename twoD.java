import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[3][4];
        Scanner scan = new Scanner(System.in);
        for (i = 0; i <= a.length - 1; i++) {
            for (j = 0; j <= a[i].length - 1; j++) {
                System.out.println("Enter an element");
                a[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i <= a.length - 1; i++) {
            for (j = 0; j <= a[i].length - 1; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }

}
