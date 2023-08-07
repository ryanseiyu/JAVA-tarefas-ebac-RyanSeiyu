package tarefa_padroes_de_projeto1;

class SuvFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Suv();
    }
}