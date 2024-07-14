package cusihuaman.edu.apps.mooc.controller.courses;

import cusihuaman.edu.apps.ApplicationTestCase;
import cusihuaman.edu.shared.domain.UuidMother;
import org.junit.jupiter.api.Test;

public final class CoursesPutControllerShould extends ApplicationTestCase {
    @Test
    void create_a_valid_course() throws Exception {
        String courseId = UuidMother.random();

        assertRequestWithBody(
            "PUT",
            "/courses/" + courseId,
            "{\"name\": \"The best course\", \"duration\": \"5 hours\"}",
            201
        );
    }
}
