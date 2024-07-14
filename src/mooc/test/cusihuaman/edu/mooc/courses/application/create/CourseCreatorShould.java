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
        CreateCourseRequest request = CreateCourseRequestMother.random();
        Course course = CourseMother.fromRequest(request);

        // Act
        creator.create(request);

        // Assert
        verify(repository, atLeastOnce()).save(course);
    }
}
