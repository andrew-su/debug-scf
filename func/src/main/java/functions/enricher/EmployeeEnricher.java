package functions.enricher;

import org.springframework.cloud.function.cloudevent.CloudEventHeaderEnricher;
import org.springframework.cloud.function.cloudevent.CloudEventMessageBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class EmployeeEnricher implements CloudEventHeaderEnricher {
  static {
    System.out.println("Loaded EmplyoeeEnricher");
  }

  public CloudEventMessageBuilder<?> enrich(CloudEventMessageBuilder<?> messageBuilder) {
    System.out.println("Enriching!");
    return messageBuilder
      .setSource("http://example.com")
      .setType("employee");
  }
}
