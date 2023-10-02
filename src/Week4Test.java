import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Week4Test {
    // Test theo dong dieu kien
    @Test
    public void C1(){
        int a = 125;
        String expected = "Độ tuổi không hợp lệ. Xin nhập lại";
        String actual = Week4.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void C2(){
        int a = 3;
        String expected = "Miễn Phí";
        String actual = Week4.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void C3(){
        int a = 16;
        String expected = "30000 đồng";
        String actual = Week4.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void C4(){
        int a = 28;
        String expected = "50000 đồng";
        String actual = Week4.GiaVe(a);
        assertEquals(expected, actual);
    }
    @Test
    public void C5() {
        int a = 70;
        String expected = "30000 đồng";
        String actual = Week4.GiaVe(a);
        assertEquals(expected, actual);
    }
}