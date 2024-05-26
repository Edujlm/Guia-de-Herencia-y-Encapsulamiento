public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Informacion de maquinaria de transporte. ");

        //Crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5 ,"Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000,20000, 4);

        //Mostrar la informacion de cada vehiculo
        System.out.println("Informacion del Auto: ");
        auto.mostrarInfo();

        auto.RealizarMantenimiento();
        auto.CalcularCostodeMantenimiento(50, 78900);

        System.out.println("\nInformacion del Camion: ");
        camion.mostrarInfo();
        camion.RealizarMantenimiento();
    }
}