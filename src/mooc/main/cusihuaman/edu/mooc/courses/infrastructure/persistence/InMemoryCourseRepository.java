package cusihuaman.edu.mooc.courses.infrastructure.persistence;

import cusihuaman.edu.mooc.courses.domain.Course;
import cusihuaman.edu.mooc.courses.domain.CourseId;
import cusihuaman.edu.mooc.courses.domain.CourseRepository;

import java.util.HashMap;
import java.util.Optional;

public class InMemoryCourseRepository implements CourseRepository {
    private final HashMap<String, Course> courses = new HashMap<>();

    @Override
    public void save(Course course) {
        courses.put(course.getId().value(), course);
    }

    public Optional<Course> search(CourseId id) {
        return Optional.ofNullable(courses.get(id.value()));
    }
}
