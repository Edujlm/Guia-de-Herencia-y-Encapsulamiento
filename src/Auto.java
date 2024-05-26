public class Auto extends VehiculoPasajeros{
    private String tipoCombustible;
private double CostoporKm;
private int KilometrosRecorridos;
    //Constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros, tipoCombustible);
        this.tipoCombustible = tipoCombustible;
    }

    //Get, set para tipocombustible
    public String getTipoCombustible(){
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
     

    //sobreescribir el metodo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }
    public void RealizarMantenimiento(){
        super.RealizarMantenimiento();
        System.out.println("Mantenimiento de bateria");
        System.out.println("Mantenimiento de Amortiguadores");
        System.out.println("Mantenimiento de Clucth");

    }
public double GetCostoporKm(){
    return CostoporKm;
}
public void SetCostoporKm(double CostoporKm){
this.CostoporKm=CostoporKm;
}
public int GetkilometrosRecorridos(){
    return KilometrosRecorridos;
}
public void SetKilometrosRecorridos(int KilometrosRecorridos){
    this.KilometrosRecorridos=KilometrosRecorridos;
}
public void CalcularCostodeMantenimiento(double CostoporKm, double KilometrosRecorridos){
    double costoTotal= CostoporKm* KilometrosRecorridos;
    System.out.println("El costo del Mantenimiento es $" +costoTotal);
}
}
