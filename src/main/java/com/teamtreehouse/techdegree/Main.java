package com.teamtreehouse.techdegree;

import com.example.accessory.Accessory;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

public class Main {

    public static void main(String[] args) {
        FrightMachine machine = new FrightMachine();

        Horn horn = new Horn();
        Strobe strobe = new Strobe();
        Camera camera = new Camera();

        machine.addAccessories(horn);
        machine.addAccessories(strobe);
        machine.addAccessories(camera);

        machine.simulateMotion();
    }
}
