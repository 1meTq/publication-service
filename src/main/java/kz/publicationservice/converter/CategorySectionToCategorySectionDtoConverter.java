package kz.publicationservice.converter;

import kz.publicationservice.model.dto.CategoryDto;
import kz.publicationservice.model.dto.CategorySectionDto;
import kz.publicationservice.model.entity.Category;
import kz.publicationservice.model.entity.CategorySection;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategorySectionToCategorySectionDtoConverter {

    @NonNull
    public CategorySectionDto convert(CategorySection source, CategorySectionDto target, String language){
        String name = source.getNames().get(language);
        target.setName(name);
        return target;
    }

    @NonNull
    public List<CategorySectionDto> 

}
