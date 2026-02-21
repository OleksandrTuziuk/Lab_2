import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("Введіть текст: ");
        final String string = sc.nextLine();
        while (true) {
            System.out.println("Введіть символ за яким буде відбуватись сортування: ");
            final String letter = sc.nextLine();
            if (letter.length() > 1) {
                System.out.println("Введено декілька символів");
                continue;
            }
            break;
        }

        Text text = new Text(string);

        System.out.println(text.sort('a'));
    }
}
