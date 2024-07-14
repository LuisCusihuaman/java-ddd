package cusihuaman.edu.mooc.courses.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private final CourseId id;
    private final String name;
    private final String duration;
}
