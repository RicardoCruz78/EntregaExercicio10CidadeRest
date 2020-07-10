package br.com.ricardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.ricardo.model.beans.Veiculo;
import br.com.ricardo.model.repository.JPAUtil;



public class InserirVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo v = new Veiculo();
		v.setMarca("Renault");
		v.setModelo("Kwind");
		v.setCor("vermelho");
		manager.persist(v);

		Veiculo v1 = new Veiculo();
		v1.setMarca("Volksvagem");
		v1.setModelo("Brasilia");
		v1.setCor("Azul");		
		manager.persist(v1);
		
		Veiculo v2 = new Veiculo();
		v2.setMarca("Chevrolet");
		v2.setModelo("Unix");
		v2.setCor("Preta");
		
		
		manager.persist(v2);
		
	
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}