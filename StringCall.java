import java.util.ArrayList;
import java.util.Scanner;

public class StringCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();

        System.out.println("Enter 6 characters:");

        for (int i = 0; i < 6; i++) {
            list.add(sc.next().charAt(0));
        }

        String str = "";

        for (char ch : list) {
            str = str + ch;
        }

        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());

        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse: " + rev);

        int mid = str.length() / 2;

        System.out.println("First word: " + str.substring(0, mid));
        System.out.println("Second word: " + str.substring(mid));

        sc.close();
    }
}