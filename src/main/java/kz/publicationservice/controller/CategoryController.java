package kz.publicationservice.controller;

import kz.publicationservice.facade.CategoryFacade;
import kz.publicationservice.model.dto.CategorySectionDto;
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

    private final CategoryFacade categoryFacade;

    @GetMapping("/sections")
    public ResponseEntity<List<CategorySectionDto>> getCategorySections(
            @RequestHeader(defaultValue = "ru", name = "Accept-Language") String language) {
        return ResponseEntity.ok(categoryFacade.getCategorySections(language));
    }

}
