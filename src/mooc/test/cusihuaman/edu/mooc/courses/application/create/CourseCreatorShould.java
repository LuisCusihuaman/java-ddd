package cusihuaman.edu.mooc.courses.application.create;

import cusihuaman.edu.mooc.courses.CoursesModuleUnitTestCase;
import cusihuaman.edu.mooc.courses.domain.*;
import org.junit.jupiter.api.Test;

final class CourseCreatorShould extends CoursesModuleUnitTestCase {
    @Test
    void save_a_valid_course() {
        // Arrange
        CourseCreator creator = new CourseCreator(repository);
        CreateCourseRequest request = CreateCourseRequestMother.random();
        Course course = CourseMother.fromRequest(request);

        // Act
        creator.create(request);

        // Assert
        shouldHaveSaved(course);
    }
}
