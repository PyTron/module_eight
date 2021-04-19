/*
Design and implement an application that reads a sequence of up to 25 pairs of names and postal 
(ZIP) codes for individuals. Store the data in an object designed to store a first name (string),
 last name (string), and postal code (integer). Assume each line of input will contain two strings
  followed by an integer value, each separated by a tab character. Then, after the input has been read 
  in, print the list in an appropriate format to the screen.
*/
import java.util.Scanner;
public class ProblemThree {
    public static void main(String[] args){
        Scanner value = new Scanner (System.in);
        System.out.println("How many inputs?:");
        int total = value.nextInt();
        String arrayFirst[] = new String[total];
        String arraySecond[] = new String[total];
        int arrayZip[] = new int[total];
        int count=0,countTwo=0,countThree=0;
        for(int x=0;x<total;x++){
            Scanner input = new Scanner(value.next());
            input.useDelimiter("\t");
            while(input.hasNext()){
                if(countTwo==0){
                    arrayFirst[count-countThree]=input.next();
                    countTwo++;
                    countThree++;
                }
                else if(countTwo==1){
                    arraySecond[count-countThree]=input.next();
                    countTwo++;
                    countThree++;
                }
                else{
                    arrayZip[count-countThree]=input.nextInt();
                    countTwo=0;
                }
                
                x=x-1;
            }
            input.close();
            count++;
            if(count%3==0){
                x=(count/3)-1;
            }
        }
        for(int i=0;i<total;i++){
            System.out.println("Person " + (i+1));
            System.out.println("First Name: " + arrayFirst[i]);
            System.out.println("Last Name: " + arraySecond[i]);
            System.out.println("Zip: " + arrayZip[i] + "\n");
        }
    }
}
