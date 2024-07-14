package cusihuaman.edu.mooc.courses.infrastructure.persistence;

import cusihuaman.edu.mooc.InfrastructureTestCase;
import cusihuaman.edu.mooc.courses.domain.Course;
import cusihuaman.edu.mooc.courses.domain.CourseId;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public final class InMemoryCourseRepositoryShould extends InfrastructureTestCase {
    @Test
    void save_a_valid_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        Course course = new Course(new CourseId("26929514-237c-11ed-861d-0242ac120002"), "Java Course", "Java Course Description");
        repository.save(course);
    }

    @Test
    void search_an_existing_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        Course course = new Course(new CourseId("26929514-237c-11ed-861d-0242ac120002"), "Java Course", "Java Course Description");

        repository.save(course);

        assertEquals(Optional.of(course), repository.search(course.getId().value()));
    }

    @Test
    void not_return_a_non_existing_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        assertFalse(repository.search("non-existing-id").isPresent());
    }
}
