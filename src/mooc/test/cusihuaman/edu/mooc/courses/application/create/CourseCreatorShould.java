package cusihuaman.edu.mooc.courses.application.create;

import cusihuaman.edu.mooc.courses.domain.Course;
import cusihuaman.edu.mooc.courses.domain.CourseRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class CourseCreatorShould {
    @Test
    void save_a_valid_course() {
        // Arrange
        CourseRepository repository = mock(CourseRepository.class);
        CourseCreator creator = new CourseCreator(repository);
        Course course = new Course("id", "name", "duration");

        // Act
        creator.create(new CreateCourseRequest("id", "name", "duration"));

        // Assert
        verify(repository, atLeastOnce()).save(course);
    }
}
