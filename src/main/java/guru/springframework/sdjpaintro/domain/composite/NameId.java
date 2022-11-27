package guru.springframework.sdjpaintro.domain.composite;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created By Hemang Dave
 * Date: 27/11/22
 * Time: 11:47 am
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class NameId implements Serializable {
    private String firstName;
    private String lastName;
}
