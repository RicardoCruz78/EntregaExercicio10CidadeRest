package br.com.ricardo;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.ricardo.model.beans.Veiculo;
import br.com.ricardo.model.repository.JPAUtil;

public class AtualizarVeiculos {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Veiculo v = manager.find(Veiculo.class, 1L);
		v.setMarca("Nissan");
		
		Veiculo v1 = manager.find(Veiculo.class, 2L);
		v1.setMarca("Subaru");
		
		Veiculo v2 = manager.find(Veiculo.class, 3L);
		v2.setMarca("Honda");
		
		
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();

	}

}