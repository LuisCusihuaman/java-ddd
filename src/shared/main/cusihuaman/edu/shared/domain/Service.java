package cusihuaman.edu.shared.domain;

import java.lang.annotation.*;

/**
 * The `@Service` annotation in our domain is an essential tool for dependency injection.
 * <p>
 * This annotation acts as an alias for standard dependency injection annotations, allowing us
 * to decouple our business logic from the specific details of the framework or implementation used.
 * By encapsulating the dependency injection logic in a single domain annotation, we achieve several key benefits:
 *
 * <ul>
 * <li><b>Framework Decoupling</b>: By using `@Service` instead of framework-specific annotations,
 * we avoid coupling our business code directly to a particular framework. This means that if we decide
 * to change the framework in the future, we only need to update the implementation of the `@Service` annotation
 * in one place instead of modifying each individual service class.</li>
 *
 * <li><b>Complexity Encapsulation</b>: This annotation encapsulates the complexity of dependency injection,
 * providing a clear and simple interface for developers. Developers do not need to know the internal details
 * of how dependencies are managed; they only need to apply the `@Service` annotation.</li>
 *
 * <li><b>Consistency Across the Application</b>: Having a domain-specific annotation for services ensures
 * a consistent use of dependency injection throughout the application. This makes the code easier to understand
 * and maintain, as developers know that all services follow the same pattern.</li>
 *
 * <li><b>Flexibility and Maintainability</b>: If we want to change the way dependencies are managed in the future,
 * we only need to modify the definition of the `@Service` annotation and its corresponding handling.
 * This significantly reduces maintenance effort and minimizes the risk of introducing errors when changing the framework
 * or dependency injection technique.</li>
 * </ul>
 *
 * <p>Example usage:</p>
 *
 * <pre>
 * {@code
 * @Service
 * public class MyService {
 *     // Service implementation
 * }
 * }
 * </pre>
 *
 * <p>In summary, the `@Service` annotation is a powerful strategy for keeping our code clean, decoupled, and easy
 * to maintain, providing an abstraction layer over the specific details of dependency injection.</p>
 */
@Retention(RetentionPolicy.RUNTIME) // Annotation is available at runtime
@Target(ElementType.TYPE) // Annotation can be applied to classes, interfaces, and enums
@Inherited // Annotation is inherited by subclasses
public @interface Service {
}
