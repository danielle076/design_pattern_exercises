package solutions.singleton;

public class ConfigurationService {
    private static ConfigurationService service;

    private String secret;

    private ConfigurationService() {

    }

    static ConfigurationService getInstance() {
        if (service != null) {
            return service;
        } else {
            service = new ConfigurationService();
            return service;
        }
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return this.secret;
    }
}
