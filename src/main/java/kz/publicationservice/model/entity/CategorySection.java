package kz.publicationservice.model.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "category_section")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategorySection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "names")
    @Type(type = "jsonb")
    Map<String, String> names = new HashMap<>();

    @OneToMany(mappedBy = "categorySection", fetch = FetchType.EAGER)
    List<Category> categories;

}