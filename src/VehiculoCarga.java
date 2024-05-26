public class VehiculoCarga extends vehiculo {
    private int capacidadCarga;

    //Constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga){
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    //Get, set para capacidadcarga
    public int CapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    //sobreescribir el metodo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
    }

}
