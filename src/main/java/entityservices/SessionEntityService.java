package entityservices;

import beans.SessionEntity;
import beans.UserEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SessionEntityService {

    private Session session;

    public SessionEntityService(Session session) { this.session = session; }

    public SessionEntity createSession(UserEntity firstUser, UserEntity secondUser) {

        SessionEntity entity = new SessionEntity(firstUser, secondUser);
        session.save(entity);
        return entity;

    }

    public void removeSessionEntity(Integer id) {
        SessionEntity entity = (SessionEntity) session.get(SessionEntity.class, id);
        if (entity != null) session.delete(entity);
    }

    public SessionEntity getSessionEntity(Integer id) {
        return (SessionEntity) session.get(SessionEntity.class, id);
    }

    public List getAllSessionEntities() {
        Query query = session.createQuery("SELECT s FROM beans.SessionEntity s");
        return query.list();
    }

}
