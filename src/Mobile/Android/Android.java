package Mobile.Android;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Android {
    public static DesiredCapabilities caps;
    public static String name = "";


    public static DesiredCapabilities SamsungGalaxyS9Plus() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "Samsung Galaxy S9 Plus");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = " " + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyS8Plus() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyS10() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "Samsung Galaxy S10");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyNote9() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "8.1");
        caps.setCapability("device", "Samsung Galaxy Note 9");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyS9Plus_8() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "8.0");
        caps.setCapability("device", "Samsung Galaxy S9 Plus");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyS9() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "8.0");
        caps.setCapability("device", "Samsung Galaxy S9");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyNote8() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "7.1");
        caps.setCapability("device", "Samsung Galaxy Note 8");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyA8() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "7.1");
        caps.setCapability("device", "Samsung Galaxy A8");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyS8_7() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "7.0");
        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyS8() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "7.0");
        caps.setCapability("device", "Samsung Galaxy S8");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyS7() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "6.0");
        caps.setCapability("device", "Samsung Galaxy S7");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyNote_4() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "6.0");
        caps.setCapability("device", "Samsung Galaxy Note 4");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyS6() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "5.0");
        caps.setCapability("device", "Samsung Galaxy S6");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyNote4_4() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "4.4");
        caps.setCapability("device", "Samsung Galaxy Note 4");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GooglePixel3_XL() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "Google Pixel 3 XL");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GooglePixel3() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GooglePixel2_9() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "Google Pixel 2");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GooglePixel2_8() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "8.0");
        caps.setCapability("device", "Google Pixel 2");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GooglePixel__8() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "8.0");
        caps.setCapability("device", "Google Pixel");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GooglePixel__7_1() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "7.1");
        caps.setCapability("device", "Google Pixel");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GoogleNexus6_6() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "6.0");
        caps.setCapability("device", "Google Nexus 6");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GoogleNexus6_5() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "5.0");
        caps.setCapability("device", "Google Nexus 6");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GoogleNexus5() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "4.4");
        caps.setCapability("device", "Google Nexus 5");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities MotorolaMotoX2ndGen_6() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "6.0");
        caps.setCapability("device", "Motorola Moto X 2nd Gen");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities MotorolaMotoX2ndGen_5() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "5.0");
        caps.setCapability("device", "Motorola Moto X 2nd Gen");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities OnePlus6T() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "OnePlus 6T");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyTabS4() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "8.1");
        caps.setCapability("device", "Samsung Galaxy Tab S4");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyTabS3_8() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "8.0");
        caps.setCapability("device", "Samsung Galaxy Tab S3");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyTabS3_7() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "7.0");
        caps.setCapability("device", "Samsung Galaxy Tab S3");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities SamsungGalaxyTabS3_4() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "4.4");
        caps.setCapability("device", "Samsung Galaxy Tab 4");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities GoogleNexus9() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "5.1");
        caps.setCapability("device", "Google Nexus 9");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }
}
