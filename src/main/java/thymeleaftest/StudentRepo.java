package thymeleaftest;

import org.springframework.data.repository.CrudRepository; // 1. Change the import
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
    List<Student> findByIsPresent(boolean isPresent);
}
