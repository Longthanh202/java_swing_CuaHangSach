/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author thanh
 */
public class mycombobox {
    Object value;
    Object text;

    public mycombobox(Object value, Object text) {
        this.value = value;
        this.text = text;
    }
    public String toString(){
        return text.toString();
    }

    public int getMaInt() {
        return Integer.parseInt(value.toString());
    }

    public String getMaString() {
        return value.toString();
    } 
}
