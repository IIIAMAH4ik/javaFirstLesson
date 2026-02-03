import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int value;
        do {
            value = scanner.nextInt();
        }while (value!=5);
        System.out.println("вы ввели 5");
    }
}
