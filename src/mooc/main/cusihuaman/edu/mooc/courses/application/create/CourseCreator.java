package cusihuaman.edu.mooc.courses.application.create;

import cusihuaman.edu.mooc.courses.domain.Course;
import cusihuaman.edu.mooc.courses.domain.CourseRepository;
import cusihuaman.edu.shared.domain.Service;

@Service
public class CourseCreator {
    private final CourseRepository repository;

    public CourseCreator(CourseRepository repository) {
        this.repository = repository;
    }

    public void create(String id, String name, String duration) {
        Course course = new Course(id, name, duration);
        repository.save(course);
    }
}
