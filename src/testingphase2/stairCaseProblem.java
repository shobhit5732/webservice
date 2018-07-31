package testingphase2;

import java.util.*;
import java.lang.*;
import java.util.Stack;

public class stairCaseProblem {


    public static void main(String[] args) {
     /*   int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }*/

        //sumOfLargeNum("7777555511111111", "3332222221111");
        // Input:
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        //{4, 3, 7, 8, 6, 2, 1};
        //

        // zigZagArr(arr);
        //System.out.print(Arrays.toString(arr));
      //  );

    }

    static int[] zigZagArr(int[] arr) {
        int temp = 0;
        boolean bool = true;

        for (int i = 0; i <= arr.length - 2; i++) {

            //less than expected
            if (bool) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
            //greater than expected
            else if (arr[i] < arr[i + 1]) {
                // swap
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
            bool = !bool;
        }
        return arr;
    }

    static int[] swapFunc(int[] a, int x, int y) {

        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
        return a;

    }

    static void sumOfLargeNum(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        String pointerStr;
        int total = 0;
        s1 = reverseString(s1);
        s2 = reverseString(s2);
        if (s1.length() > s2.length()) pointerStr = s1;
        pointerStr = s2;
        int carry = 0;

        for (int i = 0; i < pointerStr.length(); i++) {
            int intAr1 = Character.getNumericValue(s1.charAt(i));
            int intAr2 = Character.getNumericValue(s2.charAt(i));

            total = intAr1 + intAr2 + carry;

            if (total < 10) {
                result.append(total);
                carry = 0;

            } else {

                if (total >= 10) {
                    result.append(total - 10);
                    carry = 1;

                }


            }


        }


        System.out.println(reverseString(result.toString()));

    }

    static String reverseString(String tempStr) {

        StringBuilder stBull = new StringBuilder();
        char[] chars = tempStr.toCharArray();
        for (int j = chars.length - 1; j >= 0; j--) {
            stBull.append(chars[j]);
        }


        return stBull.toString();

    }

    // Method for zig-zag conversion of array
    static void zigZag(int[] arr) {
        // Flag true indicates relation "<" is expected,
        // else ">" is expected.  The first expected relation
        // is "<"
        boolean flag = true;

        int temp = 0;

        for (int i = 0; i <= arr.length - 2; i++) {
            if (flag)  /* "<" relation expected */ {
                /* If we have a situation like A > B > C,
                   we get A > B < C by swapping B and C */
                if (arr[i] > arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            } else /* ">" relation expected */ {
                /* If we have a situation like A < B < C,
                   we get A < C > B by swapping B and C */
                if (arr[i] < arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; /* flip flag */
        }
    }





}

