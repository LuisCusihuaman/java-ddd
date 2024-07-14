package cusihuaman.edu.mooc.courses.application.create;

import cusihuaman.edu.mooc.courses.domain.*;
import cusihuaman.edu.shared.domain.Service;

@Service
public class CourseCreator {
    private final CourseRepository repository;

    public CourseCreator(CourseRepository repository) {
        this.repository = repository;
    }

    public void create(CreateCourseRequest request) {
        Course course = new Course(new CourseId(request.getId()), new CourseName(request.getName()), new CourseDuration(request.getDuration()));
        repository.save(course);
    }
}
