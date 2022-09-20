import java.io.File;
import java.util.Scanner;

public class miaumiua {
    public static void main(String[] args) {

        String directorio;
        File actual = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Dime el directorio");
        directorio = input.next();
        try {
            actual = new File(directorio);
            if (actual.isDirectory()) {
                String[] contenido = actual.list();
                for (int i = 0; i < contenido.length; i++) {
                    System.out.println(contenido[i]);
                }
            }
            else
                System.out.println("El directorio no es válido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
