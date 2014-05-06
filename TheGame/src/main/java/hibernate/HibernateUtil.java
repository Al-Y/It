package hibernate;

import com.mycompany.TheGame.RulesForTheDeadCell;
import com.mycompany.TheGame.RulesForTheAliveCell;
import com.mycompany.TheGame.Maps;
import com.mycompany.TheGame.Users;
import com.mycompany.TheGame.Messages;
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
