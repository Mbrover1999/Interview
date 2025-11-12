public class knapsack {
    public static void main(String[] args) {
    int Kw = 15;
    int itemNum = 5;
    int[] weightArr = {1,2,4,1,12};
    int[] valueArr = {1,2,10,2,4};
        System.out.println(maxValue(Kw, itemNum, weightArr, valueArr));

    }
    public static int maxValue(int Kw, int itemNum, int[] weightArr, int[] valueArr){
        int max = 0;
        for(int i = 0; i < weightArr.length; i++){
            int tempMax = 0;
            int tempWeight = Kw;
            int tempN = itemNum;
            if(tempWeight > weightArr[i] && itemNum > 0){
                tempWeight = tempWeight - weightArr[i];
                itemNum--;
                tempMax = tempMax + valueArr[i];
            }
            for(int j = i + 1; j < weightArr.length; j++){

                if(tempWeight > weightArr[j] && itemNum > 0){
                    tempWeight = tempWeight - weightArr[j];
                    itemNum--;
                    tempMax = tempMax + valueArr[j];
                }

            }
            max = Math.max(max, tempMax);
        }

        return max;
    }



}
