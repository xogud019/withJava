package CodingTest.Hackers.Medium.Implementation;
import java.io.*;
import java.util.*;

public class TheTimeinWords {
    static String[] minutes = { "one minute","two minutes","three minutes","four minutes",
                                "five minutes","six minutes","seven minutes","eight minutes",
                                "nine minutes","ten minutes","eleven minutes","twelve minutes",                                          "thirteen minutes","forteen minutes","quarter","sixteen minutes",
                                "seventeen minutes","eighteen minutes","nineteen minutes",
                                "twenty minutes","twenty one minutes","twenty two minutes",
                                "twenty three minutes","twenty four minutes","twenty five minutes",
                                "twenty six minutes","twenty seven minutes","twenty eight minutes",
                                "twenty nine minutes","half" };

    static String[] hours = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",                                    "ten", "eleven", "twelve" };
    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        System.out.println(m);
       if(m==0){
           return hours[h-1]+" o' "+"clock";
       }
       else if(m!=0&&m<=30){
           return minutes[m-1]+" past "+hours[h-1];
       }
       else return minutes[60-m-1]+" to "+hours[h];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}