package Proyecto1;
import java.util.Scanner;
import Mascotas.*;
public class Tienda {
    private int ronda;
    private Mascota[] mascotasTienda = new Mascota[12];
    private Mascota[] mascotasAux = new Mascota[10];
    private Jugador player = new Jugador(0, 0, 1, 1, 0);
    Texto textoTienda = new Texto();
    Scanner leer = new Scanner(System.in);
    public int iniciar() {
        player.setOro(player.getOro() + 10);
        textoTienda.titulo();
        textoTienda.menuTienda();
        return leer.nextInt();
    }
    public Mascota comprarMascota(){
        generarMascota();
        System.out.println("Comprar mascota");
        //llenamos el stock de la tienda
        for (int i=0;i<3;i++){
            mascotasTienda[i] = generarMascota();
        }
        //Escribimos el stock
        for (int j=0;j<3;j++){
            System.out.println((j+1)+".");
            mascotasTienda[j].mostrarDatos();
        }
        System.out.println("Ingrese el numero de la mascota que desee: ");
        int opcionMascota = leer.nextInt();
        return mascotasTienda[opcionMascota-1];
    }
    //generamos todas las mascotas aleatorias
    public Mascota generarMascota(){
        int random = (int) Math.floor(Math.random()*(8-1+1)+1);
        if (random == 1){
            return new Caballo("Caballo",1,1,1);
        }
        else if(random == 2){
            return new Castor("Castor",1,1,1);
        }
        else if (random == 3){
            return new Escarabajo("Escarabajo",1,1,1);
        }
        else if(random == 4){
            return new Grillo("Grillo",1,1,1);
        }
        else if(random == 5){
            return new Hormiga("Hormiga",1,1,1);
        }
        else if(random == 6){
            return new Mosquito("Mosquito",1,1,1);
        }
        else if(random == 7){
            return new Nutria("Nutria",1,1,1);
        }
        else if(random == 8){
            return new Pescado("Pescado",1,1,1);
        }
        return new Mascota("Default",1,1,1);
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           package Proyecto1;
import java.util.Scanner;
import Mascotas.*;
public class Tienda {
    private int ronda;
    private Mascota[] mascotasTienda = new Mascota[12];
    private Mascota[] mascotasAux = new Mascota[10];
    private Jugador player = new Jugador(0, 0, 1, 1, 0);
    Texto textoTienda = new Texto();
    Scanner leer = new Scanner(System.in);
    public int iniciar() {
        player.setOro(player.getOro() + 10);
        textoTienda.titulo();
        textoTienda.menuTienda();
        return leer.nextInt();
    }
    public Mascota comprarMascota(){
        generarMascota();
        System.out.println("Comprar mascota");
        //llenamos el stock de la tienda
        for (int i=0;i<3;i++){
            mascotasTienda[i] = generarMascota();
        }
        //Escribimos el stock
        for (int j=0;j<3;j++){
            System.out.println((j+1)+".");
            mascotasTienda[j].mostrarDatos();
        }
        System.out.println("Ingrese el numero de la mascota que desee: ");
        int opcionMascota = leer.nextInt();
        return mascotasTienda[opcionMascota-1];
    }
    //generamos todas las mascotas aleatorias
    public Mascota generarMascota(){
        int random = (int) Math.floor(Math.random()*(8-1+1)+1);
        if (random == 1){
            return new Caballo("Caballo",1,1,1);
        }
        else if(random == 2){
            return new Castor("Castor",1,1,1);
        }
        else if (random == 3){
            return new Escarabajo("Escarabajo",1,1,1);
        }
        else if(random == 4){
            return new Grillo("Grillo",1,1,1);
        }
        else if(random == 5){
            return new Hormiga("Hormiga",1,1,1);
        }
        else if(random == 6){
            return new Mosquito("Mosquito",1,1,1);
        }
        else if(random == 7){
            return new Nutria("Nutria",1,1,1);
        }
        else if(random == 8){
            return new Pescado("Pescado",1,1,1);
        }
        return new Mascota("Default",1,1,1);
    }
}