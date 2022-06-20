package paquete2;

public class Prestamo {
    
    protected Persona beneficiario;
    protected int mesesPrestamo;
    protected String ciudadPrestamo;
    
    public Prestamo(Persona b, int m, String c){
        beneficiario = b;
        mesesPrestamo = m;
        ciudadPrestamo = c;
    }
    
    public void establecerBeneficiario(Persona x){
        beneficiario = x;
    }
    
    public void establecerMesesPrestamo(int m){
        mesesPrestamo = m;
    }
    
    public void establecerCiudadPrestamo(String c){
        ciudadPrestamo = c;
    }
    
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    
    public int obtenerMesesPrestamo(){
        return mesesPrestamo;
    }
    
    public String obtenerCiudadPrestamo(){
        return ciudadPrestamo;
    }
    
    @Override
    public String toString(){
        String datos = String.format("Beneficiario: %s\n "
                + "Meses de prestamo: %d\n ",
                obtenerBeneficiario(),
                obtenerMesesPrestamo());
        return datos;
    }
    
}
