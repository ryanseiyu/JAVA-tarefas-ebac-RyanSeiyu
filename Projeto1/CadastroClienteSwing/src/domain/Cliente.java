/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author ryan_
 */
public class Cliente {
    private String name;
    private Long cpf;

    public Cliente(String name, String cpf) {
        this.name = name;
        this.cpf = Long.valueOf(cpf);
    }

    public String getNome() {
        return name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

}
