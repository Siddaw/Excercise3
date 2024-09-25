public class Question2Configuration {

    private static String configSetting;

    private final String instanceConfig;

    static {

        configSetting = "Default Configuration";
        System.out.println("Static block executed: configSetting initialized to '" + configSetting + "'");
    }

    public Question2Configuration(String instanceConfig) {
        this.instanceConfig = instanceConfig;
    }

    public static String getConfigSetting() {
        return configSetting;
    }

    public String getInstanceConfig() {
        return instanceConfig;
    }

    public static void main(String[] args) {
        Question2Configuration config1 = new Question2Configuration("Instance Config 1");
        Question2Configuration config2 = new Question2Configuration("Instance Config 2");

        System.out.println("Config 1 - Static Setting: " + Question2Configuration.getConfigSetting() +
                ", Instance Config: " + config1.getInstanceConfig());
        System.out.println("Config 2 - Static Setting: " + Question2Configuration.getConfigSetting() +
                ", Instance Config: " + config2.getInstanceConfig());

        Question2Configuration.configSetting = "Updated Configuration";

        System.out.println("After update:");
        System.out.println("Config 1 - Static Setting: " + Question2Configuration.getConfigSetting() +
                ", Instance Config: " + config1.getInstanceConfig());
        System.out.println("Config 2 - Static Setting: " + Question2Configuration.getConfigSetting() +
                ", Instance Config: " + config2.getInstanceConfig());
    }
}
