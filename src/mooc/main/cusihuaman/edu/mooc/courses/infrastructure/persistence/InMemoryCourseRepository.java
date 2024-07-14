package cusihuaman.edu.mooc.courses.infrastructure.persistence;

import cusihuaman.edu.mooc.courses.domain.Course;
import cusihuaman.edu.mooc.courses.domain.CourseRepository;
import cusihuaman.edu.shared.domain.Service;

@Service // This repository is injectable
public class InMemoryCourseRepository implements CourseRepository {
    @Override
    public void save(Course course) {

    }
}
