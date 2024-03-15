/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factureishonproyect;

/**
 *
 * @author tDev
 */
public class Productos {
    private int codigo;
    private boolean vencido;
    private String nombreProducto;
    private int precio;

    public Productos(int codigo, boolean vencido, String nombreProducto) {
        this.codigo = codigo;
        this.vencido = vencido;
        this.nombreProducto = nombreProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    
    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", vencido=" + vencido + ", nombreProducto=" + nombreProducto + '}';
    }
    
    public void CalcularPrecio (){
        // cree le metodo
        int suma=0;
        //estoy practicando 
        if (nombreProducto == "agua") {
            suma += precio*0.50;
        }else{
            System.out.println("El sistema no tiene forma de calcular ese tipo de descuento ya que no lo tiene");
            System.out.println("No se que estoy haciendo xd");
            System.out.println("Holaaaaaa, estan viendo el tadeo del pasado hacer cambios en su repositorio");
            System.out.println("son las 10 y 45 de la mañana, esto es como viajar al pasado");
        }
        
        
    }
    
    
}
