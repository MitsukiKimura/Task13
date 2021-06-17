package jp.te4a.spring.boot.mybootapp13.service;

import jp.te4a.spring.boot.mybootapp13.bean.UserBean;
import jp.te4a.spring.boot.mybootapp13.form.UserForm;
import jp.te4a.spring.boot.mybootapp13.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserForm create(UserForm userForm) {
        userForm.setPassword(new Pbkdf2PasswordEncoder().encode(userForm.getPassword()));

        UserBean userBean = new UserBean();
        BeanUtils.copyProperties(userForm, userBean);

        userRepository.save(userBean);
        return userForm;
    }
}
