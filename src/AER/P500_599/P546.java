package AER.P500_599;

import java.util.*;

public class P546 {
    static HashSet<Integer> setA = new HashSet<>();
    static HashSet<Integer> setM = new HashSet<>();
    static HashSet<Integer> setar = new HashSet<>();
    static HashSet<Integer> setmr = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            init(sc, setA, setar);
            init(sc, setM, setmr);
            diferencia(setar,setM);
            diferencia(setmr, setA);
            setA.clear();
            setM.clear();
            setar.clear();
            setmr.clear();
            n--;
        }
    }

    private static void init(Scanner sc, HashSet<Integer> setA, HashSet<Integer> setAnoM) {
        int alex = sc.nextInt();
        for (int i = 0; i < alex; i++) {
            int num = sc.nextInt();
            if (setA.contains(num)) {
                setAnoM.add(num);
            } else {
                setA.add(num);
            }
        }
    }

    private static void diferencia(HashSet<Integer> setar, HashSet<Integer> setmr) {
        if (setar.size() > 0) {
            ArrayList<Integer> aToArray = new ArrayList<>();
            for (Iterator<Integer> it = setar.iterator(); it.hasNext(); ) {
                Integer i = it.next();
                if (!setmr.contains(i)) {
                    aToArray.add(i);
                }
            }
            if (!aToArray.isEmpty()) {
                Collections.sort(aToArray);
                for (int i = 0; i < aToArray.size()-1; i++) {
                    System.out.print(aToArray.get(i) + " ");
                }
                System.out.println(aToArray.get(aToArray.size()-1));
            } else {
                System.out.println("Nada que intercambiar");
            }
        } else {
            System.out.println("Nada que intercambiar");
        }
    }
}
