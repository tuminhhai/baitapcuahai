public class h {
    String thuong_hieu;
    String loai;
    int cong_suat;
    int cap_do;
    float gia;

    public h(String thuong_hieu, String loai, int cong_suat, int cap_do, float gia) {
        this.thuong_hieu = thuong_hieu;
        this.loai = loai;
        this.cong_suat = cong_suat;
        this.cap_do = cap_do;
        this.gia = gia;
    }

    public void bat() {
        System.out.println("bat quat len ");
    }

    public void tat() {
        System.out.println("tat quat di ");
    }

    public void hienthi() {
        System.out.println(" quat" + this.thuong_hieu + this.loai + this.gia);
    }


    public static void main(String[] args) {
        h banh = new h("thongnhat","hai",1000,1,10000);
        banh.hienthi();
        banh.bat();
        banh.tat();

    }
}
