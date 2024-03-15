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
    
    
}
