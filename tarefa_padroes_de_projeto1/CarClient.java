package tarefa_padroes_de_projeto1;

// Client
public class CarClient {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.drive();

        CarFactory suvFactory = new SuvFactory();
        Car suv = suvFactory.createCar();
        suv.drive();
    }
}