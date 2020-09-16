
package trabajopractico02;


public class PruebaAutos {

    
    public static void main(String[] args) {
        Auto auto1=new Auto("EcoSport", "Ford",2000);
        auto1.setKilometraje(9000);
        System.out.println(auto1.getKilometraje());
        auto1.setMarca("Volskwagen");
        System.out.println(auto1.getMarca());
        auto1.setModello("Gol");
        System.out.println(auto1.getModelo());
        System.out.println(auto1.estadoAuto());
        
    }
    
}
