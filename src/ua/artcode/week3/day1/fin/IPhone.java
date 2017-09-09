package ua.artcode.week3.day1.fin;

import ua.artcode.week3.day1.fin.CloudAccount;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class IPhone {

    // Fields and properties:

    private final int screenSize;
    private final int ram;
    private final int flashMemory;
    private final String model;
    private final CloudAccount account;     // We can't change the ref, BUT we can change the instance !!!

    // Constructors:

    public IPhone() {
//        screenSize = 6;
//        ram = 2048;
//        flashMemory = 16_000;
//        model = "6s";
//        account = new CloudAccount("alex323glo", "pass_word");

        // possible variant:
        this(6, 2048, 16_384, "5s",
                new CloudAccount("alex323glo", "pass_word"));
    }

    public IPhone(int screenSize, int ram, int flashMemory, String model, CloudAccount account) {
        this.screenSize = screenSize;
        this.ram = ram;
        this.flashMemory = flashMemory;
        this.model = model;
        this.account = account;
    }

    // Getters:

    public int getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getFlashMemory() {
        return flashMemory;
    }

    public String getModel() {
        return model;
    }

    public CloudAccount getAccount() {
        return account;
    }

    // Other methods:

    public final void start() {
        System.out.println("start iphone");
    }

}
