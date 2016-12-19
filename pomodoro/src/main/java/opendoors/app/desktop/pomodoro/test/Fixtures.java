package opendoors.app.desktop.pomodoro.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import opendoors.app.desktop.pomodoro.model.Assunto;
import opendoors.app.desktop.pomodoro.model.Materia;

public class Fixtures {


	public static void main(String args[]){
		
		Materia materia = new Materia("JavaFX");
		Materia materia2 = new Materia("Português");
		Materia materia3 = new Materia("Direito Constitucional");
		Materia materia4 = new Materia("Hibernate");
		
		
		Assunto assunto1 = new Assunto(materia, "JavaFX");
		Assunto assunto3 = new Assunto(materia2, "Acentuação Gráfica");
		Assunto assunto4 = new Assunto(materia2, "Ortografia");
		Assunto assunto5 = new Assunto(materia3, "Artigo 5");
		Assunto assunto6 = new Assunto(materia3, "Poder Legislativo");
		Assunto assunto7 = new Assunto(materia4, "Hibernate");

		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(materia);
		session.save(materia2);
		session.save(materia3);
		session.save(materia4);
		session.save(assunto1);
		session.save(assunto3);
		session.save(assunto4);
		session.save(assunto5);
		session.save(assunto6);
		session.save(assunto7);
		session.getTransaction().commit();
		session.close();
	}
}
