package CapaNegocio;

public class DepositoMonedaTipo extends DepositoMonedas {
    // Declaracion de atributos
    private String denominacion;

    public String denominacion() {
        return denominacion;
    }

    public void setdenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    
    // Metodos de la clase persona
    public String verificarmoneda()
    {
        return "El metodo verificar moneda no esta implementado";
    }
    public String devolvermoneda()
    {
        return "El metodo devolver moneda no esta implementado";
    }
}
