package cusihuaman.edu.mooc;


import cusihuaman.edu.apps.mooc.MoocApplication;
import cusihuaman.edu.shared.infrastructure.InfrastructureTestCase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = MoocApplication.class)
@SpringBootTest
public class MoocContextInfrastructureTestCase extends InfrastructureTestCase {
}
