import java.util.*;

/**
 * By: Sanal Mishra Platform: Vs Code fibSeries
 */
public class fibSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int start = 0;
        System.out.print(start + " ");
        int next = 1;
        System.out.print(next + " ");

        for (int i = 0; i < limit; i++) {

            int res = start + next;
            System.out.print(res + " ");
            start = next;
            next = res;

        }

        sc.close();
    }

}