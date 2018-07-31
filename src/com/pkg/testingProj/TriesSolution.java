
package com.pkg.testingProj;
import java.util.*;
public class TriesSolution {


    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {
        TNode root = new TNode();
        root.add("hak", 0);
        root.add("hakerrank", 0);
        root.add("hacrrank", 0);
        root.add("hak", 0);


        //System.out.println("count:"+root.findCount("hac",0, new TNode()));
       // int a[] = {3,2,1};

        //countSwaps(a);

       // scanner.close();

        //int arr[] = {64, 34, 25, 12, 22, 11, 90};

        //bubbleSort(arr, arr.length);

        int n = 4;

        int arr[][] =
                {
                        {1, 2, 4, 2 },
                        {4 , 5, 6, 1},
                        {10, 8, -12, 5},
                        {10, 8, -1, -1}
                };

        System.out.print(difference(arr, n));


    }


    static int countSwaps(int[] a) {
        int count = 0;

        if (a.length < 0) return 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    count++;
                }
            }


        }

        return count;

    }

    static void bubbleSort(int arr[], int n) {
        // Base case
        if (n == 1)
            return;

        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n - 1);
    }


    public static int difference(int arr[][], int n)
    {
        // Initialize sums of diagonals
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += arr[i][j];

                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }

}
