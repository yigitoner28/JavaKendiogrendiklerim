public class CokBoyutluDiziyiBulma {

// En büyük elemanı bulma ;

                                                                                                                    /*  0|j
    public static void main(String[] args) {                                                                       0|j  56 |12 |1 |231 
        double[][] matris = {{56, 12, 1, 231},                                                                          234|21 |78|26
                {234, 21, 78, 26},                                                                                      654|33 |32|67                                                           
                {654, 33, 32, 67},                                                                                      189|35|56 |89                                                                                                
                {189, 35, 56, 89}

        };
                                                                                                                       */

    }

    public static double enBuyukElemaniBul(double[][] buyukCalis) {  // ilk int olarak yapmaya çalıştım hata verdiği için double cinsine döndüm
        double enBuyukEleman = buyukCalis[0][0];
        int i;
        for (i = 0; i < buyukCalis.length; i++) {

            for (int j = 0; j < buyukCalis[0].length; j++) { // iki boyutlu olduğundan 2 for döngüsü yazdım
                if (enBuyukEleman<buyukCalis[i][j]){
                    enBuyukEleman=buyukCalis[i][j];
                }
            }
        }
    return enBuyukEleman;
    }






}
