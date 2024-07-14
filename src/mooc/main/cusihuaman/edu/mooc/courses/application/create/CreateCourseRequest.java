package cusihuaman.edu.mooc.courses.application.create;

import lombok.Data;

@Data
public class CreateCourseRequest {
    private final String id;
    private final String name;
    private final String duration;
}
