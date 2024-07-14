package cusihuaman.edu.mooc.courses.infrastructure.persistence;

import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import cusihuaman.edu.mooc.courses.domain.Course;
import cusihuaman.edu.mooc.courses.domain.CourseId;
import cusihuaman.edu.mooc.courses.domain.CourseRepository;
import cusihuaman.edu.shared.domain.Service;

import java.util.Optional;

@Service
public class MySqlCourseRepository implements CourseRepository {
    private final SessionFactory sessionFactory;

    public MySqlCourseRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(Course course) {
        sessionFactory.getCurrentSession().persist(course);
    }

    @Override
    public Optional<Course> search(CourseId id) {
        return Optional.ofNullable(sessionFactory.getCurrentSession().byId(Course.class).load(id));
    }
}
