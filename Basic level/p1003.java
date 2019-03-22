
import java.util.ArrayList;
import java.util.Scanner;

public class p1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(3);
        array.add(5);
        int now = 7;
        boolean flag = true;
        if (N <= 3){
            for (int i = M-1; i < N; i++){
                if (i == N-1){
                    System.out.print(array.get(i));
                    break;
                }
                System.out.print(array.get(i) + " ");
            }
        }
        else{
            while(array.size() != N ){
                if(now % 6 == 1 || now % 6 == 5){
                    for (int i = 2; i <= Math.sqrt(now); i++){
                        if (now % i == 0)
                            flag = false;

                    }
                    if (flag)
                        array.add(now);
                    now++;
                    flag = true;
                }
                else
                    now++;
            }



            int count = 0;
            for (int i = M-1; i < N; i++){
                if (i == N-1){
                    System.out.print(array.get(i));
                    break;
                }
                if (count ==9)
                    System.out.print(array.get(i));
                else
                    System.out.print(array.get(i) + " ");
                count++;
                if (count == 10){
                    System.out.println("");
                    count = 0;
                }
            }
        }



    }
}
