package com.pkg.testingProj;

// Java program to find maximum amount of water that can
// be trapped within given set of bars.

class Test {

    // Method for maximum amount of water
    static int findWater(int[] toweHeight) {

        //arr[1,5,2,3,1,7,2,4]
        int[] maxSeenRight = new int[toweHeight.length];
       int maxSeenSofar = 0;
       int maxSeenleft = 0;
       int water = 0 ;



            for (int i=toweHeight.length-1;i>=0;i--)
            {
                if(toweHeight[i]>maxSeenSofar)
                {
                    maxSeenSofar = toweHeight[i];
                    maxSeenRight[i] = maxSeenSofar;
                }
                else {
                    maxSeenRight[i] = maxSeenSofar;
                }

            }

            for (int j=0;j<toweHeight.length;j++)
            {
            water= water + Integer.max(Integer.min(maxSeenleft,maxSeenRight[j])-toweHeight[j],0);

            if(toweHeight[j]>maxSeenleft)
                maxSeenleft = toweHeight[j];


            }


            return  water;
    }


   static char[] swap1(char[] a,int x,int y)
    {
        char temp = a[x];
        a[x] = a[y];
        a[y] = temp;
            return a;
    }


    static void   permutation(char[] str, int n, int i)
    {
        for (int x=i; x<=n; x++)
        {
            if(n==i)
            {
                System.out.println(str);
            }

    //ABC
     str = swap1(str,i,x);
    permutation(str,n,i+1);
    str = swap1(str,i,x);

        }
    }




    // Driver method to test the above function
    public static void main(String[] args)
    {

        // int toweHeight[] = new int[]{1,5,2,3,1,7,2,4};

       // System.out.println("Maximum water that can be accumulated is " +findWater(toweHeight));
        String str = "Hel";

            permutation(str.toCharArray(), str.length()-1, 0);



        }
    }

