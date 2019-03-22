import java.text.DecimalFormat;
import java.util.Scanner;

public class p1002 {
    public static int[] num;
    public static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        num = new int[n];
        for (int i = 0; i < n; i++)
            num[i] = scanner.nextInt();
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        double A4 = 0;
        int A5 = 0;
        int point = 2;
        double count = 0;

        for(int i = 0; i < n; i++){
            if (num[i] % 5 == 0 && num[i] % 2 == 0)
                A1 += num[i];
            else if (num[i] % 5 == 1){
                A2 += Math.pow(-1, point++)* num[i];
            }
            else if (num[i] % 5 == 2)
                A3++;
            else if (num[i] % 5 == 3){
                A4 += num[i];
                count++;
            }
            else if (num[i] % 5 == 4)
                A5 = Math.max(A5, num[i]);
        }
        DecimalFormat df = new DecimalFormat("#.0");
        if (count == 0)
            A4 = 0;
        else
            A4 = A4 / count;

        if (A1 == 0){
            A1 = 'N';
            System.out.print((char)A1 + " ");
        }
        else
            System.out.print(A1 + " ");
        if (A2 == 0){
            A2 = 'N';
            System.out.print((char)A2 + " ");
        }
        else
            System.out.print(A2 + " ");
        if (A3 == 0){
            A3 = 'N';
            System.out.print((char)A3 + " ");
        }
        else
            System.out.print(A3 + " ");
        if (A4 == 0){
            A4 = 'N';
            System.out.print((char)A4 + " ");
        }
        else
            System.out.print(df.format(A4) + " ");
        if (A5 == 0){
            A5 = 'N';
            System.out.print((char)A5);
        }
        else
            System.out.print(A5);


    }
}
