package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.motion.MotionDetector;

import java.util.ArrayList;
import java.util.List;

public class FrightMachine extends MotionDetector {

   private List<Accessory> accessories = new ArrayList<>();

   public void addAccessories(Accessory accessory){
     accessories.add(accessory);
   }
    
    @Override
    public void onMotionDetected() {
       accessories.forEach(Accessory::activate);
    }
}
