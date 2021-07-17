/**
 * strongNumber
 */
public class strongNumber {

    public int factClaculation(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factClaculation((n - 1));

    }

    public static void main(String[] args) {
        int n = 534;
        int sum = 0;
        int temp;
        int rear;
        strongNumber s = new strongNumber();
        temp = n;
        int t = n;
        while (n > 0) {
            temp = n;
            rear = temp % 10;
            sum += s.factClaculation(rear);

            n = n / 10;

        }
        if (sum == t) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}