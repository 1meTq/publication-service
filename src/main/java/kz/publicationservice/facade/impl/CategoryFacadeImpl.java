package kz.publicationservice.facade.impl;

import kz.publicationservice.converter.CategorySectionToCategorySectionDtoConverter;
import kz.publicationservice.facade.CategoryFacade;
import kz.publicationservice.model.dto.CategorySectionDto;
import kz.publicationservice.model.entity.CategorySection;
import kz.publicationservice.service.CategorySectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryFacadeImpl implements CategoryFacade {

    private final CategorySectionService categorySectionService;
    private final CategorySectionToCategorySectionDtoConverter categorySectionToCategorySectionDtoConverter;

    @Override
    public List<CategorySectionDto> getCategorySections(String language) {
        List<CategorySection> list = categorySectionService.getCategorySections();
        return categorySectionToCategorySectionDtoConverter.convertList(list, language);
    }
}
