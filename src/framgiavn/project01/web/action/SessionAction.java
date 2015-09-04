package framgiavn.project01.web.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.model.User;

public class SessionAction extends ActionSupport implements SessionAware {
    private UserBusiness userBusiness = null;
    private User user;
    private Map<String, Object> session;

    public void setUserBusiness(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() {
        try {
            UserDetails userDetails = (UserDetails) SecurityContextHolder
                    .getContext().getAuthentication().getPrincipal();
            user = userBusiness.login(userDetails.getUsername(),
                    userDetails.getPassword());
            System.out.println(user.getUsername());
            if (user != null) {
                session.put("logged", "true");
                session.put("userId", user.getUserId());
                session.put("username", user.getUsername());
                return SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ERROR;
    }

    public String logout() {
        session.remove("userId");
        session.remove("username");
        session.remove("logged");
        session.clear();
        addActionMessage("You Have Been Successfully Logged Out");
        return SUCCESS;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}