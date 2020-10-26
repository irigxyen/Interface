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
public class Romboide extends Figuras{
    private float base;
    private float altura;
    private float lado;
    
    public Romboide (){
        super();
    }
    public Romboide (float base, float altura, float lado) {
        
        
        this.base=base;
        this.altura=altura;  
        this.lado=lado;
        
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float getLado() {
        return lado;
    }
    @Override
    public String Nombre(){
        return ("Romboide");
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
        perimetro=((2*base)+(2*lado));
        return perimetro;
    }
}

