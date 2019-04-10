/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario1;

/**
 *
 * @author Usuario
 */
public class Punto {
    private int x;
    private int y;
  
    /**public Punto(double pX, double pY){
        this.x=pX;
        this.y=pY;
    }**/
    public void calcularDistancia(){
        
        x=Integer.parseInt(Ventana1.cX.getText());
        y=Integer.parseInt(Ventana1.cY.getText());
        Ventana1.lblResult.setText(Double.toString(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))));
    }
}
