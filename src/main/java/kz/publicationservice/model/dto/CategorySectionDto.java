package kz.publicationservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategorySectionDto {

    private Long id;
    private String name;
    private List<CategoryDto> categories;

}
