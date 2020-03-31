package br.java_project.spring_project_ddd.infrastructure.repository;


import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class AlunoRepository {

    @PersistenceContext
    EntityManager entityManager;


    @Transactional
    public void insertWithEntityManager(AlunoEntity aluno) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        System.out.println(aluno.getId_cliente());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getDt_cadastro());
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getE_mail());
        System.out.println(aluno.getTelefone());
        em.persist(aluno);


    }

}


