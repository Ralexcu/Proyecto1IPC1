package Proyecto1;
import java.util.Scanner;
import Mascotas.*;
public class Arena {
    Scanner leer = new Scanner(System.in);
    Texto textoArena = new Textopackage Proyecto1;
import java.util.Scanner;
import Mascotas.*;
public class Arena {
    Scanner leer = new Scanner(System.in);
    Texto textoArena = new Texto();
    Jugador player = new Jugador(0, 0, 1, 1, 0);
    Mascota[] mascotasplayer = new Mascota[10];
    Mascota[] mascotasRivales = new Mascota[3];
    Mascota aux = new Mascota("auxiliar",1,1,1);
    Mascota vendida = new Mascota("Disponible",1,1,1);
    Tienda tiendaArena = new Tienda();
    boolean ready2Fight = false;
    public void play() {
        player.setOro(player.getOro()+10);
        do {
            textoArena.tituloArena();
            System.out.println("                 Ronda: " + player.getRonda());
            textoArena.opcionesRonda();
            int opcionRonda = leer.nextInt();
            switch (opcionRonda) {
                case 1:
                    System.out.println("Ordenar Equipo");
                    System.out.println("REPORTE DE MASCOTAS");
                    for (int i = 0; i < player.getMascotas(); i++) {
                        System.out.println((i + 1) + ".");
                        mascotasplayer[i].mostrarDatos();
                    }
                    System.out.println("Indique al animal que desea mover de posicion: ");
                    int posicionMascota = leer.nextInt();;
                    System.out.println("Indique la nueva posicion: ");
                    for (int i = 0; i < player.getMascotas(); i++) {
                        System.out.println((i + 1) + ".");
                    }
                    int nuevaPosicionMascota = leer.nextInt();
                    //intercambio basico de variables
                    aux = mascotasplayer[posicionMascota-1];
                    mascotasplayer[posicionMascota-1]=mascotasplayer[nuevaPosicionMascota-1];
                    mascotasplayer[nuevaPosicionMascota-1]=aux;
                    break;
                case 2:
                    switch (tiendaArena.iniciar()) {
                        case 1:
                            //condicional de oro
                            System.out.println("Comprar mascotas");
                            System.out.println("Oro disponible: " + player.getOro());
                            mascotasplayer[player.getMascotas()] = tiendaArena.comprarMascota();
                            player.setMascotas(player.getMascotas() + 1);
                            player.setOro(player.getOro() - 3);
                            break;
                        case 2:
                            System.out.println("Comprar comida");
                            System.out.println("Oro disponible: "+player.getOro());
                            break;
                        case 3:
                            System.out.println("Vender Mascotas");
                            System.out.println("REPORTE DE MASCOTAS");
                            for (int i = 0; i < player.getMascotas(); i++) {
                                System.out.println((i + 1) + ".");
                                mascotasplayer[i].mostrarDatos();
                            }
                            System.out.println("Seleccione la mascota que desea vender");
                            int opcionVenderMascota = leer.nextInt();
                            player.setOro(player.getOro() + mascotasplayer[opcionVenderMascota].getNivel());
                            mascotasplayer[opcionVenderMascota - 1] = vendida;
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                    break;
                case 3:
                    for (int i=0;i<3;i++){
                        mascotasRivales[i]=tiendaArena.generarMascota();
                    }
                    pelear();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (!ready2Fight);
    }
    public Jugador getPlayer(){return player;}
    //con esta funcion peleamos
    public void pelear(){
        System.out.println("tu equipo es: ");
        for (int i=0;i< player.getMascotas();i++){
            mascotasplayer[i].mostrarDatos();
        }
        System.out.println("El equipo enemigo es: ");
        for (int i=0;i<3;i++){
            mascotasRivales[i].mostrarDatos();
        }

    }
}
