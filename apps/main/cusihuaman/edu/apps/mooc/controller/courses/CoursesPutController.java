package cusihuaman.edu.apps.mooc.controller.courses;

import cusihuaman.edu.mooc.courses.application.create.CourseCreator;
import cusihuaman.edu.mooc.courses.application.create.CreateCourseRequest;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class CoursesPutController {
    private final CourseCreator creator;

    public CoursesPutController(CourseCreator creator) {
        this.creator = creator;
    }

    @PutMapping("/courses/{id}")
    public ResponseEntity<String> create(@PathVariable String id, @RequestBody Request request) {
        System.out.println("[Request ID]: " + id + " [Request Name]: " + request.getName() + " [Request Duration]: " + request.getDuration());
        creator.create(new CreateCourseRequest(id, request.getName(), request.getDuration()));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Data
    public static final class Request {
        private String name;
        private String duration;
    }
}
