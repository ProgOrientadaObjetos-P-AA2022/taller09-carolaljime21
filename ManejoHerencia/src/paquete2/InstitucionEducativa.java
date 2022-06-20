package paquete2;

public class InstitucionEducativa {
    
    String nombre;
    String siglas;
    
    public InstitucionEducativa(String n, String s){
        nombre = n;
        siglas = s;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerSiglas(String x){
        siglas = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerSiglas(){
       return siglas;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("\n\tNombre: %s\n"
                + "\tSiglas: %s\n",
                obtenerNombre(),
                obtenerSiglas());
        return reporte;
    }
    
}
