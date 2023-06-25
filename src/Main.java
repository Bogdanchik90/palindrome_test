import java.util.Scanner;

//Определить является ли слово полиндромом
public class Main {

    public static void main(String[] args) {

        String str;
        boolean on = true;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите слово: ");
        str = scan.nextLine();
        str = str.toLowerCase();

        char[] charArray = str.toCharArray();

        int j = charArray.length;
        for (int i = 0; i < charArray.length; i++) {
            if (on && j > 0) {
                if (charArray[i] == charArray[j-1]) {
                    j--;
                } else {
                    on = false;
                }
            }
        }

        if (on) {
            System.out.println("СЛОВО ПОЛИНДРОМ");
        } else {
            System.out.println("СЛОВО НЕ ЯВЛЯЕТСЯ ПОЛИНДРОМОМ");
        }

    }
}