package ucuenca.ejemplo.store.serviceproduct.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="tbl_categories")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


}
