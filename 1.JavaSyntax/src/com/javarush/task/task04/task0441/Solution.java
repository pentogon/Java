package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(nums);
        System.out.print(nums[1]);

    }
}
