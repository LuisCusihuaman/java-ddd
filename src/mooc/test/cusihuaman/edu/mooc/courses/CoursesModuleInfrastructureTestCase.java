package cusihuaman.edu.mooc.courses;

import cusihuaman.edu.mooc.MoocContextInfrastructureTestCase;
import cusihuaman.edu.mooc.courses.infrastructure.persistence.InMemoryCourseRepository;
import cusihuaman.edu.mooc.courses.domain.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class CoursesModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    protected InMemoryCourseRepository inMemoryCourseRepository = new InMemoryCourseRepository();
    @Autowired
    protected CourseRepository mySqlCourseRepository;
}
