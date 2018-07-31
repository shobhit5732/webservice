package example;

import java.util.Arrays;

public class noOfPlatformProb {

    public static void main(String[] args) {

        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1120, 1130, 1200, 1900, 2000};


        noOfPlatformProb temp = new noOfPlatformProb();
        int[] sortedArr = temp.sortedArray(arr, dep);

        System.out.println(noOfPlatformProbSolution(arr, dep));
        //900 A  1
        //910 D  0
        //940 A  1
        //950 A  2
        //1100 A 3
        //1120 D 2

    }

    private static int noOfPlatformProbSolution(int[] arrival, int[] departure) {


        int platNeeded = 1;
        int maxPlat = 1;
        int i = 1, j = 0;
        Arrays.sort(arrival);
        Arrays.sort(departure);


        while (i < arrival.length && j < departure.length) {
            if (arrival[i] <= departure[j]) {
                platNeeded++;
                i++;

                if (platNeeded > maxPlat) maxPlat = platNeeded;

            } else {
                platNeeded--;
                j++;
            }

        }
        return maxPlat;

    }


    int[] sortedArray(int[] arry1, int[] arry2) {
        int[] sortedAr = new int[arry1.length + arry2.length];

        int i = 0, j = 0, k = 0;
        while (i < arry1.length && j < arry2.length) {
            if (arry1[i] < arry2[j]) {
                sortedAr[k++] = arry1[i++];
            } else {
                sortedAr[k++] = arry2[j++];

            }


        }
        while (i < arry1.length) sortedAr[k++] = arry1[i++];
        while (j < arry2.length) sortedAr[k++] = arry1[j++];

       /* for (int temp = 0; temp < sortedAr.length; temp++) {
            System.out.println(sortedAr[temp]);


        }*/

        return sortedAr;

    }

}
