package kz.publicationservice.converter;

import kz.publicationservice.model.dto.CategoryDto;
import kz.publicationservice.model.entity.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryToCategoryDtoConverter {

    public CategoryDto convert(Category source, String language) {
        CategoryDto target = new CategoryDto();
        String name = source.getNames().get(language);
        String description = null;
        if (source.getDescriptions() != null) {
            description = source.getDescriptions().get(language);
        }
        target.setId(source.getId());
        target.setName(name);
        target.setDescription(description);
        return target;
    }

    public List<CategoryDto> convertList(List<Category> categories, String language) {
        List<CategoryDto> targetList = new ArrayList<>();

        categories.forEach(category -> {
            targetList.add(convert(category, language));
        });

        return targetList;
    }

}
