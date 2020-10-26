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
public abstract class Figuras implements FiguraGeometrica {
    
    public abstract float CalcularArea();
    public abstract float CalcularPerimetro();
    public abstract String Nombre();
    
    
}
