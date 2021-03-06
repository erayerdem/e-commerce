package com.kodgemisi.course.ecommerce.product;

import com.kodgemisi.course.ecommerce.category.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductDto {

    private Long id;

    @NotBlank
    private String name;

    private String description;

    @NotNull
    @Min(0)
    private BigDecimal price;

    @Min(0)
    private int stock;

    @Pattern(regexp = "^http.*")
    private String url;

    @NotNull
    private Long categoryId;

}
