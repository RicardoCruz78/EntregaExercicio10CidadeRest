package br.com.ricardo;

import javax.persistence.EntityManager;

import br.com.ricardo.model.beans.Placa;
import br.com.ricardo.model.repository.JPAUtil;

;

public class MostrarPlacaComVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Placa placa = manager.find(Placa.class, 1L);
		System.out.println(placa);
		manager.close();
		JPAUtil.close();

	}

}
