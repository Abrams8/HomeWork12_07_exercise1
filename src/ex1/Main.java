package ex1;

public class Main {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 150);
        int y = (int) (Math.random() * 150);
        int z = (int) (Math.random() * 150);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        if (x>z) {
            System.out.println(x+y);
        } else {
            System.out.println(z);
        }
        System.out.println((x+y+z)/3);
    }
}
