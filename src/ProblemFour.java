/*
A theater seating chart is implemented as a two-dimensional array of ticket prices like presented 
below. Write a program that prompts the users to pick either a seat or a price. Mark sold seats by 
changing the price to zero. When a user specifies a seat, make sure it is available. When a user 
specifies a price, find any seat with that price. Verify that the price is among those offered by the 
theater.
10 10 10 10 10 10 10 10 10 10
10 10 10 10 10 10 10 10 10 10
10 10 10 10 10 10 10 10 10 10
10 10 20 20 20 20 20 20 10 10
10 10 20 20 20 20 20 20 10 10
10 10 20 20 20 20 20 20 10 10
20 20 30 30 40 40 30 30 20 20
20 30 30 40 50 50 40 30 30 20
30 40 50 50 50 50 50 50 40 30
*/
import java.util.Scanner;
public class ProblemFour{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int seats[][] = new int[][]{
            new int[]{10,10,10,10,10,10,10,10,10,10},
            new int[]{10,10,10,10,10,10,10,10,10,10},
            new int[]{10,10,10,10,10,10,10,10,10,10},
            new int[]{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            new int[]{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            new int[]{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            new int[]{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
            new int[]{20, 30, 30 ,40, 50, 50, 40, 30, 30, 20},
            new int[]{30, 40, 50, 50, 50, 50, 50 ,50, 40, 30},
        };
        char[] seatChar = {'A','B','C','D','E','F','G','H','I'};
        boolean purchase = true, seatSel=true;
        while(purchase){
            System.out.println("Available Seats: ");
            for(int i=0;i<seats.length;i++){
                for(int k=0;k<seats[i].length;k++){
                    System.out.print(seatChar[i] + ((k+1) + ": ") + seats[i][k]+ "     ");
                }
                System.out.println();
            }            
            System.out.println("Would you like to select by seat or price?  Enter 'exit' to exit");
            seatSel=true;
            while(seatSel){
                String select = input.next();
                select.toLowerCase();
                if(select.equals("seat")){
                    System.out.println("Enter Seat ID");
                    String seatID = input.next();
                    seatID = seatID.toUpperCase();
                    for(int l=0;l<9;l++){
                        if(seatChar[l] == seatID.charAt(0)){
                            if(seatID.length()==2)
                                if(Character.isDigit(seatID.charAt(1)))
                                    seats[l][(Character.getNumericValue(seatID.charAt(1)))-1] = 0;
                            if(seatID.length()==3)
                                if(Character.isDigit(seatID.charAt(1))&&seatID.charAt(2)=='0')
                                    seats[l][(Integer.parseInt(String.valueOf(seatID.charAt(1)+""+seatID.charAt(2))))-1] = 0;
                            seatSel=false;
                        }

                    }
                }
                else if(select.equals("price")){
                    System.out.println("Enter a seat price");
                    int seatID = input.nextInt();
                    Boolean seatFound=false;
                    for(int i=0;i<seats.length;i++){
                        for(int k=0;k<seats[i].length;k++){
                            if(seats[i][k]==seatID){
                                seats[i][k]=0;
                                System.out.print("You have been assigned: " + seatChar[i] + ((k+1)));
                                seatFound=true;
                                break;
                            }
                        }
                        if(seatFound)
                            break;
                    }
                    if(!seatFound)
                        System.out.println("No seat available at that price");     
                    seatSel=false;
                }
                else{
                    System.out.println("Invalid Entry.  Enter 'price' to select by price, Enter 'seat' to seect by seat, or enter 'exit' to exit.");
                }
            }
        }

    }
}