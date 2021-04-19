/*
Write a program that reads a sequence of input values and displays a bar chart of the values in data, using asterisks, like this:

*********************
*************************
*********
**************************

You may assume that all values are positive. First figure out the maximum value in data. 
That value's bar should be drawn with 40 asterisks. Shorter bars should use proportionally fewer asterisks. 
Improve your program by adding caption to your bar. Prompt the user for the captions and data values. 
The output should look like this:

Egypt *********************

France *************************

Norway *********

Germany **************************
*/
import java.util.Scanner;
public class ProblemTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How big is the dataset?: ");
        int dataSet = input.nextInt();
        String caption[] = new String[dataSet];
        int data[]=new int[dataSet];
        int max=0;
        for(int i=0;i<caption.length;i++){
            System.out.print("Enter Caption: ");
            caption[i]=input.next();
            System.out.print("Enter Data for " + caption[i] + ": ");
            data[i]=input.nextInt();
            if(data[i]>max)
                max=data[i];
        }
        Double multiplier = 40.0/max;
        int asterisks;
        for(int j=0;j<caption.length;j++){
            asterisks = (int)(data[j]*multiplier);
            System.out.print(caption[j] + ": ");
            for(int k=0;k<asterisks;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
