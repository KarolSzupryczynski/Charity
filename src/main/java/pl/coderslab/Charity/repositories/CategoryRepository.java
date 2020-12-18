package pl.coderslab.Charity.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.Charity.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}