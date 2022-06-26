import java.util.*;
import java.math.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class hash {

    public static int checkNumerico(String numero) {
        int resultado = 0;
        try {
            if (numero != null) {
                resultado = Integer.parseInt(numero);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Error NumberFormatException value: " + numero);
        }
        return resultado;
    }

    public static String ascii(int x) {
        if (x >= 0 & x < 78) {
            return Character.toString(x + 49);
        } else {
            return Character.toString(x);
        }
    }

    public static int solonumeros(String x) {

        String num = "1";

        for (int i = 0; x.length() > i; i++) {

            if (x.charAt(i) == 'a' || x.charAt(i) == 'k' || x.charAt(i) == 'u' || x.charAt(i) == 'E'
                    || x.charAt(i) == 'O' || x.charAt(i) == 'Y' || x.charAt(i) == '1') {
                num = num + '1';
            } else if (x.charAt(i) == 'b' || x.charAt(i) == 'l' || x.charAt(i) == 'v' || x.charAt(i) == 'F'
                    || x.charAt(i) == 'P' || x.charAt(i) == 'Z' || x.charAt(i) == '2') {
                num = num + '2';
            } else if (x.charAt(i) == 'c' || x.charAt(i) == 'm' || x.charAt(i) == 'w' || x.charAt(i) == 'G'
                    || x.charAt(i) == 'Q' || x.charAt(i) == '!' || x.charAt(i) == '3') {
                num = num + '3';
            } else if (x.charAt(i) == 'd' || x.charAt(i) == 'n' || x.charAt(i) == 'x' || x.charAt(i) == 'H'
                    || x.charAt(i) == 'R' || x.charAt(i) == '@' || x.charAt(i) == '4') {
                num = num + '4';
            } else if (x.charAt(i) == 'e' || x.charAt(i) == 'o' || x.charAt(i) == 'y' || x.charAt(i) == 'I'
                    || x.charAt(i) == 'S' || x.charAt(i) == '#' || x.charAt(i) == '5') {
                num = num + '5';
            } else if (x.charAt(i) == 'f' || x.charAt(i) == 'p' || x.charAt(i) == 'z' || x.charAt(i) == 'J'
                    || x.charAt(i) == 'T' || x.charAt(i) == '$' || x.charAt(i) == '6') {
                num = num + '6';
            } else if (x.charAt(i) == 'g' || x.charAt(i) == 'q' || x.charAt(i) == 'A' || x.charAt(i) == 'K'
                    || x.charAt(i) == 'U' || x.charAt(i) == '%' || x.charAt(i) == '7') {
                num = num + '7';
            } else if (x.charAt(i) == 'h' || x.charAt(i) == 'r' || x.charAt(i) == 'B' || x.charAt(i) == 'L'
                    || x.charAt(i) == 'V' || x.charAt(i) == '^' || x.charAt(i) == '8') {
                num = num + '8';
            } else if (x.charAt(i) == 'i' || x.charAt(i) == 's' || x.charAt(i) == 'C' || x.charAt(i) == 'M'
                    || x.charAt(i) == 'W' || x.charAt(i) == '&' || x.charAt(i) == '9') {
                num = num + '9';
            } else if (x.charAt(i) == 'j' || x.charAt(i) == 't' || x.charAt(i) == 'D' || x.charAt(i) == 'N'
                    || x.charAt(i) == 'X' || x.charAt(i) == '*' || x.charAt(i) == '0') {
                num = num + '0';
            } else {
                num = num + '9';
            }
        }

        return checkNumerico(num);
    }

    public static String primos(String x, int n1, int n2, int n3, int n4, int n5, int n6, int n7, int primo) {
        String aux = "";
        int a = 0;
        aux = aux + x.charAt(n3) + x.charAt(n6) + x.charAt(n1) + x.charAt(n2) + x.charAt(n7) + x.charAt(n5)
                + x.charAt(n4);

        a = solonumeros(aux);

        if (primo == 0) {
            a = a * 599;
        } else if (primo == 2) {
            a = a * 347;
        }

        else if (primo == 3) {
            a = a * 433;
        }

        else if (primo == 4) {
            a = a * 269;
        } else if (primo == 5) {
            a = a * 409;
        } else if (primo == 6) {
            a = a * 631;
        } else if (primo == 7) {
            a = a * 883;
        } else if (primo == 8) {
            a = a * 991;
        } else if (primo == 9) {
            a = a * 277;
        } else if (primo == 1) {
            a = a * 173;
        }
        a = Math.abs(a);

        return String.valueOf(a);
    }

    public static String makehash(String x) {
        String hash = "", aux = x , fin= "";

        if (x.length() < 32) {
            
            for (int i = x.length(); i < 32; i++) {
                aux = aux + ascii(i);
            }

        }
      

        hash = hash + primos(aux, 0, 2, 3, 4, 5, 6, 7, 8);
        hash = hash
                + primos(aux, aux.length() - 1, aux.length() - 8, aux.length() - 2, aux.length() - 3, aux.length() - 4,
                        aux.length() - 5, aux.length() - 6, aux.length() - 7);
        hash = hash + primos(aux, (aux.length() / 2) - 1, (aux.length() / 2) - 2, (aux.length() / 2) - 3,
                (aux.length() / 2) - 4, (aux.length() / 2) - 5, (aux.length() / 2) - 6, (aux.length() / 2) - 7,
                (aux.length() / 2) - 8);
        hash = hash + primos(aux, (aux.length() / 2) + 1, (aux.length() / 2) + 2, (aux.length() / 2) + 3,
                (aux.length() / 2) + 4, (aux.length() / 2) + 5, (aux.length() / 2) + 6, (aux.length() / 2) + 7,
                (aux.length() / 2) + 8);
        hash = hash + primos(aux, 0, 3, 5, 7, aux.length() - 1, aux.length() - 3, aux.length() - 5, aux.length() - 7);
        hash = hash + primos(aux, 2, 4, 6, 8, aux.length() - 2, aux.length() - 4, aux.length() - 6, aux.length() - 8);
        hash = hash + primos(aux, 0, 2, 3, 4, 5, 6, 7, 8+1);
        hash = hash
                + primos(aux, aux.length() - 1, aux.length() - 8, aux.length() - 2, aux.length() - 3, aux.length() - 4,
                        aux.length() - 5, aux.length() - 6, aux.length() - 7+1);
        hash = hash + primos(aux, (aux.length() / 2) - 1, (aux.length() / 2) - 2, (aux.length() / 2) - 3,
                (aux.length() / 2) - 4, (aux.length() / 2) - 5, (aux.length() / 2) - 6, (aux.length() / 2) - 7,
                (aux.length() / 2) - 8+1);
        hash = hash + primos(aux, (aux.length() / 2) + 1, (aux.length() / 2) + 2, (aux.length() / 2) + 3,
                (aux.length() / 2) + 4, (aux.length() / 2) + 5, (aux.length() / 2) + 6, (aux.length() / 2) + 7,
                (aux.length() / 2) + 8+1);
        hash = hash + primos(aux, 0, 3, 5, 7, aux.length() - 1, aux.length() - 3, aux.length() - 5, aux.length() - 7+1);
        hash = hash + primos(aux, 2, 4, 6, 8, aux.length() - 2, aux.length() - 4, aux.length() - 6, aux.length() - 8+1);
        hash = hash + primos(aux, 0, 2, 3, 4, 5, 6, 7, 0);
        hash = hash
                + primos(aux, aux.length() - 1, aux.length() - 8, aux.length() - 2, aux.length() - 3, aux.length() - 4,
                        aux.length() - 5, aux.length() - 6, aux.length() - 7 +2);
        String n="";
        for(int i=0; i<110;i=i+2){
            n= ""+hash.charAt(i) + hash.charAt(i+1);
            fin=fin + ascii(Integer.parseInt(n));

        }
        
        return fin;
    }

    public static void main(String args[]) {
        FileReader archivo;
        FileReader archivo1;
        FileReader archivo2;
        BufferedReader lector;
        BufferedReader lector1;
        BufferedReader lector2;
        boolean inicio =true;
        long endTime;
        Scanner scan = new Scanner(System.in);
        long startTime=0;
    System.out.println("1.- Archivo");
    System.out.println("2.- Consola");
    int n = scan.nextInt();
    String cadena="";

switch(n){

    case 1:
        try{
            startTime = System.nanoTime();

            archivo = new FileReader("archivo.txt");
           
         
            if(archivo.ready()){
            lector = new BufferedReader(archivo);
             cadena="";
            while(lector.readLine() != null){
                cadena=cadena+lector.readLine();
            }
            System.out.println(makehash(cadena));
            }
            else{
                System.out.println("Archivo no listo.");
            }


            archivo1 = new FileReader("archivo1.txt");

            if(archivo1.ready()){
                lector = new BufferedReader(archivo1);
                 cadena="";
                while(lector.readLine() != null){
                    cadena=cadena+lector.readLine();
                }
                System.out.println(makehash(cadena));
                }
                else{
                    System.out.println("Archivo no listo.");
                }

                archivo2 = new FileReader("archivo2.txt");

                if(archivo2.ready()){
                    lector = new BufferedReader(archivo2);
                     cadena="";
                    while(lector.readLine() != null){
                        cadena=cadena+lector.readLine();
                    }
                    System.out.println(makehash(cadena));
                    }
                    else{
                        System.out.println("Archivo no listo.");
                    }

             endTime = System.nanoTime();
             System.out.println("Tiempo prueba:" + (endTime-startTime));

        }  catch (Exception e) {
            System.out.println("Error");
        }
        break;
    case 2:
    System.out.println("Numero de pruebas:");
    int f = scan.nextInt();
    
         inicio=true;
    for(int i =0; i<f;i++){
        String a = scan.next();
        if(inicio){
         startTime = System.nanoTime();
         inicio=false; 
    }
        System.out.println(makehash(a));
       }
     endTime = System.nanoTime();
    System.out.println("Tiempo prueba:" + (endTime-startTime));
    break;
    }

    }

}
