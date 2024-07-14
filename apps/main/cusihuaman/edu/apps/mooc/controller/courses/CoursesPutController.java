package cusihuaman.edu.apps.mooc.controller.courses;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class CoursesPutController {

    @PutMapping("/courses/{id}")
    public ResponseEntity<Void> create(@PathVariable String id, @RequestBody Request request) {
        System.out.println("[Request ID]: " + id + " [Request Name]: " + request.getName() + " [Request Duration]: " + request.getDuration());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Data
    public static final class Request {
        private String name;
        private String duration;
    }
}
