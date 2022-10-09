import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("Mời bạn nhập thông tin sinh viên: ");
            Scanner sc = new Scanner(System.in);

            System.out.println("Mời bạn nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Mời bạn nhập giới tính: ");
            int sex = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập ngày sinh: ");
            String birthDay = sc.nextLine();
            System.out.println("Mời bạn nhập mã sinh viên: ");
            String maSV = sc.nextLine();
            System.out.println("mời bạn nhập địa chỉ: ");
            String address = sc.nextLine();
            System.out.println("Mời bạn nhập điểm tb: ");
            float diemTb = Float.parseFloat(sc.nextLine());
            System.out.println("Mời bạn nhập email: ");
            String email = sc.nextLine();

            Student sinhvien = new Student(name, sex, birthDay, address, maSV, diemTb, email);

            sinhvien.inThongTinSinhVien();
            if(sinhvien.checkHocBong()){
                System.out.println("Sinh viên đạt học bổng");
            }else{
                System.out.println("Sinh viên ko đạt học bổng");
            }
        }
    }
}