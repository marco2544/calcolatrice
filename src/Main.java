import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a=1.0;
        double b=1.90;
        double ris=0;
        String op="+";
        HashMap<String,Operatore> map=new HashMap<String,Operatore>();
        map.put("+",new Somma());
        map.put("-",new Sottrazione());
        map.put("*",new Moltiplicazione());
        map.put("/",new Divisione());
        ris=map.get(op).calcolo(a,b);
        /*switch (op) {
        case "+":
             ris=somma(a,b);
             break;
        case "-":
            sottrazione(a,b);
            break;
        case "*":
            moltiploicazione(a,b);
            break;
        case "/":
            divisione(a,b);
            break;
        }*/
        System.out.println(a+" "+op+" "+b+"="+ris);
    }
    /*static double somma(Double a, Double b) {
        return a+b;
    }
    static double sottrazione(Double a, Double b) {
        return a-b;
    }
    static double moltiploicazione(Double a, Double b) {
        return a*b;
    }
    static double divisione(Double a, Double b) {
        if (b!=0){
            return a/b;
        }
        else {
            System.out.println("errore");
            return 0;
        }
    }*/
}