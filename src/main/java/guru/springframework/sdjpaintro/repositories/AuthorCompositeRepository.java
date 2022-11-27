package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.composite.AuthorComposite;
import guru.springframework.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Hemang Dave
 * Date: 27/11/22
 * Time: 11:49 am
 */
public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
