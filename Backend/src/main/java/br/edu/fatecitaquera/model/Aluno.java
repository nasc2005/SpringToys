package br.edu.fatecitaquera.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="Aluno")
public class Aluno {
	// atributos
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ra;
	@Column(name="nome")
	private String nome;
	private String email;
	private String endereco;
	private Date dataNascimento;
	private String periodo;
	// contrutores
	public Aluno() {
	}
	public Aluno(int ra, String nome, String email, String endereco, Date dataNascimento, String periodo) {
		this.ra = ra;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.periodo = periodo;
	}
	// getters e setters
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
