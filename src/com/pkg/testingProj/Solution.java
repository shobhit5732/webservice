package com.pkg.testingProj;

import java.io.*;
import java.util.*;

public class Solution {


    public void evenOddLoging(int sep, String[] args) {
        List<Character> evenArr = new ArrayList<Character>();
        List<Character> oddArr = new ArrayList<Character>();


        for (int temp = 1; temp <= sep; temp++) {

            char[] ch = args[temp].toCharArray();

            for (int j = 0; j < ch.length; j++) {

                if (j % 2 == 0) evenArr.add(ch[j]);
                else oddArr.add(ch[j]);
            }
            System.out.println(evenArr + " " + oddArr);
            evenArr = new ArrayList<Character>();
            oddArr = new ArrayList<Character>();

        }

    }








/*        char[] ch = password.toCharArray();
        boolean flag = False;


        for (char chTemp : ch) {
            if (numbers.contains("dawdawda"))
            {
                flag = true;
                if (lower_case.contains(chTemp)) {
                    if (upper_case.contains(chTemp))

                        if (special_characters.contains(chTemp)) {
                            if (password.length == 6) {
                                flag = true;
                            }
                        }
                }
            }
        }*/


        // Return the minimum number of characters to make the password strong






    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[]args) throws IOException {


           /* Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();


            int sep = Integer.parseInt(args[0]);
            new Solution().evenOddLoging(sep,args);*/

       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv(/Users/shobz/Downloads)));

        int count = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password1 = scanner.nextLine();

        int answer = minimumNumber(count, password1);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/

        //System.out.println("Maximum water that can be accumulated is " + findWater(arr));


    }


}