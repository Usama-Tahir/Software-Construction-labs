import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Hibernate {
    public static SessionFactory getfactory()
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        return factory;
    }
}
