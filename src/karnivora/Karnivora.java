
package karnivora;


public class Karnivora {
    // variable 
       

    public static void main(String[] args) {
    //membuat objek
    hewan data = new hewan();
    System.out.println("Data PetShop");
    System.out.println("=============================");
    System.out.println("Jenis Hewan :"+data.getjenis());//output dan melakukan pemanggilan
    System.out.println("Usia Hewan  :"+data.getmakanan());
    System.out.println("Usia Hewan  :"+data.getumur());
    System.out.println("=============================");
     System.out.println("Usia Hewan  :"+data.getJenis());
     System.out.println("Usia Hewan  :"+data.getMakanan());
     System.out.println("Usia Hewan  :"+data.getUmur());
    }
    
}
 