package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        // Put your code here
    	int [][] result = new int[matrix1.length][matrix2[0].length];
    	int check = matrix2.length;
    	
    	for(int i = 0; i < result.length; i++) {
    		for(int j = 0; j < result[0].length; j++) {
    			int sumR = 0;
    			for(int c = 0;c < check; c++) {
    				sumR += matrix1[i][c] * matrix2[c][j];
    			}
    			result[i][j] = sumR;
    		}
    	}
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
