package br.com.ricardo;

import javax.persistence.EntityManager;

import br.com.ricardo.model.beans.Veiculo;
import br.com.ricardo.model.repository.JPAUtil;

public class MostrarVeiculoComPlaca {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 1L);
		System.out.println(v);
		manager.close();
		JPAUtil.close();
	}
}
