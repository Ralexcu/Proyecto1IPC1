package Mascotas;
public class Mascota {
    private String nombre;
    private int vida;
    private int danio;
    private int nivel;
    public Mascota(Stripackage Mascotas;
public class Mascota {
    private String nombre;
    private int vida;
    private int danio;
    private int nivel;
    public Mascota(String nombre, int vida, int danio, int nivel){
        this.nombre = nombre;
        this.vida = vida;
        this.danio = danio;
        this.nivel = nivel;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Vida: "+this.vida);
        System.out.println("Ataque: "+this.danio);
        System.out.println("Nivel: "+this.nivel);
        System.out.println();
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
