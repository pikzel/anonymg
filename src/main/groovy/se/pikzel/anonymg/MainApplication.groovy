package se.pikzel.anonymg

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import se.pikzel.anonymg.health.PingHealthCheck
import se.pikzel.anonymg.resources.PingResource

class MainApplication extends Application<MainConfiguration> {
    static void main(String[] args) throws Exception {
        new MainApplication().run()
    }

    @Override
    void initialize(Bootstrap<MainConfiguration> bootstrap) {
    }

    @Override
    void run(MainConfiguration mainConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new PingResource());
        environment.healthChecks().register("Ping health check", new PingHealthCheck());
    }
}
