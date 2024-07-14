package cusihuaman.edu.mooc.courses;

import cusihuaman.edu.mooc.MoocContextInfrastructureTestCase;
import cusihuaman.edu.mooc.courses.infrastructure.persistence.InMemoryCourseRepository;

public abstract class CoursesModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    protected InMemoryCourseRepository inMemoryCourseRepository = new InMemoryCourseRepository();
}
