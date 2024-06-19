package za.co.neildutoit.cicd;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;

@Component
public class AppInfoContributor implements InfoContributor {

  private final Environment env;

  public AppInfoContributor(Environment env) {
    this.env = env;
  }

  @Override
  public void contribute(Builder builder) {
    builder.withDetail("version", env.getProperty("version"));
  }
}