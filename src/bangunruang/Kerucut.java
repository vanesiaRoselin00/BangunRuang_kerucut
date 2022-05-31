package bangunruang;

public class Kerucut {
    public final float PI = 22.0f/7;
    public double r = 0;
    public double t = 0;
    public double volume = 0; 

    public void hitungvolumekerucut(){
        volume = 1.0f/3.0f * PI * (r*r) * t;
    }

    public void tampilanvolumekerucut(){
        hitungvolumekerucut();
        System.out.println("Volume kerucut = 1/3 * " + PI + " * (" + r + " * " + r + ") * " + t +" = " + volume + " cm3");
    }
    
}
