import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);
    public static int aggiungi(String[] v, int n, String e, int ie) {
        int i;

        n = n + 1;
        for (i = n - 1; i >= ie; i--) {
            v[i] = v[i - 1];
        }
        v[ie] = e;
        
        return n;
    }
    
    public static int controllo(int x) {
        int x;

        do {
            System.out.println("1) Nuovo libro in biblioteca " + "2) Visualizza libri in biblioteca " + "3) Visualizza libri in prestito " + "4) Prendi in prestito un libro" + "5) Restituisci un libro" + "6) Esci dal programma ");
            x = input.nextInt();
        } while (x > 6 && x <= 0);
        
        return x;
    }
    
    public static int controlloIndice(int n, int ie) {
        int ie;

        while (ie <= 0 && ie > n) {
            System.out.println("indice del libro deve  essere compreso fra 0 e " + n);
            ie = input.nextInt();
        }
        
        return ie;
    }
    
    public static int elimina(String[] v, int n, int ie) {
        int n, i;

        for (i = ie; i <= n - 2; i++) {
            v[i] = v[i + 1];
        }
        
        return n;
    }
    
    public static void riempi(String[] b, int n) {
        int i;
        String l;

        for (i = 0; i <= n - 1; i++) {
            System.out.println("inserire il " + i + "libro");
            l = input.nextLine();
            b[i] = l;
        }
    }
    
    public static void visualizza(String[] v, int n) {
        int i;

        for (i = 0; i <= n - 1; i++) {
            System.out.println("posizione: " + i + "libro: " + v[i]);
        }
    }
}


    public static void main(String[] args) {
        int i, j, n, x, e;
        int e;

        System.out.println("inserire numero libri");
        n = input.nextInt();
        int[] b = new int[n], p = new int[n];

        riempi(v, n);
        do {
            x = controllo(x);
            if (x == 1) {
                System.out.println("inserire posizione nuovo libro");
                ie = input.nextLine();
                ie = controlloIndice(n, ie);
                System.out.println("nome del nuovo libro");
                e = input.nextInt();
                n = aggiungi(b, n, e, ie);
            } else {
                if (x == 2) {
                    visualizza(v, n);
                } else {
                    if (x == 3) {
                        visualizza(p, n);
                    } else {
                        if (x == 4) {
                            System.out.println("inserire l'indice del libro interessato");
                            ie = input.nextLine();
                            ie = controlloIndice(n, ie);
                            n = elimina(b, n, ie);
                            System.out.println("inserire libro nnei prestiti");
                            e = input.nextInt();
                            n = aggiungi(p, n, e, ie);
                        } else {
                            if (x == 5) {
                                System.out.println("inserire l'indice del libro interessato");
                                ie = input.nextLine();
                                ie = controlloIndice(n, ie);
                                n = elimina(p, n, ie);
                                System.out.println("inserire libro nnei prestiti");
                                e = input.nextInt();
                                n = aggiungi(b, n, e, ie);
                            }
                        }
                    }
                }
            }
        } while (x != "6");
    }
    
    