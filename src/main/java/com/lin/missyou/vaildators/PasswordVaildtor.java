package com.lin.missyou.vaildators;

import com.lin.missyou.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * @description:
 * @author: leozhu
 * @create: 2020-10-16 15:45
 **/
public class PasswordVaildtor implements ConstraintValidator<PasswordEqual,PersonDTO> {

    private int min;
    private int max;

    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        boolean equalsResult = password1.equals(password2);
        return equalsResult;
    }

    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }
}
