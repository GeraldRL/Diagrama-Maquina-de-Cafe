package CapaNegocio;

public class Ingrediente extends MaquinaCafe {
    // Atributos
    private String nombre;
    private String cantidad;
    private String tipo;
    // Propiedades

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    // Métodos
    public String ElegirIngrediente()
    {
        return "Este método no está implementado";
    }
}
