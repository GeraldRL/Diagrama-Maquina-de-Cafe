package CapaNegocio;

public class CafeLeche extends Producto {
    // Declaracion de atributos
    private String tipoLeche;
    private String calidad;
    private String cantidad;

    public String getTipoLeche() {
        return tipoLeche;
    }

    public void setTipoLeche(String tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    // Metodos de la clase persona
    public String Sabor()
    {
        return "El metodo Sabor no esta implementado";
    }
    public String EscogerPrecio()
    {
        return "El metodo Escoger Precio no esta implementado";
    }
}
