package cusihuaman.edu.apps.mooc;


import cusihuaman.edu.shared.domain.Service;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;


@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
    value =
        {"cusihuaman.edu.shared", "cusihuaman.edu.mooc", "cusihuaman.edu.apps.mooc"}
)
public class MoocApplication {
}
