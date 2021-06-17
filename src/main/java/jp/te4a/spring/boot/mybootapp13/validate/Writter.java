package jp.te4a.spring.boot.mybootapp13.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TestValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface Writter {
    String ok();
    String message() default "input {ok}";
    // Classオブジェクトを得る（戻り値とする）メソッドgroups()
    // デフォルト値は空のクラス
    Class<?>[] groups() default {};
    // Payloadクラスを継承したClassオブジェクトを得る
    // （戻り値とする）メソッドpayload()、デフォルト値は空のクラス
    Class<? extends Payload>[] payload() default{};
}
