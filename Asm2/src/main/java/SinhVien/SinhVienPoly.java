package SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienPoly {

    List<SinhVien> sinhViens;

    public SinhVienPoly(){
        sinhViens = new ArrayList<>();
    }

    public List<SinhVien> getAll(){
        return sinhViens;
    }

    public void addSv(SinhVien sinhVien){
        if (sinhVien.getMaSv().isEmpty()){
            throw new IllegalArgumentException("Mã sinh viên không được để trống");
        }
        if (sinhVien.getHoten().isEmpty()){
            throw new IllegalArgumentException("Tên không được để trống");
        }
        if (sinhVien.getMaSv().length() > 10){
            throw new IllegalArgumentException("Mã sinh viên không được quá 10 kí tự");
        }
        if (sinhVien.getHoten() == null || !sinhVien.getHoten().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Tên không chứa kí tự đặc biệt");
        }
        if (sinhVien.getHoten().length() >= 25){
            throw new IllegalArgumentException("Tên không được quá 25 kí tự");
        }
        if (sinhVien.getTenLop().isEmpty()) {
            throw new IllegalArgumentException("Tên lớp không được để trống");
        }
        if (!sinhVien.getTenLop().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Tên lớp không chứa kí tự đặc biệt");
        }
        sinhViens.add(sinhVien);
    }
}
