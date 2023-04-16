package kz.publicationservice.facade;


import kz.publicationservice.model.dto.CategorySectionDto;

import java.util.List;

public interface CategoryFacade {

    List<CategorySectionDto> getCategorySections(String language);

}
