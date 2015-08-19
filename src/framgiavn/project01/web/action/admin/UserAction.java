package framgiavn.project01.web.action.admin;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.model.User;

public class UserAction extends ActionSupport {
    // private Logit2 log = Logit2.getInstance(UserAction.class);
    private User user = null;
    private List<User> users = new ArrayList<User>();
    private UserBusiness userBusiness = null;

    public void setUserBusiness(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String show() {
        try {
            user = userBusiness.show(user.getUserId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String index() {
        try {
            users = userBusiness.index();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String newUser() {
        return SUCCESS;
    }

    public String create() {
        try {
            userBusiness.create(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String edit() {
        try {
            user = userBusiness.show(user.getUserId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String update() {
        try {
            userBusiness.update(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String destroy() {
        try {
            userBusiness.destroy(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}