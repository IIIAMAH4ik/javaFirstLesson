import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("tell you age");
        String age = scanner.nextLine();
        switch (age) {
            case "j":
                System.out.println("you are born");
                break;
            case " ":
                System.out.println("go to shool");
                break;
            default:
                System.out.println("you cunt");
                break;
        }
    }
}
