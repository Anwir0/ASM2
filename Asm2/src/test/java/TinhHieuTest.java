import org.junit.Test;

import static org.junit.Assert.*;

public class TinhHieuTest {

    TinhHieu th = new TinhHieu();

    @Test
    public void testHieu2SoNguyenDuong(){
        assertEquals(5, th.TH(10, 5));
    }

    @Test
    public void testHieu2SoNguyenAm() {
        assertEquals(-5, th.TH(-10, -5));
    }

    @Test
    public void testHieu1DuongVa1Am() {
        assertEquals(15, th.TH(10, -5));
    }

    @Test
    public void testHieu1AmVa1Duong() {
        assertEquals(-15, th.TH(-10, 5));
    }

    @Test
    public void testHieu2So0() {
        assertEquals(0, th.TH(0, 0));
    }

    @Test
    public void testHieuSo0Va1SoDuong() {
        assertEquals(-5, th.TH(0, 5));
    }

    @Test
    public void testHieuSo0Va1SoAm() {
        assertEquals(5, th.TH(0, -5));
    }

    @Test
    public void testHieu1SoDuongVaSo0() {
        assertEquals(5, th.TH(5, 0));
    }

    @Test
    public void testHieu1SoAmVaSo0() {
        assertEquals(-5, th.TH(-5, 0));
    }

    @Test
    public void test1SoKhongPhaiSoNguyen() {
        assertEquals(ArithmeticException.class, th.TH(10.5, 5));
    }

}