package com.TestAnswers.T22B;

public class A11 {
    public static void main(String[] args) {
        int[] stations = {2, 4, 8, 3, 10, 1, 12, 3, 2};
        System.out.println("Answer is - " + cheapRt(stations, 3, 2, 4));
    }
    public static int cheapRt(int[] stations, int step1, int step2, int limit){
        String way = "0 + ";
        if(limit == 0){
            return cheapRt(stations, step1, step2, limit, stations[0], 0, step1, way);
        }else{
            return Math.min(cheapRt(stations, step1, step2, limit, stations[0], 0, step1, way),
                    cheapRt(stations, step1, step2, limit, stations[0], 1, step2, way));
        }

    }
    public static int cheapRt(int[] stations, int step1, int step2, int limit, int sum, int step2count,
                              int currentStation, String way){
        if(currentStation == stations.length - 1){
            System.out.println(way + currentStation +  " = " + (sum + stations[currentStation]));
            return sum + stations[currentStation];
        }
        if(currentStation > stations.length - 1){
            return Integer.MAX_VALUE;
        }
        if(step2count == limit || currentStation + step2 > stations.length - 1){
            return cheapRt(stations, step1, step2, limit, sum + stations[currentStation], step2count,
                    currentStation + step1, way + currentStation + " + ");
        }
        else {
            if(step2count < limit && currentStation + step1 > stations.length - 1){
                return cheapRt(stations, step1, step2, limit, sum + stations[currentStation], step2count + 1,
                        currentStation + step2, way + currentStation + " + ");
            }else{
                return Math.min(cheapRt(stations, step1, step2, limit, sum + stations[currentStation], step2count,
                                currentStation + step1, way + currentStation + " + "),
                        cheapRt(stations, step1, step2, limit, sum + stations[currentStation], step2count + 1,
                                currentStation + step2, way + currentStation + " + "));
            }
        }

    }
}
