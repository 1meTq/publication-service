package kz.publicationservice.service.impl;

import kz.publicationservice.model.entity.Category;
import kz.publicationservice.repository.CategoryRepository;
import kz.publicationservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional
    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }


}
