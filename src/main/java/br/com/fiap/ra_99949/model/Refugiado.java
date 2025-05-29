package br.com.fiap.ra_99949.model;

import jakarta.persistence.*;

@Entity
public class Refugiado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String genero;
    private String localAtual;
    private String statusSaude;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getLocalAtual() { return localAtual; }
    public void setLocalAtual(String localAtual) { this.localAtual = localAtual; }
    public String getStatusSaude() { return statusSaude; }
    public void setStatusSaude(String statusSaude) { this.statusSaude = statusSaude; }
}
