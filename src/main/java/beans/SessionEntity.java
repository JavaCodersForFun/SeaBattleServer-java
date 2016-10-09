package beans;

import javax.persistence.*;

@Entity(name = "sessions")
public class SessionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private UserEntity firstUser;

    @ManyToOne
    private UserEntity secondUser;

    public SessionEntity() {
    }

    public SessionEntity(UserEntity firstUser, UserEntity secondUser) {
        this.secondUser = secondUser;
        this.firstUser = firstUser;
    }

    public UserEntity getSecondUser() {
        return secondUser;
    }

    public void setSecondUser(UserEntity secondUser) {
        this.secondUser = secondUser;
    }

    public UserEntity getFirstUser() {

        return firstUser;
    }

    public void setFirstUser(UserEntity firstUser) {
        this.firstUser = firstUser;
    }

    public Integer getId() {

        return id;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", firstUser=" + firstUser +
                ", secondUser=" + secondUser +
                '}';
    }
}
