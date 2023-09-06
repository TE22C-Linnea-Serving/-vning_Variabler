public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("START");

        int tal1 = 2;
        int tal2 = 30;

        int summa_addition = tal1+tal2;
        int summa_subtraktion = tal1-tal2; 

        System.out.println("summan av tal + tal2 är "+summa_addition);
        System.out.println("Differensen av tal - tal2 är "+summa_subtraktion);

        int produkt = tal1*tal2;
        int kvot = tal1/tal2;

        System.out.println("Produkten av tal1*tal2 är "+produkt);
        System.out.println("Kvoten av tal1/tal2 är "+kvot);

        int rest1 = 10%3;
        int rest2 = 9%3;

        System.out.println("Resten av 10/3 är "+rest1);
        System.out.println("Resten av 9/3 är "+rest2);

        Double decimal_tal1 = 5.0;
        Double decimal_tal2 = 23.41;

        Double dec_summa_add = decimal_tal1+decimal_tal2;
        Double dec_summa_sub = decimal_tal1-decimal_tal2;

        System.out.println("Summan av additionen är "+dec_summa_add);
        System.out.println("Differensen av subrtactionen är "+dec_summa_sub);

    }
}
