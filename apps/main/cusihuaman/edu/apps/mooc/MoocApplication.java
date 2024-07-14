package cusihuaman.edu.apps.mooc;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan({"cusihuaman.edu.shared", "cusihuaman.edu.mooc", "cusihuaman.edu.apps.mooc"})
public class MoocApplication {
}
