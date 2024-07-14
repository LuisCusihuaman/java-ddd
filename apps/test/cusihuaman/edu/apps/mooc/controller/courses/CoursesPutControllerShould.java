package cusihuaman.edu.apps.mooc.controller.courses;

import cusihuaman.edu.apps.ApplicationTestCase;
import org.junit.jupiter.api.Test;

public final class CoursesPutControllerShould extends ApplicationTestCase {
    @Test
    void create_a_valid_course() throws Exception {
        assertRequestWithBody(
            "PUT",
            "/courses/1aab45ba-3c7a-4344-8936-78466eca77fa",
            "{\"name\": \"The best course\", \"duration\": \"5 hours\"}",
            201
        );
    }
}
