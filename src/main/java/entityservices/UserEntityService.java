package entityservices;

import beans.UserEntity;
import org.hibernate.Session;

public class UserEntityService {

    private Session session;

    public UserEntityService(Session session) {
        this.session = session;
    }

    public UserEntity createUser(String username, String password, String email) {
        UserEntity userEntity = new UserEntity(username, password, email);
        session.save(userEntity);
        return userEntity;
    }

    public void removeUserEntity(Integer id) {
        UserEntity userEntity = (UserEntity) session.get(UserEntity.class, id);
        if (userEntity != null) session.delete(userEntity);
    }

}
