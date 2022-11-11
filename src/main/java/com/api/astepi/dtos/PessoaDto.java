package com.api.astepi.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PessoaDto {
    @NotBlank //validações para verificar se não estar vindo null ou número vázio.
    private String nome;

    @NotBlank
    @Size (max = 11)
    private String cpf;

    @NotBlank
    @Size(max = 9)
    private int celular;

    @NotBlank
    private String email;

    @NotBlank
    private int matricula;

    @NotBlank
    private String cargo;

    @NotBlank
    private boolean status;

    @NotBlank
    private String nomeLogin;

    @NotBlank
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
