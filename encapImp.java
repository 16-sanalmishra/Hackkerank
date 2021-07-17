import java.util.Scanner;

public class encapImp {
    private int a;
    private String m;

    public int getA() {
        return a;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        encapImp e = new encapImp();
        e.setA(1);
        System.out.println(e.getA());
        e.setM("Sanal");
        System.out.println(e.getM());

        sc.close();
    }
}
