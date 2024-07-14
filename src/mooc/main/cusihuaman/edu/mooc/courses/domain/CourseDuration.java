package cusihuaman.edu.mooc.courses.domain;

import cusihuaman.edu.shared.domain.StringValueObject;

public final class CourseDuration extends StringValueObject {
    public CourseDuration(String value) {
        super(value);
    }
    private CourseDuration() {
        super("");
    }
}
