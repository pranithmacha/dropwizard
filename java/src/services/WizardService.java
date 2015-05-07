package services;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class WizardService extends Application<WizardConfiguration> {


    @Override
    public void initialize(Bootstrap<WizardConfiguration> bootstrap) {

    }

    public static void main(String[] args) throws Exception {
        new WizardService().run(args);
    }

    @Override
    public void run(WizardConfiguration wizardConfiguration, Environment environment) throws Exception {

    }
}
