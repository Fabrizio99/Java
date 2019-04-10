package ejemplo4;

public class Circulo {
    private double radio;
    private String color;
    static int numeroCirulos=0;
    static final double PI=3.1416;
    
    // metodos 
    
    double getCircunferencia(){
        return radio;
    }
    static double getArea(double r){
        return PI*r*r;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
}
