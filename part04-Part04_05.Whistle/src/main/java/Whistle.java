/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dlesk
 */
public class Whistle {
    private String sound;
    
    public Whistle(String WhistleSound) {
        this.sound = WhistleSound;
    }
    public void sound() {
        System.out.println(this.sound);
    }
}
