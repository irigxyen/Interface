/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author Karla
 */
public class Rectangulo extends Figuras {
    private float base;
    private float altura;
    
    public Rectangulo() {
        super();
    }
    
    
    public Rectangulo (float base, float altura) {
        
        
        this.base=base;
        this.altura=altura;  
        
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    @Override
    public String Nombre(){
        return ("Rectangulo");
    }
   
    @Override
    public float CalcularArea(){
        float area;
        area= (base*altura);
        return area;
        
    }
    
    @Override
    public float CalcularPerimetro(){
        float perimetro;
        perimetro=((2*altura)+(2*base));
        return perimetro;
    }

}
