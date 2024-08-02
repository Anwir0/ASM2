

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrungBinhCongTest {

    TrungBinhCong tbc = new TrungBinhCong();

    @Test
    public void testDanhSachRong() {
        List<Integer> el = Arrays.asList();
        assertEquals(ArithmeticException.class, tbc.tbc(el));
    }

    @Test
    public void testDanhSachCo1PhanTu() {
        List<Integer> sl = Arrays.asList(10);
        assertEquals(10, tbc.tbc(sl));
    }

    @Test
    public void testDanhSachCoNhieuPhanTu() {
        List<Integer> ml = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3, tbc.tbc(ml));
    }

    @Test
    public void testDanhSachChiChuaSoDuong() {
        List<Integer> pl = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3, tbc.tbc(pl));
    }

    @Test
    public void testDanhSachChiChuaSoAm() {
        List<Integer> nl = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(-3, tbc.tbc(nl));
    }

    @Test
    public void testDanhSachChuaSoAmVaDuong() {
        List<Integer> mma = Arrays.asList(-1, -2, 3, 4);
        assertEquals(1, tbc.tbc(mma));
    }

    @Test
    public void testDanhSachChuaSo0() {
        List<Integer> zl = Arrays.asList(0, 1, 2, 3, 4, 5);
        assertEquals(2.5, tbc.tbc(zl));
    }

    @Test
    public void testDanhSachChuaCacSoLon() {
        List<Integer> ll = Arrays.asList(1000000, 2000000, 3000000, 4000000, 5000000);
        assertEquals(3000000, tbc.tbc(ll));
    }

    @Test
    public void testDanhSachChuaCacSoTrung() {
        List<Integer> dl = Arrays.asList(1, 1, 1, 1, 1);
        assertEquals(1, tbc.tbc(dl));
    }

    @Test
    public void testDanhSachNull(){
        assertEquals(ArithmeticException.class, tbc.tbc(null));
    }

}