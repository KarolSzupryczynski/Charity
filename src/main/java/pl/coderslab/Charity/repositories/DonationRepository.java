package pl.coderslab.Charity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.Charity.entity.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
