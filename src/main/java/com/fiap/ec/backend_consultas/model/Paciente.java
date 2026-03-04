package com.fiap.ec.backend_consultas.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table("pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    private String telefone;
    private LocalDate dataNascimento;
    private Boolean ativo;

    public Paciente() {}

    public Paciente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public Boolean getAtivo() { return ativo; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
}
