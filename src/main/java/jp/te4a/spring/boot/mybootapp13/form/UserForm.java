package jp.te4a.spring.boot.mybootapp13.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserForm {
    @NotNull
    @Size(min=6, max=12)
    private String username;
    @Size(min=6, max=12)
    private String password;
}
