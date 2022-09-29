import java.util.Scanner;

public class ReverseAString {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Type a string");
        String str = scanner.nextLine();
        System.out.println(reversed(str));
    }
    public static String reversed(String str){
        StringBuilder reversed_string = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            reversed_string.append(str.charAt(i));
        }
        return reversed_string.toString();
    }
}
