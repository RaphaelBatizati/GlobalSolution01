package br.com.fiap.ra_99949.dto;

public class RefugiadoDTO {

    private String nome;
    private Integer idade;
    private String nacionalidade;
    private String situacao;
    private Long abrigoId;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }

    public Long getAbrigoId() { return abrigoId; }
    public void setAbrigoId(Long abrigoId) { this.abrigoId = abrigoId; }
}
