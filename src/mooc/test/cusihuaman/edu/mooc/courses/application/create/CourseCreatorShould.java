package cusihuaman.edu.mooc.courses.application.create;

import cusihuaman.edu.mooc.courses.domain.Course;
import cusihuaman.edu.mooc.courses.domain.CourseId;
import cusihuaman.edu.mooc.courses.domain.CourseRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class CourseCreatorShould {
    @Test
    void save_a_valid_course() {
        // Arrange
        CourseRepository repository = mock(CourseRepository.class);
        CourseCreator creator = new CourseCreator(repository);
        Course course = new Course(new CourseId("26929514-237c-11ed-861d-0242ac120002"), "Java Course", "Java Course Description");

        // Act
        creator.create(new CreateCourseRequest("26929514-237c-11ed-861d-0242ac120002", "Java Course", "Java Course Description"));

        // Assert
        verify(repository, atLeastOnce()).save(course);
    }
}
