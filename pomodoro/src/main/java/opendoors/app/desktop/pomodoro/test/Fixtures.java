package opendoors.app.desktop.pomodoro.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import opendoors.app.desktop.pomodoro.model.Assunto;
import opendoors.app.desktop.pomodoro.model.Materia;

public class Fixtures {


	public static void main(String args[]){
		
		Materia materia = new Materia("JavaFX");
		Materia materia2 = new Materia("Hibernate");
		Materia materia3 = new Materia("Angular");
		Materia materia4 = new Materia("Sap Bods");
		Materia materia5 = new Materia("Inglês");

		
		Assunto assunto1 = new Assunto(materia, "JavaFX");
		Assunto assunto2 = new Assunto(materia2, "Hibernate");
		Assunto assunto3 = new Assunto(materia3, "Angular");
		Assunto assunto4 = new Assunto(materia4, "Sap Bods");
		Assunto assunto5 = new Assunto(materia5, "Phrasal Verbs");

		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(materia);
		session.save(materia2);
		session.save(materia3);
		session.save(materia4);
		session.save(materia5);
		session.save(assunto1);
		session.save(assunto2);
		session.save(assunto3);
		session.save(assunto4);
		session.save(assunto5);
		session.getTransaction().commit();
		session.close();
	}
}
