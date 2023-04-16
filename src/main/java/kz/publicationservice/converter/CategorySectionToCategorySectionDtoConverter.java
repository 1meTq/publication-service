package kz.publicationservice.converter;

import kz.publicationservice.model.dto.CategoryDto;
import kz.publicationservice.model.dto.CategorySectionDto;
import kz.publicationservice.model.entity.CategorySection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CategorySectionToCategorySectionDtoConverter {

    private final CategoryToCategoryDtoConverter categoryToCategoryDtoConverter;

    public CategorySectionDto convert(CategorySection source, String language) {
        CategorySectionDto target = new CategorySectionDto();
        String name = source.getNames().get(language);
        target.setName(name);
        target.setId(source.getId());

        List<CategoryDto> categories = categoryToCategoryDtoConverter.convertList(source.getCategories(), language);
        target.setCategories(categories);

        return target;
    }

    public List<CategorySectionDto> convertList(List<CategorySection> categorySections, String language) {

        List<CategorySectionDto> targetList = new ArrayList<>();

        categorySections.forEach(categorySection -> {
            targetList.add(convert(categorySection, language));
        });

        return targetList;
    }

}
