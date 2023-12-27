import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/*
 Escribe conRandomAccesible un fichero con los siguientes datos de 5 productos:
* id(int)
* nombre (String, 10 Caracteres)
* precio (double)
* descuento (boolean)
* tipo (char)
*/
public class Ejercicio_7 {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1,"Producto 1", 10.5, true,'T'));
        productos.add(new Producto(2,"Producto 2", 50.5, true,'R'));
        productos.add(new Producto(3,"Producto 3", 10.5, false,'B'));
        productos.add(new Producto(4,"Producto 4", 30.5, true,'T'));
        productos.add(new Producto(5,"Producto 5", 20.5, true,'K'));

        try (RandomAccessFile raf = new RandomAccessFile("ejemplo_raf.dat", "rw")){

            for (Producto p : productos){
                raf.writeInt(p.getId());

                StringBuffer sb = new StringBuffer(p.getNombre());
                sb.setLength(10);

                raf.writeChars(sb.toString());
                raf.writeDouble(p.getPrecio());
                raf.writeBoolean(p.isDescuento());
                raf.writeChar(p.getTipo());
            }

            //4 + 20 +8 + 1 + 2 = 35 bites cada registro

            raf.seek(35);

            System.out.println(raf.readInt());
            String nombre = "";

            for (int i = 0; i < 10; i++) {
                nombre += raf.readChar();
            }
            
            System.out.println(nombre);
            System.out.println(raf.readDouble());
            System.out.println(raf.readBoolean());
            System.out.println(raf.readChar());

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Producto {

    private int id;
    private String nombre;
    private double precio;
    private boolean descuento;
    private char tipo;

    public Producto(int id, String nombre, double precio, boolean descuento, char tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public char getTipo() {
        return tipo;
    }
}