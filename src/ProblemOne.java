/*
Write a program that initializes an array with ten random integers and then prints out the 
following:

Every element at an even index;
Every even element
All elements in reverse order;
Only the first and last elements;
The minimum and maximum element
The sum of all elements
The alternating sum of all elements, where the alternating sum contains all elements at even index 
added, and the elements at odd index subtracted.
*/
import java.util.Random;
public class ProblemOne {
    public static void main(String[] args){
        Random rand = new Random();
        int array[] = new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=rand.nextInt(20);
        }
        int max = array[0];
        int min = array[0];
        int sum=0;
        int even=0;
        System.out.println("Every Element at an Even Index:");
        for(int j=0;j<array.length;j++){
            if(j%2==0){
                System.out.println("Index: " + j + ":\t" + array[j]);
                even = even+array[j];
            }
        }
        System.out.println("Every Even Element:");
        for(int l=0;l<array.length;l++){
            if(array[l]%2==0)
                System.out.println("Index: " + l + ":\t" + array[l]);
        }
        System.out.println("All Elements in Reverse Order:");
        for(int k=(array.length-1);k>=0;k--){
            System.out.println("Index: " + k + ":\t" + array[k]);
        }
        for(int m=0;m<array.length;m++){
            if(array[m]<min)
                min = array[m];
            if(array[m]>max)
                max = array[m];
            sum = sum + array[m];
        }
        int odd = even;
        for(int n=0;n<array.length;n++){
            if(n%2!=0){
                odd = odd-array[n];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Even Elments Added: " + even);
        System.out.println("Odd Elements Subtracted: " + odd);
    } 
}
