package ejemplo5;

public class Punto {
    private int x;
    private int y;
    public Punto(){
        System.out.println("constructor sin parámetros");
    }
    public Punto(int pX, int pY){
        System.out.println("valores asignados a las coordenadas ("+pX+","+pY+")");
    }
    public Punto(int cC){
        System.out.println("Corrdenadas ("+cC+","+cC+")");
    }
}
