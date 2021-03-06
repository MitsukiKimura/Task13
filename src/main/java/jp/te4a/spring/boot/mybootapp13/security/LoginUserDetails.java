package jp.te4a.spring.boot.mybootapp13.security;

import jp.te4a.spring.boot.mybootapp13.bean.UserBean;
import lombok.Data;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

@Data
public class LoginUserDetails extends User {
    private final UserBean user;
    public LoginUserDetails(UserBean userBean) {
        super(userBean.getUsername(), userBean.getPassword(),
                AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.user = userBean;
    }
}