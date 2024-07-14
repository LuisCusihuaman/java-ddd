package cusihuaman.edu.apps.mooc.controller.health_check;


import cusihuaman.edu.apps.ApplicationTestCase;
import org.junit.jupiter.api.Test;

final class HealthCheckGetControllerShould extends ApplicationTestCase {

    @Test
    void check_the_app_is_working_ok() throws Exception {
        assertResponse("/health-check", 200, "{'application':'mooc','status':'ok'}");
    }

}
