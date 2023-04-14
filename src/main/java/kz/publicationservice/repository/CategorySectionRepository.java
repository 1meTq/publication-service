package kz.publicationservice.repository;

import kz.publicationservice.model.entity.CategorySection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorySectionRepository extends JpaRepository<CategorySection, Long> {
}
