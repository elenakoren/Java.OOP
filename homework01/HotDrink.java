package homework01;

public class HotDrink extends Product{
    private int temp;

    private double volume;
    

    public HotDrink(String name,double cost, double volume, int temp) {
        super(name, cost);
        this.temp = temp;
        this.volume = volume;
    }
    public HotDrink(){

    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink [name=" + name + ", temp=" + temp + ", volume=" + volume + "]";
    }

    
    
    
}