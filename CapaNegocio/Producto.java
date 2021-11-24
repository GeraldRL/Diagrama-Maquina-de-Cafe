
package CapaNegocio;

public class Producto extends MaquinaCafe {
     // Declaracion de atributos
    private String nombre;
    private String costo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
     // Metodos de la clase producto
    public String EscogerSabor()
    {
        return "El metodo Escoger Sabor no esta implementado";
    }
    public String VenderProducto()
    {
        return "El metodo Vender Producto no esta implementado";
    }
}    


