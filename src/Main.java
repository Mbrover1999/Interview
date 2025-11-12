public class Main{
    public static void main(String[] args) {
        int[] x = {0};
        System.out.println(x[0]);
        lol(x);
        System.out.println(x[0]);
    }
    public static void lol(int[] x){
        x[0] = 2;
    }


        }