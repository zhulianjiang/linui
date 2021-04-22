package com.lin.missyou.api.v1;

import com.lin.missyou.dto.PersonDTO;
import com.lin.missyou.exception.http.ForbiddenException;
import com.lin.missyou.exception.http.HttpException;
import com.lin.missyou.exception.http.NotFondException;
import com.lin.missyou.sample.IConnect;
import com.lin.missyou.sample.ISkill;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import java.util.Map;

/**
 * @description: hello
 * @author: leozhu
 * @create: 2020-09-16 11:17
 **/
@RestController
@RequestMapping("banner")
@Validated
public class BannerController {

    @Autowired
    private ISkill iSkill;
    @Autowired
    private IConnect iConnect;

    @PostMapping("/test/{id}")
    public PersonDTO test(@PathVariable @Range(min = 1, max = 10, message = "值在1到10之间") Integer id,
                          @RequestParam @Length(min = 8,message = "name长度最少是8") String name,
                          @RequestBody @Validated PersonDTO personDTO) {
        iSkill.e();
        iConnect.connect();
        PersonDTO personDTO2 = PersonDTO.builder()
                .name("xiao")
                .age(22)
                .build();
        return personDTO2;
//        throw new ForbiddenException(10000);
    }
}
