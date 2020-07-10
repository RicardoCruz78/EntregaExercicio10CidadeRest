package br.com.ricardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.ricardo.model.beans.Veiculo;
import br.com.ricardo.model.repository.JPAUtil;



public class RemoveVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo v = manager.find(Veiculo.class, 2L);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
