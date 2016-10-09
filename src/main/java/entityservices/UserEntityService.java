package entityservices;

import beans.UserEntity;
import org.hibernate.Session;

public class UserEntityService extends AbstractEntityService {

    public UserEntityService(Session session) {
        this.session = session;
    }

    public void remove(Integer id) {
        UserEntity userEntity = (UserEntity) session.get(UserEntity.class, id);
        if (userEntity != null) session.delete(userEntity);
    }

    public UserEntity create(String username, String password, String email) {
        UserEntity userEntity = new UserEntity(username, password, email);
        session.save(userEntity);
        return userEntity;
    }

    public UserEntity getUserByEmail(String emailadr) {
        return (UserEntity)
                session.createQuery("from UserEntity where email=:email")
                .setParameter("email", emailadr)
                .uniqueResult();
    }

}
