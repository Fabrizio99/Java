package ejemplo4;

public class Ejemplo4 {

    public static void main(String[] args) {
        Circulo c1; // se crea el puntero
        c1 = new Circulo(); //
        /**c1.setRadio(45);
        System.out.println(c1.getRadio());
        System.out.println(Circulo.getArea(c1.getRadio()));**/
        Circulo.numeroCirulos++;
        System.out.println(Circulo.getArea(6));
        Circulo c2 = new Circulo();
        Circulo.numeroCirulos++;
        System.out.println("Hay "+Circulo.numeroCirulos+" circulos");
    }
    
}
