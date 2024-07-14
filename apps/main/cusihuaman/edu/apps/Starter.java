package cusihuaman.edu.apps;

import java.util.HashMap;

import cusihuaman.edu.apps.mooc.MoocApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;


public class Starter {

    public static void main(String[] args) {
        if (args.length < 2) {
            throw new RuntimeException("There are not enough arguments");
        }

        String applicationName = args[0];
        String commandName = args[1];
        boolean isServerCommand = commandName.equals("server");

        ensureApplicationExist(applicationName);

        Class<?> applicationClass = applications().get(applicationName);

        SpringApplication app = new SpringApplication(applicationClass);

        if (!isServerCommand) {
            app.setWebApplicationType(WebApplicationType.NONE);
        }

        app.run(args);
    }

    private static void ensureApplicationExist(String applicationName) {
        if (!applications().containsKey(applicationName)) {
            throw new RuntimeException(
                String.format(
                    "The application <%s> doesn't exist. Valids:\n- %s",
                    applicationName,
                    String.join("\n- ", applications().keySet())
                )
            );
        }
    }


    private static HashMap<String, Class<?>> applications() {
        HashMap<String, Class<?>> applications = new HashMap<>();

        applications.put("mooc", MoocApplication.class);

        return applications;
    }
}
