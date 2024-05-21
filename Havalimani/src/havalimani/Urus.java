package havalimani;

import java.util.List;

public class Urus {

    String kalikis_zamani;
    Usak usak;
    List<String>personel_list;
    List<Yolcu>yolcus_List;
    int sefer_no;

    public Urus(int sefer_no,Usak usak, String kalikis_zamani,List<String> personel_list, List<Yolcu>yolci_List){
            this.kalikis_zamani = kalikis_zamani;
            this.personel_list = personel_list;
            this.yolcus_List = yolcus_List;
            this.sefer_no = sefer_no;
            this.usak = usak;
            
    }
    
}
