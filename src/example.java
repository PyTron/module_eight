import java.util.Scanner;
public class example {
    public static void main(String[] args){
        FuelGauge gaugeOne = new FuelGauge();
        Odometer OdOne= new Odometer();
        Scanner input = new Scanner(System.in);
        System.out.println("Add gas?");
        String a = input.next();
        a = a.toLowerCase();
        if(a.charAt(0)=='y'){
            System.out.println("how much gas to add?");
            int b = input.nextInt();
            gaugeOne.setFuel(b);
        }
        else{
        System.out.println("How many miles did you travel?");
        
        }
    }
}
