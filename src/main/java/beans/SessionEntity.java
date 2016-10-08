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
    private User firstUser;

    @ManyToOne
    @Column(name = "second_user_id")
    private User secondUser;

    public SessionEntity() {
    }

    public SessionEntity(User firstUser, User secondUser) {
        this.secondUser = secondUser;
        this.firstUser = firstUser;
    }

    public User getSecondUser() {
        return secondUser;
    }

    public void setSecondUser(User secondUser) {
        this.secondUser = secondUser;
    }

    public User getFirstUser() {

        return firstUser;
    }

    public void setFirstUser(User firstUser) {
        this.firstUser = firstUser;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
