public class FizzBuzz {
    static int THREE = 3;
    static int FIVE = 5;

    public static void main(String[] args) {
        fizzBuzz(50);
    }
    public static void fizzBuzz(int n){
        // List<String> = new List<>();
        for(int i = 1; i <= n; i++){
            if(i % THREE == 0){
                if(i % FIVE == 0){
                    System.out.println("FIZZBUZZ");
                }else{
                    System.out.println("FIZZ");
                }

            }else{
                if(i % FIVE == 0){
                    System.out.println("BUZZ");
                }else{
                    System.out.println(i);

                }
            }
        }
    }
}
