package CapaNegocio;

public class Cafelate extends Producto {
    // Declaracion de atributos
    private String cantidad;
    private String calidad;
    private String tamaño;

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

        
    // Metodos de la clase persona
    public String Promocinar()
    {
        return "El metodo Promocionar no esta implementado";
    }
    public String Vender()
    {
        return "El metodo Vender no esta implementado";
    }
}
