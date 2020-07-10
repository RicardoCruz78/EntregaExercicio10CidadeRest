package br.com.ricardo.model.beans;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name = "tb_pessoa")
public class Pessoa {

@Id
@GeneratedValue
	private Long id;
	private String nome;
	public Long getId() {
		return id;
	}
	
	@OneToMany (mappedBy = "pessoa", cascade = CascadeType.ALL)
	
	private List <Veiculo> veiculo;	
	
	
	
	public List<Veiculo> getVeiculo() { 
		return veiculo;
	}
	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
