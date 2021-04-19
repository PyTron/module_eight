/*
Write a program that creates a two-dimensional array initialized with test data. Use any primitive
 data type that you wish. The program should have the following methods:

getTotal. This method should accept a two-dimensional array as its argument and return the total of 
all the values in the array.

getAverage. This method should accept a two-dimensional array as its argument and return the average 
of all the values in the array.

getRowTotal. This method should accept a two-dimensional array as its first argument and an integer 
as its second argument. The second argument should be the subscript of a row in the array. The method 
should return the total of the values in the specified row.

getColumnTotal. This method should accept a two-dimensional array as its first argument and an integer 
as its second argument. The second argument should be the subscript of a column in the array. 
The method should return the total of the values in the specified column.

getHighestInRow. This method should accept a two-dimensional array as its first argument and an integer
 as its second argument. The second argument should be the subscript of a row in the array. 
 The method should return the highest value in the specified row of the array.

getLowestInRow. This method should accept a two-dimensional array as its first argument and an
integer as its second argument. The second argument should be the subscript of a row in the array. 
The method should return the lowest value in the specified row of the array.
*/
import java.util.Random;
import java.util.Scanner;
public class ProblemFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Let's Generate an Array");
        System.out.print("How many rows? ");
        int rows = input.nextInt();
        System.out.print("How many columns? ");
        int columns=input.nextInt();
        int[][] array=new int[rows][columns];
        for(int i=0;i<array.length;i++){
            for(int k=0;k<array[i].length;k++){
                array[i][k]=rand.nextInt(10);
            }
        }
        System.out.println("Here's your array...");
        for(int i=0;i<array.length;i++){
            for(int k=0;k<array[i].length;k++){
                System.out.print(array[i][k]+ "     ");
            }
            System.out.println();
        }
        
        System.out.println("The total of all the values: "+ ProblemFive.getTotal(array));
        System.out.println("The average of all the values: "+ ProblemFive.getAverage(array));
        System.out.println("Enter a row number...");
        int rownum=input.nextInt();
        System.out.println("The total of all the values in that row is: "+ ProblemFive.getRowTotal(array, rownum));
        System.out.println("Enter a column number...");
        rownum=input.nextInt();
        System.out.println("The total of all the values in that column is: "+ ProblemFive.getColumnTotal(array, rownum));
        System.out.println("Enter a row number...");
        rownum=input.nextInt();
        System.out.println("The lowest value in that row: "+ ProblemFive.getLowestInRow(array, rownum));
        System.out.println("Enter a row number...");
        rownum=input.nextInt();
        System.out.println("The highest value in that row: "+ ProblemFive.getHighestInRow(array, rownum));
        
    }
    public static int getTotal(int[][] a){
        int total=0;
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a[i].length;k++){
                total=total+a[i][k];
            }
        }            
        return total;
    }
    public static int getAverage(int[][] a){
        int average=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a[i].length;k++){
                average=average+a[i][k];
                count++;
            }
        }      
        average=average/count;
        return average;
    }
    public static int getRowTotal(int[][] a, int b){
        int total=0;
        for(int i=0;i<a[b].length;i++){
            total = total + a[b][i];
        }
        return total;
    }
    public static int getColumnTotal(int a[][], int b){
        int total=0;
        for(int i=0;i<a.length;i++){
            total=total+a[i][b];
        }
        return total;
    }
    public static int getHighestInRow(int a[][], int b){
        int total=a[b][0];
        for(int i=0;i<a[b].length;i++){
            if(a[b][i]>total)
                total = a[b][i];
        }
        return total;
    }
    public static int getLowestInRow(int a[][], int b){
        int total=a[b][0];
        for(int i=0;i<a[b].length;i++){
            if(a[b][i]<total)
                total = a[b][i];
        }
        return total;
    }
}
