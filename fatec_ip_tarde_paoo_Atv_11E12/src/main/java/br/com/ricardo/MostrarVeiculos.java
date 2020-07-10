package br.com.ricardo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.ricardo.model.beans.Veiculo;
import br.com.ricardo.model.repository.JPAUtil;



public class MostrarVeiculos {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Veiculo");
		List <Veiculo> veiculos = query.getResultList()
;
		for(Veiculo v: veiculos) {
			System.out.println(v);
			
		}
		
		manager.close();
		JPAUtil.close();
	}

}
