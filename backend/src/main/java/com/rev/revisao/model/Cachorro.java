package com.rev.revisao.model;

public class Cachorro {
    private int id;
    private String nome;
    private String raca;
    private int idade;
    private Dono dono;

    public Cachorro(int id, String nome, String raca, int idade, Dono dono) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public Dono getDono() { return dono; }
    public void setDono(Dono dono) { this.dono = dono; }

    @Override
    public String toString() {
        return "Cachorro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", raça='" + raca + '\'' +
                ", idade=" + idade +
                ", dono=" + dono.getNome() +
                '}';
    }
}
