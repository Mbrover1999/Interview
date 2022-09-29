public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {-2, 0, 2, 4, 31, 908};
        int[] arr2 = {4, 8, 30, 56 ,454};

        int[] merged_array = mergeArrays(arr1, arr2);
        for (int num :
                merged_array) {
            System.out.print(num + (merged_array[merged_array.length - 1] == num ? "." : ", "));

        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged_array = new int[arr1.length + arr2.length];
        int m_index = 0;
        int arr1_index = 0;
        int arr2_index = 0;
        while (m_index != merged_array.length) { // this loops until the merged_array is filled
            if (arr1_index == arr1.length) { // if we finished looping through arr2 fill array_merged with arr2
                merged_array[m_index] = arr2[arr2_index]; // fill item to merged_array
                m_index++; // move to next index of merged array
            } else if (arr2_index == arr2.length) { // if we finished looping through arr2 fill array_merged with arr1
                merged_array[m_index] = arr1[arr1_index];
                m_index++;  // move to next index of merged array
            } else {
                if (arr1[arr1_index] <= arr2[arr2_index]) { // if num in arr1 is smaller push the number insides merged_ array
                    merged_array[m_index] = arr1[arr1_index];
                    arr1_index++; // fill item to merged_array
                    m_index++;  // move to next index of merged array
                } else if (arr1[arr1_index] > arr2[arr2_index]) { // if num in arr2 is smaller push the number insides merged_ array
                    merged_array[m_index] = arr2[arr2_index];
                    arr2_index++; // fill item to merged_array
                    m_index++;  // move to next index of merged array
                }

            }


        }
        return merged_array;

    }
}
//arr1_index != (arr1.length) && arr2_index != (arr2.length)
