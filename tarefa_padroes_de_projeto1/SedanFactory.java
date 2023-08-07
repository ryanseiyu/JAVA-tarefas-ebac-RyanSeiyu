package tarefa_padroes_de_projeto1;

// Concrete Factory 1
class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}