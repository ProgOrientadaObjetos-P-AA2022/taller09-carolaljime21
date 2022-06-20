package paquete4;

import paquete2.*;

public class PrestamoEducativo extends Prestamo {

    String nivelEstudio;
    InstitucionEducativa centroEducativo;
    double valorCarrera;
    double valorMensualCarrera;

    public PrestamoEducativo(String nE, InstitucionEducativa cE, double vC,
            Persona b, int m, String c) {
        super(b, m, c);

        nivelEstudio = nE;
        centroEducativo = cE;
        valorCarrera = vC;
    }
    
    public void establecerNivelEstudio(String x){
        nivelEstudio = x;
    }
    
    public void establecerCentroEducativo(InstitucionEducativa x){
        centroEducativo = x;
    }
    
    public void establecerValorCarrera(double x){
        valorCarrera = x;
    }
    
    public void establecerValorMensualCarrera(){
        valorMensualCarrera = (valorCarrera / mesesPrestamo);
        valorMensualCarrera = valorMensualCarrera - (valorMensualCarrera * 0.1);
    }
    
    public String obtenerNivelEstudio(){
        return nivelEstudio;
    }
    
    public InstitucionEducativa obtenerCentroEducativo(){
        return centroEducativo;
    }
    
    public double obtenerValorCarrera(){
        return valorCarrera;
    }
    
    public double obtenerValorMensualCarrera(){
        return valorMensualCarrera;
    }
    
    @Override
    
    public String toString(){
        String reporte = String.format("%s\n", super.toString());
        reporte = String.format("%s\n Nivel de estudio: %s\n"
                + "Centro educativo: %s\n"
                + "Valor carrera: %.2f\n"
                + "Valor mensual: %.2f\n",
                reporte,
                obtenerNivelEstudio(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMensualCarrera());
        return reporte;
    }
    
}
