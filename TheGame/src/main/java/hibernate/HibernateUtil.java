package hibernate;

import com.itransition.life.entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Albina
 */

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {         
          AnnotationConfiguration ac = new AnnotationConfiguration();         
          ac.addAnnotatedClass(Map.class).addAnnotatedClass(Message.class).addAnnotatedClass(RuleForTheAliveCell.class)
          .addAnnotatedClass(RuleForTheDeadCell.class).addAnnotatedClass(User.class);                    
          sessionFactory = ac.configure().buildSessionFactory();
          
        } catch (Throwable ex) {
        // Log the exception.
        System.err.println("Initial SessionFactory creation failed." + ex);
        throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {  
        return sessionFactory;
    }
}
