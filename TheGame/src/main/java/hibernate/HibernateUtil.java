package hibernate;

import com.mycompany.TheGame.model.RulesForTheDeadCell;
import com.mycompany.TheGame.model.Users;
import com.mycompany.TheGame.model.Messages;
import com.itransition.kursach.life.Maps;
import com.mycompany.TheGame.model.RulesForTheAliveCell;
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
          ac.addAnnotatedClass(Maps.class).addAnnotatedClass(Messages.class).addAnnotatedClass(RulesForTheAliveCell.class)
          .addAnnotatedClass(RulesForTheDeadCell.class).addAnnotatedClass(Users.class);                    
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
