import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args){
        String string = sc.nextLine();

        Text text = new Text("banana myth aardvark catalog drama anaconda sky panorama caramel alpha extravaganza lamp");

        System.out.println(text.sort('a'));
    }
}
