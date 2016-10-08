package beans;

import javax.persistence.*;

@Entity(name = "sessions")
public class Session {

    @Id
    private Integer id;

    @ManyToOne
    @Column(name = "first_user_id")
    private User firstUser;

    @ManyToOne
    @Column(name = "second_user_id")
    private User secondUser;

    public Session() {
    }

    public Session(User secondUser, Integer id, User firstUser) {
        this.secondUser = secondUser;
        this.id = id;
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
}
