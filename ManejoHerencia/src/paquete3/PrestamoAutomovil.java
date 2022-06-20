package paquete3;
import paquete2.*;

public class PrestamoAutomovil extends Prestamo {
    
    String tipo;
    String marca;
    Persona garante1;
    double valorAutomovil;
    double valorMensual;
    
    public PrestamoAutomovil(int m, String c, String t,
            String ma, Persona b, Persona g, double va) { super(b,m,c);
        tipo = t;
        marca = ma;
        garante1 = g;
        valorAutomovil = va;
    }
    
     public void establecerTipo(String x) {
        tipo = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerGarante1(Persona x) {
        garante1 = x;
    }

    public void establecerValorAutomovil(double x) {
        valorAutomovil = x;
    }

    public void establecerValorMensualPago() {
        valorMensual = valorAutomovil / obtenerMesesPrestamo();
    }

    public void establecerCiudadPrestamo() {
        ciudadPrestamo = obtenerCiudadPrestamo().toLowerCase();
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return garante1;
    }
    
    public double obtenerValorAutomovil(){
        return valorAutomovil;
    }
    
    public double obtenerValorMensual(){
        return valorMensual;
    }
    
    @Override
    public String obtenerCiudadPrestamo(){
        return ciudadPrestamo;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("%s\n", super.toString());
        reporte = String.format("%s\n Tipo de automovil: %s\n "
                + "Marca de automovil: %s\n "
                + "Garante: %s\n "
                + "Valor automovil: %.2f\n "
                + "Valor prestamo: %.2f\n "
                + "Ciudad de prestamo: %s",
                reporte,
                obtenerTipo(),
                obtenerMarca(),
                obtenerGarante(),
                obtenerValorAutomovil(),
                obtenerValorMensual(),
                obtenerCiudadPrestamo());
        
        return reporte;
    }
}
