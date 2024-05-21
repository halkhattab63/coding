package odevtasarim;

public class UniNotu {

    /**
     * 
     */
    public void harf_notu(){
    
    float not = 1020; 
    float dortluNot  = not/25;
    
    if(dortluNot <= 0.99 && dortluNot >= 0 ){
        System.out.println("seiniki puan " + dortluNot + " FF: 0.00 - 0.99 - Başarisiz (Fail)");
    }

    else if(dortluNot <= 1.49 && dortluNot >= 1.00) {
        System.out.println("seiniki puan " + dortluNot + " DD: 1.00 - 1.49 - Alti Orta (Fail, Below Average)");
    }

    else if(dortluNot <= 1.99 && dortluNot >= 1.50) {
        System.out.println("seiniki puan " + dortluNot + " DC: 1.50 - 1.99 - Alti Orta Üzeri (Below Average, Above Fail))");
    }

    else if(dortluNot <= 2.49 && dortluNot >= 2.00) {
        System.out.println("seiniki puan " + dortluNot + " CC: 2.00 - 2.49 - Orta (Average)");
    }

    else if(dortluNot <= 2.99 && dortluNot >= 2.50) {
        System.out.println("seiniki puan " + dortluNot + " CB: 2.50 - 2.99 - Orta Üzeri (Above Average)");
    } 

    else if(dortluNot <= 3.49 && dortluNot >= 3.00) {
        System.out.println("seiniki puan " + dortluNot + " BB: 3.00 - 3.49 - İyi (Good)");
    }

    else if(dortluNot <= 3.99 && dortluNot >= 3.50) {
        System.out.println("seiniki puan " + dortluNot + " BA: 3.50 - 3.99 - Çok İyi (Very Good)");
    }

    else if(dortluNot == 4.00) {
        System.out.println("seiniki puan " + dortluNot + " AA: 4.00 - Mükemmel (Excellent)");
    }
    
    else {
        System.out.println("girdiginiz puan yanlis ");

    }
    /*
     *         float not = 1020;
        float dortluNot = not / 25;
        String notMesaji = "Seiniki puan " + dortluNot + " ";

        switch ((int) dortluNot) {
            case 0:
                notMesaji += "FF: 0.00 - 0.99 - Başarısız (Fail)";
                break;
            case 1:
                if (dortluNot >= 0 && dortluNot <= 0.99) {
                    notMesaji += "FF: 0.00 - 0.99 - Başarısız (Fail)";
                } else if (dortluNot >= 1 && dortluNot <= 1.49) {
                    notMesaji += "DD: 1.00 - 1.49 - Altı Orta (Fail, Below Average)";
                }
                break;
            case 2:
                if (dortluNot >= 1.50 && dortluNot <= 1.99) {
                    notMesaji += "DC: 1.50 - 1.99 - Altı Orta Üzeri (Below Average, Above Fail)";
                } else if (dortluNot >= 2 && dortluNot <= 2.49) {
                    notMesaji += "CC: 2.00 - 2.49 - Orta (Average)";
                }
                break;
            case 3:
                if (dortluNot >= 2.50 && dortluNot <= 2.99) {
                    notMesaji += "CB: 2.50 - 2.99 - Orta Üzeri (Above Average)";
                } else if (dortluNot >= 3 && dortluNot <= 3.49) {
                    notMesaji += "BB: 3.00 - 3.49 - İyi (Good)";
                }
                break;
            case 4:
                if (dortluNot >= 3.50 && dortluNot <= 3.99) {
                    notMesaji += "BA: 3.50 - 3.99 - Çok İyi (Very Good)";
                } else if (dortluNot == 4) {
                    notMesaji += "AA: 4.00 - Mükemmel (Excellent)";
                }
                break;
            default:
                notMesaji = "Girdiğiniz puan yanlış";
        }

        System.out.println(notMesaji);
    }
     */
}    
}
