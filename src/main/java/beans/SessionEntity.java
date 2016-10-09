package beans;

import javax.persistence.*;

@Entity
@Table(name = "sessions", schema = "seabattle_base")
public class SessionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @Column(name = "first_user_id")
    private UserEntity firstUser;

    @ManyToOne
    @Column(name = "second_user_id")
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
