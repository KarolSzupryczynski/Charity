package pl.coderslab.Charity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.Charity.entity.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}
