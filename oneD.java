import java.util.Scanner;

public class oneD {
    public static void main(String[] args)
    {
        int i;
        int a[];
        a=new int[5];
        Scanner scan=new Scanner(System.in);
        for(i=0;i<=4;i++)
        {
            System.out.println("Enter an Element");
            a[i] = scan.nextInt();
        }
        for(i=0;i<=4;i++)
        {
            System.out.println(a[i]);
        }
    }

}
