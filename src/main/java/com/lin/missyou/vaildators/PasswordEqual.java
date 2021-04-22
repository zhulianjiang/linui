package com.lin.missyou.vaildators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@Constraint(validatedBy = PasswordVaildtor.class)
public @interface PasswordEqual {
    int min() default 8;
    int max() default 12;

    String message() default "passwords are not equal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
