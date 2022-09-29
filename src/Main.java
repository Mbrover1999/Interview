import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QueUsingSet queUsingSet = new QueUsingSet();
        queUsingSet.push(65);
        queUsingSet.push(56);
        System.out.println(queUsingSet.pop());
        queUsingSet.push(435);
        System.out.println(queUsingSet.pop());
        int[] arr= {1, 2, 3, 4, 40};
        int[] dou = Arrays.stream(arr).map(num -> num * 2).toArray();
        Arrays.stream(dou).forEach(System.out::println);
    }
}