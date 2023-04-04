package br.univille.projetofabsoftm2023.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 600)
    private String nome; 
    @Column(length = 600)
    private String Cpf; 
    @Column(length = 600)
    private String Endereco; 
    @Column(length = 600)
    private String Telefone; 
    @Column(length = 600)
    private String Email;
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCpf() {
    return Cpf;
}
public void setCpf(String cpf) {
    Cpf = cpf;
}
public String getEndereco() {
    return Endereco;
}
public void setEndereco(String endereco) {
    Endereco = endereco;
}
public String getTelefone() {
    return Telefone;
}
public void setTelefone(String telefone) {
    Telefone = telefone;
}
public String getEmail() {
    return Email;
}
public void setEmail(String email) {
    Email = email;
} 


}
