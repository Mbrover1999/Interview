public class Main {
    //    public static void main(String[] args) {
////        QueUsingSet queUsingSet = new QueUsingSet();
////        queUsingSet.push(65);
////        queUsingSet.push(56);
////        System.out.println(queUsingSet.pop());
////        queUsingSet.push(435);
////        System.out.println(queUsingSet.pop());
////        int[] arr= {1, 2, 3, 4, 40};
////        int[] dou = Arrays.stream(arr).map(num -> num * 2).toArray();
////        Arrays.stream(dou).forEach(System.out::println);
//    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 8, 10, 45};

        System.out.println(findNum(arr, 0, arr.length - 1, 6));
    }

    public static int findNum(int[] arr, int start, int end, int num) {
        if (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                start = mid + 1;
                findNum(arr, start, end, num);
            } else {
                end = mid - 1;
                findNum(arr, start, end, num);
            }
        }
        return -1;
    }
}