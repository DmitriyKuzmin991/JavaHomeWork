package org.example;

import org.example.HomeWorkTwo.HomeWorkTwo;

import java.io.IOException;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        String resultJson = HomeWorkTwo.parseJson("text.json");
        String resultString = HomeWorkTwo.parseString(resultJson);
        System.out.println(resultString);
        //String pathToFile = "text2.txt";
       // HomeWorkTwo.writeToFile(resultString,pathToFile);
//        int[] arr = {8,7,6,5,4,3,2,1};
//        int[] res;
//        res = HomeWorkTwo.sortBubbleWithLog(arr);
//        System.out.println(Arrays.toString(res));

        }

    }




