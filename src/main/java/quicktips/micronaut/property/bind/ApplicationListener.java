package quicktips.micronaut.property.bind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;
import jakarta.inject.Singleton;
import quicktips.micronaut.property.bind.config.MyAppConfigurations;

@Singleton
public class ApplicationListener {

    private final MyAppConfigurations myAppConfigurations;
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationListener.class);
    
    public ApplicationListener(MyAppConfigurations myAppConfigurations) {
        this.myAppConfigurations = myAppConfigurations;
    }

    @EventListener
    public void onStartup(final ServerStartupEvent event){
        LOGGER.info(myAppConfigurations.getThread().toString());
        LOGGER.info(myAppConfigurations.toString());
    }
}
