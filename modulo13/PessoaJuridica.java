public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void fazerAniversario() {
        // Implementação do método fazerAniversario para PessoaJuridica
    }
}