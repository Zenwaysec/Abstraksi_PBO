/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author Infinix
 */
//Kelas Abstrak
abstract class Hewan{
    abstract void bersuara();
    
    void info(){
        System.out.println("Hewan ini berbunyi: ");
    }
}

//Kelas Turunan
class Kucing extends Hewan{
    @Override
    void bersuara() {
        System.out.println("Miawww Mprrr");
    }
}

class Anjing extends Hewan{
    @Override
    void bersuara() {
        System.out.println("Aughh ughh");
    }
}      

//Kelas Main
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.info();
        kucing.bersuara();
        
        anjing.info();
        anjing.bersuara();
    }
    
}
