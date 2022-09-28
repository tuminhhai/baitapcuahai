public class quat {
    String thuongHieu;
    String loai;
    float gia;
    int congSuat;
    int capDo;
    boolean quayNgang;

    public quat(String thuongHieu, String loai, float gia, int congSuat) {
        this.thuongHieu = thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.capDo = 0;
        this.quayNgang = false;
    }

    void chuyenSo(int so) {
        if (so >= 0)
            this.capDo = so;
        else
            System.out.println("So khong hop le");
    }

    void chuyenTrangThaiQuay() {
        this.quayNgang = !this.quayNgang;
    }

    void bat() {
        if (this.capDo == 0) {
            chuyenSo(1);
        }
    }

    void tat() {
        chuyenSo(0);
    }

    @Override
    public String toString() {
        return  "  quat{" +
                "  thuongHieu='" + thuongHieu + '\'' +
                ", loai='" + loai + '\'' +
                ", gia=" + gia +
                ", congSuat=" + congSuat +
                ", capDo=" + capDo +
                ", quayNgang=" + quayNgang +
                '}';
    }

    void hienThi() {
        System.out.println(this);
    }

    public static void main(String[] args) {

        quat LG1 = new quat("VIETNAM", "LG", 10000, 2000);
        quat K2 = new quat("MỸ", " k2", 40000, 3000);
        LG1.hienThi();
        K2.hienThi();
        LG1.bat();
        K2.tat();
        LG1.chuyenSo(2);
        K2.chuyenSo(3);
        LG1.chuyenTrangThaiQuay();
        LG1.hienThi();
    }
}