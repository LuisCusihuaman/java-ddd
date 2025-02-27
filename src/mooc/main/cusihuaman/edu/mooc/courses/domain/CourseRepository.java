package cusihuaman.edu.mooc.courses.domain;

import java.util.Optional;

public interface CourseRepository {
    void save(Course course);

    Optional<Course> search(CourseId id);
}
