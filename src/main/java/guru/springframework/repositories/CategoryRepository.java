package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Category;

/**
 * Created by kkrawczyk on 15.02.2019.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
