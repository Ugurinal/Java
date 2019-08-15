/*
 * Copyright (c) 2019.
 */

/**
 * Created by UGURINAL
 * 8/15/2019
 * 8:01 PM
 */


public class Computer {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public Computer(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public void setTheMonitor(Monitor theMonitor) {
        this.theMonitor = theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    public void setTheMotherboard(Motherboard theMotherboard) {
        this.theMotherboard = theMotherboard;
    }
}
