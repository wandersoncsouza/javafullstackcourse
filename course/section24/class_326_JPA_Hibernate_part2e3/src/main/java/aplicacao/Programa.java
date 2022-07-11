package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		// INSERINDO NO BANCO DE DADOS E CRIANDO AS TABELAS
		
//		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Gisele Nascimento", "giselenasc@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Flavio Ribeiro", "flavioribeiro@gmail.com");
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//		System.out.println("Pronto!!!");
//		em.close();
//		emf.close();
		
		// BUSCANDO UM DADO NO BANCO DE DADOS
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		em.remove(p);
		
		System.out.println(p);
		
		System.out.println("Pronto!!!");
		em.close();
		emf.close();
		
	}

}
