package cusihuaman.edu.apps.mooc.controller.courses;

import cusihuaman.edu.apps.ApplicationTestCase;
import org.junit.jupiter.api.Test;

public final class CoursesPutControllerShould extends ApplicationTestCase {
    @Test
    void create_a_valid_course() throws Exception {
        assertRequestWithBody(
            "PUT",
            "/courses/26929514-237c-11ed-861d-0242ac120002",
            "{\"name\": \"The best course\", \"duration\": \"5 hours\"}",
            201
        );
    }
}
