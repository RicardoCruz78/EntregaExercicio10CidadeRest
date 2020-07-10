package br.com.ricardo;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.ricardo.model.beans.Pessoa;
import br.com.ricardo.model.beans.Veiculo;
import br.com.ricardo.model.repository.JPAUtil;

public class InsereDoisVeiculosUmaPessoa {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
         transaction.begin();
     	Pessoa p = new Pessoa();
     	p.setNome("Ricardo");
     	
     	List <Veiculo> veiculos = new ArrayList <>();     	
     	Veiculo v = new Veiculo();	
		v.setPessoas(p);
		
		Veiculo v1 = new Veiculo();
		
		manager.persist(v1);
        v.setPessoas(p);
      veiculos.add(v);
      veiculos.add(v1);
      p.setVeiculo(veiculos); 
      
        transaction.commit();
        manager.close ();
      
        JPAUtil.close();
        
	}

}
