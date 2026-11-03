/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Infinix
 */
//Kelas Abstrak
abstract class Kendaraan{
    abstract void berjalan();
    
    void info(){
        System.out.println("Ini adalah Kendaraan: ");
    }
}

//Kelas Turunan
class Mobil extends Kendaraan{
    @Override
    void berjalan() {
        System.out.println("Mobil ini berjalan banter");
    }
}

class Sepeda extends Kendaraan{
    @Override
    void berjalan() {
        System.out.println("Sepeda ini berjalan alon");
    }
}      

//Kelas Main
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
    }
}
