package kz.publicationservice.service.impl;

import kz.publicationservice.model.entity.CategorySection;
import kz.publicationservice.repository.CategorySectionRepository;
import kz.publicationservice.service.CategorySectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategorySectionServiceImpl implements CategorySectionService {

    private final CategorySectionRepository categorySectionRepository;

    @Override
    public List<CategorySection> getCategorySections() {
        return categorySectionRepository.findAll();
    }
}
