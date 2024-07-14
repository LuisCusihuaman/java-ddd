package cusihuaman.edu.mooc.courses.application.create;

import cusihuaman.edu.mooc.courses.domain.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class CourseCreatorShould {
    @Test
    void save_a_valid_course() {
        // Arrange
        CourseRepository repository = mock(CourseRepository.class);
        CourseCreator creator = new CourseCreator(repository);
        Course course = new Course(new CourseId("26929514-237c-11ed-861d-0242ac120002"), new CourseName("Java Course"), new CourseDuration("5 hours"));

        // Act
        creator.create(new CreateCourseRequest("26929514-237c-11ed-861d-0242ac120002", "Java Course", "5 hours"));

        // Assert
        verify(repository, atLeastOnce()).save(course);
    }
}
