/*
1.
what should be instance variables?
-An iot token.
-model number
-serial number
-firmware version
-power on/off
-speed
-desired pm level

what should be instance methods?
-turn on
-turn off
-set speed
-set desired pm level
-set token
-updateFirmware

what should be class variables?
-Most recent firmware version
-mostPopularModel
-unitSold

what should be class methods?
-setMostPopularModel
-newFirmware

 */
/*
2.
    instance method?
        turn on():  return - power = on
        turn off(): return - power = off
        set speed():    input - int
                        return - speed
        #Adjust the fan speed
        set desired pm level(): input - int
                            return - pm level
        #Adjust the desired pm level
        set token():    input - string
                        return - token
        #Store the token values of the model in an object
        update firmware(): #Update the version firmware of the device to the current version firmware

    class method?
        set Most Popular Model():   input - String model
                                    return - mostPopularModel
        #Assign the name of the model to mostPopularModel as the input model
        new Firmware(): input - String newVersion
                        return - currentFirmwareVersion
        #deployed new version of firmware

 */

public class AirPurifier {
    String model;
    String serialNo;
    boolean power = false;
    int speed = 1;
    int pmLevel = 30;
    String token = null;
    String firmwareVersion = "1.0";
    void turnOn() {
        power = true;
        System.out.println("Turned On the Air purifier");
    }
    void turnOff() {
        power = false;
        System.out.println("Turned Off the Air purifier");
    }
    void setSpeed(int speed) {
        if(speed > 0 && speed <= 3){
            this.speed = speed;
            System.out.println("Set speed to " + speed);
        }else{
            System.out.println("Please set speed from 1 to 3");
        }
    }
    void setPmLevel(int level) {
        pmLevel = level;
        System.out.println("Set PM Level to " + level);
    }
    void setToken (String token) {
        this.token = token;
        System.out.println("Updated Token");
    }
    void updateFirmware() {
        this.firmwareVersion = AirPurifier.currentFirmwareVersion;
        System.out.println("Updated Firmware Version to " + firmwareVersion);
    }

    AirPurifier(String model, String serialNo) {
        this.model = model; this.serialNo = serialNo;
        unitSold += 1;
    }

    static int unitSold = 0;
    static String currentFirmwareVersion = "1.5";
    static String mostPopularModel = "Pro";
    static void newFirmware(String newVersion) {
        currentFirmwareVersion = newVersion;
        System.out.println("Deployed new Firmware Version [" + currentFirmwareVersion + "]");
    }
    static void setMostPopularModel(String model) {
        mostPopularModel = model;
        System.out.println("Updated New PopularModel to " + mostPopularModel);
    }
}
