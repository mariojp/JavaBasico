package br.com.mariojp.exemplo.teste;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.sql.JoinType;

import br.com.mariojp.exemplo.model.Pessoa;
import br.com.mariojp.exemplo.model.Usuario;


public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
        Usuario u = new Usuario();
        u.setSenha("senha");
        u.setEmail("pedro@email.com");
        Pessoa p = new Pessoa();
        p.setNome("Pedro Lucas");
        p.setUsuario(u);
        System.out.println("Insert");
        session.save(p);

        System.out.println("HQL");
        List<Usuario> usuarios = session.createQuery("from Usuario").list();
        for(Usuario usuario : usuarios){
        	System.out.println(usuario.getEmail());
        }
		
        System.out.println("Criteria");
        usuarios = session.createCriteria(Usuario.class).list();        
        for(Usuario usuario : usuarios){
        	System.out.println(usuario.getEmail());
        }
        
        System.out.println("HQL join implicito");
        List<Pessoa> pessoas = session.createQuery("from Pessoa p where p.usuario.email like 'pedro%'").list();
        for(Pessoa pessoa : pessoas){
        	System.out.println(pessoa.getNome());
        }
		
        System.out.println("HQL join explicito");
        pessoas = session.createQuery("Select p from Pessoa as p inner join p.usuario as u  where u.email like 'pedro%'").list();
        for(Pessoa pessoa : pessoas){
        	System.out.println(pessoa.getNome());
        }
        
        
        

        System.out.println("Criteria");

        Criteria crit = session.createCriteria(Pessoa.class);   
        crit.createAlias("usuario","u",JoinType.INNER_JOIN);  
        crit.add(Restrictions.like("u.email","pedro%", MatchMode.ANYWHERE));   
        
        pessoas = crit.list();        
        for(Pessoa pessoa : pessoas){
        	System.out.println(pessoa.getNome());
        }
        
		tx.commit();

	}

}
