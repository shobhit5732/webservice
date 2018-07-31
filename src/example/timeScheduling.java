package example;
///Users/shobz/Downloads/webservice/src/testingphase2/Book1.csv"

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

class compareInterval implements Comparator<Interval> {
    public int compare(Interval a, Interval b) {
        return a.start - b.start;
    }
}

class Interval {
    int start;
    int end;

    Interval(int x, int y) {
        start = x;
        end = y;
    }

}

public class timeScheduling {
    public static void main(String[] args) {
        timeScheduling ts = new timeScheduling();
        ArrayList<Interval> intervalArr = new ArrayList<>();
        Interval temp;

        final String COMMA = ",";
        // Create the file reader
        BufferedReader fileReader = null;
        Scanner s1 = new Scanner(System.in);

        String line = "";
        try {
            String file1 = s1.next();
            // "C://Users//JaiswSX//Downloads//Book1.csv"

            fileReader = new BufferedReader(new FileReader(file1));
            String file2 = s1.next();
            // "C://Users//JaiswSX//Downloads//file2.txt"
            File file = new File(file2);

            PrintStream console = System.out;

            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);
            while ((line = fileReader.readLine()) != null) {

                String[] tokens = line.split(COMMA);

                if (tokens.length > 0) {
                    System.out.println(tokens[0]);
                    if (tokens[0].equalsIgnoreCase("add")) {
                        intervalArr.add(new Interval(Integer
                                .parseInt(tokens[1]), Integer
                                .parseInt(tokens[2])));

                        ts.addInterval(intervalArr,
                                intervalArr.size());

                    }
                    if ("remove".equalsIgnoreCase(tokens[0])) {
                        temp = new Interval(Integer.parseInt(tokens[1]),
                                Integer.parseInt(tokens[2]));

                        ts.removeInterval(intervalArr,
                                temp, intervalArr.size());

                    }
                    System.out.println("");

                }
            }

            System.setOut(console);

        } catch (Exception e) {

            System.out.println("Error in Csv FileReader !!!");

            e.printStackTrace();

        } finally {

            try {

                fileReader.close();

            } catch (IOException e) {

                System.out.println("Error while closing fileReader !!!");

                e.printStackTrace();

            }

        }

    }

    void removeInterval(ArrayList<Interval> intervalArr, Interval temp, int n) {

        boolean bool = false;
        int max = intervalArr.get(n - 1).end;
        int min = intervalArr.get(0).start;

        for (int j = 0; j < n; j++) {
            if (temp.start > intervalArr.get(j).start && temp.start > min) {
                min = intervalArr.get(j).start;

            }

            if (temp.end < intervalArr.get(j).end && temp.end < max
                    || max < intervalArr.get(j + 1).start) {
                max = intervalArr.get(j).end;
                break;
            }
        }

        for (int i = 0; i < n; i++) {

            if (min == intervalArr.get(i).start) {
                intervalArr.get(i).end = temp.start;
                bool = true;
                continue;

            }
            if (max == intervalArr.get(i).end) {
                intervalArr.get(i).start = temp.end;
                bool = false;

            }
            if (bool) {
                intervalArr.remove(i);
                n--;

            }

        }

        if (n == 1)
            intervalArr.add(new Interval(temp.end, max));

        for (int k = 0; k < intervalArr.size(); k++) {

            System.out.print("[" + intervalArr.get(k).start + ","
                    + intervalArr.get(k).end + "]");

        }

    }

    void addInterval(ArrayList<Interval> arr, int n) {
        Collections.sort(arr, new compareInterval());

        if (n <= 0)
            return;

        // Create an empty stack of intervals
        Stack<Interval> s = new Stack<>();
        s.push(arr.get(0));

        for (int i = 1; i < n; i++) {

            Interval top = s.peek();
            if (top.end < arr.get(i).start) {
                s.push(arr.get(i));
            } else if (top.end < arr.get(i).end) {
                top.end = arr.get(i).end;
                s.pop();
                s.push(top);
            }

        }



        while (!s.empty()) {
            Interval t = s.peek();
            System.out.print("[" + t.start + "," + t.end + "]");

            s.pop();
        }

        return;

    }
}
