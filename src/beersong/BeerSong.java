/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author DanYu
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ninety_Nine_Bottles_of_Beer();
    }
    public static void Ninety_Nine_Bottles_of_Beer(){
        int count;
        for(count = 99; count > 1; count--){
        System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer");
        System.out.println("take one down, pass it around, " + (count-1) + " bottles of beer on the wall");
    }
        count=1;
        if(count == 1){
            System.out.println(count + " bottle of beer on the wall, " + count + " bottle of beer");
        System.out.println("take one down, pass it around, no more bottles of beer on the wall");
        }
           
    }
}
