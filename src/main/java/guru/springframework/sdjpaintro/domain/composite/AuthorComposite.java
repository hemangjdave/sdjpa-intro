package guru.springframework.sdjpaintro.domain.composite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

/**
 * Created By Hemang Dave
 * Date: 27/11/22
 * Time: 11:25 am
 */
@Setter
@Getter
@Entity
@IdClass(NameId.class)
public class AuthorComposite {

    @Id
    private String firstName;

    @Id
    private String lastName;
    private String country;
}
