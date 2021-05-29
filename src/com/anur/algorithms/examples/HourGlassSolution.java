import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size()-2; i++){
            for(int j = 0; j < arr.size()-2; j++){
                System.out.println(arr.get(i).get(j) + " " + arr.get(i).get(j+1) + " " + arr.get(i).get(j+2)
                        + "\n " + arr.get(i+1).get(j+1)
                        + "\n " + arr.get(i+2).get(j) + " " + arr.get(i+2).get(j+1) + " " + arr.get(i+2).get(j+1));
                int val = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                        + arr.get(i+1).get(j+1)
                        + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if(val > max ){
                    max = val;
                }
            }
        }
        return max;

    }

}

public class HourGlassSolution {
    public static void main(String[] args) throws IOException {


        /*
        List<Integer> temp1 = new ArrayList<>();temp1.add(1);temp1.add(1);temp1.add(1);temp1.add(0);temp1.add(0);temp1.add(0);
        List<Integer> temp2 = new ArrayList<>();temp2.add(0);temp2.add(1);temp2.add(0);temp2.add(0);temp2.add(0);temp2.add(0);
        List<Integer> temp3 = new ArrayList<>();temp3.add(1);temp3.add(1);temp3.add(1);temp3.add(0);temp3.add(0);temp3.add(0);
        List<Integer> temp4 = new ArrayList<>();temp4.add(0);temp4.add(0);temp4.add(2);temp4.add(4);temp4.add(4);temp4.add(0);
        List<Integer> temp5 = new ArrayList<>();temp5.add(0);temp5.add(0);temp5.add(0);temp5.add(2);temp5.add(0);temp5.add(0);
        List<Integer> temp6 = new ArrayList<>();temp6.add(0);temp6.add(0);temp6.add(1);temp6.add(2);temp6.add(4);temp6.add(0);
        arr.add(temp1);arr.add(temp2);arr.add(temp3);arr.add(temp4);arr.add(temp5);arr.add(temp6);
        System.out.println(arr);
        System.out.println(Result.hourglassSum(arr));*/
        readFile();
    }

    public static void readFile() throws IOException {
        List<List<Integer>> arr = new ArrayList<>();

        File f = new File(System.getProperty("FILE_DIR")+"/resources/input00.txt");

        Scanner myReader = new Scanner(f);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String str[] = data.split(" ");
            List<Integer> al = new ArrayList<Integer>();

            for (String s: str){
                al.add(Integer.valueOf(s));
            }
            arr.add(al);
        }
        System.out.println(arr);

    }
}
