/*
The Odometer Class: This class will simulate the car’s odometer. Its responsibilities are as follows:

To know the car’s current mileage.

To report the car’s current mileage.

To be able to increment the current mileage by 1 mile. The maximum mileage the odometer can store is 
999,999 miles. When this amount is exceeded, the odometer resets the current mileage to 0.

To be able to work with a FuelGauge object. It should decrease the FuelGauge object’s current amount
 of fuel by 1 gallon for every 24 miles traveled. (The car’s fuel economy is 24 miles per gallon.)

*/
public class Odometer {
    private int odometer;

    public int getOdometer(){
        return odometer;
    }
    public void setOdometer(int a){
        while(a>0){
            odometer++;
            a--;
            if(odometer>=999999)
                odometer=0;
        }

    }
}
