// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //construct a new AirPurifier
        AirPurifier x = new AirPurifier("Pro" ,"ZGMF-X10A");
        //Turn on/off
        x.turnOn();
        x.turnOff();
        //speed
        System.out.println(x.speed);
        x.setSpeed(5);
        x.setSpeed(3);
        //model, serialNo, token, pmLevel
        System.out.println(x.model);
        System.out.println(x.serialNo);
        System.out.println(x.token);
        x.setToken("SD$@$25");
        System.out.println(x.pmLevel);
        x.setPmLevel(25);
        System.out.println(x.pmLevel);
        //firmware and popularModel
        System.out.println(x.firmwareVersion);
        System.out.println(AirPurifier.mostPopularModel);
        System.out.println(AirPurifier.currentFirmwareVersion);
        x.updateFirmware();
        //modelSold
        System.out.println(AirPurifier.unitSold);
        AirPurifier.setMostPopularModel("Portable");
        AirPurifier.newFirmware("2.0");
        System.out.println(AirPurifier.currentFirmwareVersion);
        x.updateFirmware();
        System.out.println(AirPurifier.mostPopularModel);
        System.out.println(AirPurifier.currentFirmwareVersion);
        AirPurifier a = new AirPurifier("Pro", "GAT-105B");
        AirPurifier b = new AirPurifier("Portable", "RX-0");
        AirPurifier c = new AirPurifier("Portable", "RX-78-2");
        AirPurifier d = new AirPurifier("Portable", "Aerial");
        AirPurifier e = new AirPurifier("Pro", "Barbartos");
        AirPurifier f = new AirPurifier("Economy", "Family");
        System.out.println(AirPurifier.unitSold);
        AirPurifier.newFirmware("2.1");
        AirPurifier.setMostPopularModel("Economic");
        a.setToken("@#$%553");
        b.setPmLevel(2);
        System.out.println(c.serialNo);
        System.out.println(d.serialNo);
        System.out.println(e.serialNo);
        System.out.println(f.serialNo);
    }
}