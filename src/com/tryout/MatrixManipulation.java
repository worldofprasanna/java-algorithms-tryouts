package com.tryout;

public class MatrixManipulation {

    public static void main(String[] args) {
        int arr[][]={{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        printMatrix(arr, 5, 5);
    }


    /*
    * Key point is to use variable names properly. I had confused a lot when I used i, j, r, c and tried for an hour
    * without getting the result. But once I tried it with rowStart, rowEnd, colStart, colEnd I got the result in 15 mins.
    * */
    
    private static void printMatrix(int [][] arr, int rowEnd, int colEnd) {
        int rowStart=0, colStart=0;
        while (colStart < colEnd && rowStart < rowEnd) {

            for (int i=colStart; i < colEnd; i++)
                System.out.print(arr[rowStart][i]+" ");
            rowStart++;

            for (int j=rowStart; j< rowEnd; j++)
                System.out.print(arr[j][colEnd-1]+" ");
            colEnd--;

            for (int i=colEnd-1; i>=colStart;i--)
                System.out.print(arr[rowEnd-1][i]+" ");
            rowEnd--;

            for (int i=rowEnd-1; i>=rowStart; i--)
                System.out.print(arr[i][colStart]+" ");
            colStart++;

        }
    }

}
