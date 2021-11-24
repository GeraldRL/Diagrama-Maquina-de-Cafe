
package CapaNegocio;

public class CafeTinto extends Producto{
    // Declaracion de atributos
    private String tipo;
    private String calidad;
    private String fechaVencimiento;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
      
    // Metodos de la clase persona
    public String Sabor()
    {
        return "El metodo Sabor no esta implementado";
    }
    public String Color()
    {
        return "El metodo Color no esta implementado";
    }
}
