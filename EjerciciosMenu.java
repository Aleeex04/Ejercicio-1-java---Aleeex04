import java.util.Scanner;

public class EjerciciosMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Leer 5 números y mostrarlos en el mismo orden introducido");
            System.out.println("2. Leer 5 números y mostrarlos en orden inverso al introducido");
            System.out.println("3. Leer 5 números y realizar la media de los números positivos, la media de los negativos y contar los ceros");
            System.out.println("4. Contar caracteres de un texto");
            System.out.println("5. Invertir caracteres de un texto");
            System.out.println("6. Quitar espacios en blanco de un texto");
            System.out.println("7. Concatenar dos cadenas de texto");
            System.out.println("8. Concatenar cadena de texto y vocal");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarNumeros(leerNumeros());
                    break;

                case 2:
                    mostrarNumerosInversos(leerNumeros());
                    break;

                case 3:
                    calcularMediasYContarCeros(leerNumeros());
                    break;
                
                case 4:
                    contarCaracteres((args));
                    break;
                
                case 5:
                    inverso(args);
                    break;

                case 6:
                    quitarblanco(args);
                    break;
        
                case 7:
                    concatenarCadenas(args);
                    break;
                
                case 8:
                    cadenaconvocal(args);
                    break;

                case 9:
                    ascii();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }

    public static int[] leerNumeros() {
        int[] numeros = new int[5];
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    public static void mostrarNumeros(int[] numeros) {
        System.out.println("Los números introducidos son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void mostrarNumerosInversos(int[] numeros) {
        System.out.println("Los números en orden inverso son:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

    public static void calcularMediasYContarCeros(int[] numeros) {
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        double mediaPositivos = 0;
        double mediaNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                mediaPositivos += numeros[i];
                positivos++;
            } else if (numeros[i] < 0) {
                mediaNegativos += numeros[i];
                negativos++;
            } else {
                ceros++;
            }
        }

        if (positivos > 0) {
            mediaPositivos /= positivos;
        }
        if (negativos > 0) {
            mediaNegativos /= negativos;
        }

        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros introducidos: " + ceros);
    }

    public static void contarCaracteres(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String text = scanner.nextLine();
        System.out.println("El texto tiene " + text.length() + " caracteres.");
    }
    public static int leerTexto(String text) {
        return text.length();
    }


    public static void inverso(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();

        String textoInvertido = invertirTexto(texto);

        System.out.println("El texto invertido es: " + textoInvertido);
    }

    public static String invertirTexto(String texto) { 
        char[] caracteres = texto.toCharArray();
        int longitud = caracteres.length;
        char[] invertidos = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            invertidos[i] = caracteres[longitud - 1 - i];
        }

        return new String(invertidos);
  }

    public static void quitarblanco(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        String textoSinEspacios = eliminarEspacios(texto);
        System.out.println("Texto sin espacios: " + textoSinEspacios);
    }

        public static String eliminarEspacios(String texto) {
        return texto.replaceAll("\\s+", "");
        }

    public static void concatenarCadenas(String[] args) { 
        String cadena1 = "alex ";
        String cadena2 = "esta programando";
        String concatenacion = concatenarCadenas(cadena1, cadena2);
        System.out.println("La concatenación de las dos cadenas es: " + concatenacion);
    }
    
    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
        }
    
    public static void cadenaconvocal(String[] args) {
        String cadena = "El muercielago programa java";
        char vocal = 'a';
        System.out.println("Cadena original: " + cadena);
        System.out.println("Vocal a reemplazar: " + vocal);
        cadena = convertir(cadena, vocal);
        System.out.println("Cadena con vocales sustituidas: " + cadena);
    }
    public static String convertir(String cadena, char vocal) {
        char[] caracteres = cadena.toCharArray();
            for (int i = 0; i < caracteres.length; i++) {
                if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                    caracteres[i] = vocal;
                }
            }
        return new String(caracteres);
            }

    public static void ascii() {
        String cadena = "El murcielago y alex estan programando java!"; 
            for (int i = 0; i < cadena.length(); i++) {  
                char caracter = cadena.charAt(i);
                int codigoASCII = (int) caracter;
                System.out.println("El código ASCII de '" + caracter + "' es: " + codigoASCII);
               }
            }
}
