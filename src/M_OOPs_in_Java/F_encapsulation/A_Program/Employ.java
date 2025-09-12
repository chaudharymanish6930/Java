package M_OOPs_in_Java.F_encapsulation.A_Program;

public class Employ {
    private double sallery;
    protected void setter(double x){
        sallery = x;
    }
    public double getter(){
        return sallery;
    }
    public static void main(String[] args) {
        Employ e1 = new Employ();
        e1.setter(10000);
        System.out.println(e1.getter());
    }
}
