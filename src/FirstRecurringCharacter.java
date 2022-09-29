import java.util.HashMap;
import java.util.HashSet;

public class FirstRecurringCharacter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 2, 6, 8, 5};
        System.out.println(first_re_number(arr));

    }
    public static int first_re_number(int [] arr){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : arr){
//            hashMap.put(num , Boolean.TRUE);
            if(hashSet.contains(num)){
                return num;
            }else {
                hashSet.add(num);
            }
        }
        return 0;

    }
}
