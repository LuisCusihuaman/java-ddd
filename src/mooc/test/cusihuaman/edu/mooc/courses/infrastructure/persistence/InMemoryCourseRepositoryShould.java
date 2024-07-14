package cusihuaman.edu.mooc.courses.infrastructure.persistence;

import cusihuaman.edu.mooc.courses.CoursesModuleInfrastructureTestCase;
import cusihuaman.edu.mooc.courses.domain.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public final class InMemoryCourseRepositoryShould extends CoursesModuleInfrastructureTestCase {
    @Test
    void save_a_valid_course() {
        Course course = CourseMother.random();
        inMemoryCourseRepository.save(course);
    }

    @Test
    void search_an_existing_course() {
        Course course = CourseMother.random();

        inMemoryCourseRepository.save(course);

        assertEquals(Optional.of(course), inMemoryCourseRepository.search(course.getId()));
    }

    @Test
    void not_return_a_non_existing_course() {
        assertFalse(inMemoryCourseRepository.search(CourseIdMother.random()).isPresent());
    }
}
