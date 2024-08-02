package SinhVien;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinhVienTestThem {
    SinhVienPoly sinhVien = new SinhVienPoly();

    @Test
    public void testThemThanhCong() {
        SinhVien sv = new SinhVien("1", "NguyenVanA","SD12345","Java", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemTenLopChuaKiTuDacBiet() {
        SinhVien sv = new SinhVien("1", "NguyenVanA","SD12345","Java#@", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemHoTenTrong() {
        SinhVien sv = new SinhVien("1", "","SD12345","Java", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemHoTenChuaKiTuDacBiet() {
        SinhVien sv = new SinhVien("1", "NguyenVanA#$","SD12345","Java", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemMaRong() {
        SinhVien sv = new SinhVien("1", "NguyenVanA","SD12345","Java", "");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemMaDaiHon10KiTu() {
        SinhVien sv = new SinhVien("1", "NguyenVanA","SD12345","Java", "PH123451234 ");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemHoTenDaiHon25KiTu() {
        SinhVien sv = new SinhVien("1", "NguyenVanANguyenVanAhdsafl","SD12345","Java", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemTenLopRong() {
        SinhVien sv = new SinhVien("1", "NguyenVanA","SD12345","", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemMaLopRong() {
        SinhVien sv = new SinhVien("1", "NguyenVanA","","Java", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

    @Test
    public void testThemMaLopChuaKiTuDacBiet() {
        SinhVien sv = new SinhVien("1", "NguyenVanA","SD12345","Java", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }
    @Test
    public void testThemHoTenItHon25KiTu() {
        SinhVien sv = new SinhVien("1", "NguyenTranTuO","SD12345","Java", "PH12345");
        sinhVien.addSv(sv);
        assertEquals("1", sinhVien.getAll().get(0).getId());
    }

}