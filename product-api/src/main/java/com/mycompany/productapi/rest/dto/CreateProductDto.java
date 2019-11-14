package com.mycompany.productapi.rest.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Set;

@Data
public class CreateProductDto {

    @ApiModelProperty(value = "product name", example = "Apple 13\" MacBook Pro")
    @NotBlank
    private String name;

    @ApiModelProperty(
            position = 1,
            value = "product description",
            example = "Apple 13\" MacBook Pro, Retina Display, 2.3GHz Intel Core i5 Dual Core, 8GB RAM, 128GB SSD, Space Gray, MPXQ2LL/A ")
    @NotBlank
    private String description;

    @ApiModelProperty(position = 1, value = "product price", example = "1099.90")
    @NotNull
    private BigDecimal price;

    @ApiModelProperty(position = 2, value = "product categories", example = "[\"laptops\", \"apple\"]")
    private Set<String> categories;

}
