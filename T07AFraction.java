// File : T07AFration.java

public class T07AFraction {
    //bagian ide/algoritma
    static void sumFraction(int e1, int e2, int d1, int d2) {
         // Method sumFraction() untuk menghitung jumlah kedua pecahan
         int es, ds;
         es = (e1 * d2 + e2 * d1);
         ds = (d1 * d2);
    // Hasil pecahan
        if (es%ds == 0){
        System.out.println(es / ds);
    } else {
        System.out.println(es + "/" + ds);
    }
}
    static void productFraction(int e1, int d1, int e2, int d2) {
        // Method productFraction untuk perkalian kedua pecahan
        int ep,dp;
        ep = (e1 * e2);
        dp = (d1 * d2);
    //Hasil pecahan
        if (ep%dp == 0) {
            System.out.println(ep / dp);
        } else {
            System.out.println(ep + "/" + dp);
        }
        
    }
        static void printFraction(){
        // Method untuk dapat mencetak hasil
            sumFraction(1,2,2,3);
            sumFraction(1,3,3,4);
            productFraction(1,2,2,3);
            productFraction(1,4,2,3);
        }

        public static void main(String[] args){
        // Method untuk dapat melakukan testcase
            printFraction();
        }
}
