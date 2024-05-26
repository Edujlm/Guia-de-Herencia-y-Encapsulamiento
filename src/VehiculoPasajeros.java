public class VehiculoPasajeros extends vehiculo{
    private String tipoCombustible;

    //Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje);
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

}