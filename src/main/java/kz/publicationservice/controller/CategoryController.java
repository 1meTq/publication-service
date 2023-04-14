package kz.publicationservice.controller;

import kz.publicationservice.model.entity.Category;
import kz.publicationservice.model.entity.CategorySection;
import kz.publicationservice.service.CategorySectionService;
import kz.publicationservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/categories")
public class CategoryController {

    private final CategorySectionService categorySectionService;

    @GetMapping("/sections")
    public ResponseEntity<List<CategorySection>> getCategorySections() {
        return ResponseEntity.ok(categorySectionService.getCategorySections());
    }

}
