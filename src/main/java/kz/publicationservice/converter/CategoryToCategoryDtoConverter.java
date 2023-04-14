package kz.publicationservice.converter;

import kz.publicationservice.model.dto.CategoryDto;
import kz.publicationservice.model.entity.Category;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryToCategoryDtoConverter {

    @NonNull
    public CategoryDto convert(Category source, String language){
        CategoryDto target = new CategoryDto();
        String name = source.getNames().get(language);
        String description = source.getDescriptions().get(language);
        target.setName(name);
        target.setDescription(description);
        return target;
    }

    @NonNull
    public List<CategoryDto> convertList(List<Category> categories, String language){
        List<CategoryDto> targetList = new ArrayList<>();

        categories.forEach(category -> {
            targetList.add(convert(category, language));
        });

        return targetList;
    }

}
