/*
To be able to work with a FuelGauge object. It should decrease the FuelGauge object’s current amount 
of fuel by 1 gallon for every 24 miles traveled. (The car’s fuel economy is 24 miles per gallon.)


*/
public class FuelGauge {
    private int mpg = 24;
    private int fuel;
    public int getMPG(){
        return mpg;
    }
    public void setMPG(int a){
        mpg=a;
    }
    public void setFuel(int a){
        fuel=a;
    }
    public int getFuel(){
        return fuel;
    }

}
