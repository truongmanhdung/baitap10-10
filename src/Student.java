

public class Student extends Person {
    private String maSV;
    private float diemTb;
    private String email;

    public Student(String name, int sex, String birthDay, String address, String maSV, float diemTb, String email) {
        super(name, sex, birthDay, address);
        this.maSV = maSV;
        this.diemTb = diemTb;
        this.email = email;
    }

    public void inThongTinSinhVien(){
        String gioiTinh = super.getSex() == 1 ? "Nam" : "Nu";
        System.out.println("Tên là: " + super.getName() + " Gioi tinh là: " +
                gioiTinh + " Địa chỉ là: " + super.getAddress() + " Ma SV là : " + this.maSV + " diem tb là: " + this.diemTb + " Email là: " + this.email );
    }

    public boolean checkHocBong(){
        return this.diemTb > 8;
    }
}
