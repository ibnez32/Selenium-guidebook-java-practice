package tests;

public interface Config {
    final String baseUrl = System.getProperty("baseUrl", "http://the-internet.herokuapp.com");
    final String browser = System.getProperty("browser", "firefox");
    final String host = System.getProperty("host", "localhost");
    final String browserVersion = System.getProperty("browserVersion", "33");
    final String platform = System.getProperty("platform", "Windows XP");
    final String sauceUser = "deans32";
    final String sauceKey = "testpass32";
}
