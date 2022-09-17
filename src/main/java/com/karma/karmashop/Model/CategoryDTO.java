package com.karma.karmashop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO implements Serializable {
    private Long categoryId;

    @NotEmpty
    @Length(min = 5)
    private String name;

    private Boolean isEdit = false;
}
