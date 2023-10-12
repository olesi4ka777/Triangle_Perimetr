import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Периметр треугольника равен:"+readSide());

    }
    public static int readSide( ) throws FileNotFoundException {
        String name = "sideTreangle.txt";
        Scanner scan = new Scanner(new File(name));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int p = a + b + c;
        return p;
    }
}
