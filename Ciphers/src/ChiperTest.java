public class ChiperTest {

    public static void main(String[] args){
        System.out.println("Ceaser's Cipher Method");
        String message = "Hello Ceaser";
        CeaserCipher cc = new CeaserCipher();
        String EncryptedString = cc.encryption(3, message);
        String DecryptedString = cc.decryption(3, EncryptedString);
        System.out.println("ENC : "+EncryptedString);
        System.out.println("DEC : "+DecryptedString);
        System.out.println("-----------------------------------\n");

        System.out.println("Keyword Cipher Method");
        String sndMessage = "hellokeyword";
        KeywordCipher kc = new KeywordCipher();
        kc.makeMap("network");
        String KCES = kc.encryption(sndMessage);
        String KCDS = kc.decryption(KCES);
        System.out.println("ENC : "+KCES);
        System.out.println("DEC : "+KCDS);
        System.out.println("-----------------------------------\n");

        System.out.println("DoubleMap Cipher Method");
        String thdMessage = "hellodoublemap";
        DoubleMapCipher dmc = new DoubleMapCipher();
        dmc.makeFirstMap("network");
        dmc.makeSecondMap(3);
        String DMCES = dmc.encryption(thdMessage);
        String DMCDS = dmc.decryption(DMCES);
        System.out.println("ENC : "+DMCES);
        System.out.println("DEC : "+DMCDS);
        System.out.println("-----------------------------------\n");

        System.out.println("Column Cipher Method");
        String frtMessage = "heaven helps those who help themselves";
        ColumnCipher coc = new ColumnCipher(7);
        String COCES = coc.encryption(frtMessage);
        String COCDS = coc.decryption(COCES);
        System.out.println("ENC : "+COCES);
        System.out.println("DEC : "+COCDS);
        System.out.println("-----------------------------------\n");

        System.out.println("Column&Keyword Cipher Method");
        String fthMessage = "heaven helps those who help themselves";
        ColumnKeywordCipher ckc = new ColumnKeywordCipher();
        ckc.setKeywordAndColumnLength("network", 7);
        String CKCES = ckc.encryption(fthMessage);
        String CKCDS = ckc.decryption(CKCES);
        System.out.println("ENC : "+CKCES);
        System.out.println("DEC : "+CKCDS);
        System.out.println("-----------------------------------\n");
    }

}
