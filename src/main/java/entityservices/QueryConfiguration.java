package entityservices;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class QueryConfiguration {

    private static QueryConfiguration ourInstance = new QueryConfiguration();
    private Configuration configuration;
    private StandardServiceRegistry serviceRegistry;
    private SessionFactory factory;

    public static QueryConfiguration getInstance() {
        return ourInstance;
    }

    private QueryConfiguration() {

        // Configuration instance from the hibernate.cfg.xml
        this.configuration = new Configuration().configure();
        // Create registry for the current settings
        // From this registry we are getting connections to your tables
        this.serviceRegistry =
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        // Create session factory for the current config.
        this.factory = configuration.buildSessionFactory(serviceRegistry);

    }

    public SessionFactory getFactory() {
        return factory;
    }

}
