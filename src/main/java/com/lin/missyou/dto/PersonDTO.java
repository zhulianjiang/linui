package com.lin.missyou.dto;

import com.lin.missyou.vaildators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;

/**
 * @description:
 * @author: leozhu
 * @create: 2020-09-29 16:51
 **/


@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@PasswordEqual
public class PersonDTO {

    @Length(min = 2,max = 10,message = "长度在2-10哦")
    private String name;
    private Integer age;
//    @Valid
//    private SchoolDTO schoolDTO;

    private String password1;
    private String password2;

}
