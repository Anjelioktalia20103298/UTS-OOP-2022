package datapengunjung;

/**
 *
 * @author Anjeli Oktalia_20103298
 */
class Data{
    DataPengunjung dp;
    public Data(){
        dp=null;
    }
    public void push(DataPengunjung p){
        if(dp==null) dp=p;
        else{
            p.next=dp;
            dp=p;
        }
    }
    public void view(){
        if(dp==null) 
        System.out.println("Data Pengunjung Masih Kosong");
        else{
            DataPengunjung ptr=dp;
            System.out.println("Berikut adalah daftar pengunjung kebun binatang: ");
            while(ptr!=null){
                ptr.view();
                ptr=ptr.next;
            }
        }
    }
}