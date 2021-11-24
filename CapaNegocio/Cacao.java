package CapaNegocio;

public class Cacao extends Ingrediente{
    private String precio;
    private String calidad;
    private String origen;
    private String fechaVencimiento;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    // Méotods
    public String Fibra()
    {
        return "Este método no está implementado";
    }
    public String Sabor()
    {
        return "Este método no está implementado";
    }
}
