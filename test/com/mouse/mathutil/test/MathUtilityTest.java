/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mouse.mathutil.test;

import com.mouse.mathutil.MathUtility;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    
    @Test //biến hàm này thành main(), Shift-F6 để chạy
    // gọi hàm getF() như thường lệ, hay hơn là tự động so sánh giùm
    //Expected và actual coi có khớp nhau hơm >??? có thẩy màu xanh
    // ko khớp nhau thảy màu đỏ. Ta chỉ nhìn màu mà ko cần mất công so sánh nữa!!!
    public void testFactorialRighArgumentRunsWell(){
        long expected=120; // em mún bik 5! đúng là 120 ko ?
        int n = 5; // em đưa 5 đấy á
        long actual =MathUtility.getFactorial(n); //tính thiệt coi
        // và so sánh giùm tớ lun
        assertEquals(expected, actual); // tớ chỉ thích dèn báo  giáo thông thoi
        // tui sẽ test các tình huống còn lại
        assertEquals(720, MathUtility.getFactorial(6)); //6! có phải 720?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //0! là 1 tình huống cần test
        //1! là 1 tính huống khác cần test
        //6! là 1 tình huống khác cần test
        // Tình huống: Test Case, Nghê TESTER//QC là nghê nhĩ ra các test Case, sau đó thử nghiệm
        //assertEquals(0, MathUtility.getFactorial(0));
        // kì vọng sai, tính đúng -> 1 màu đỏ, ko khớp nhau
        //kì vọng đúng, tính sai -> 1 màu đỏ
        //Tao hi vọng 5! = 120, mày tính ra mấy, hàm mày tính ra mấy ?
        
    }
    
    
    //ta test xem phần ngoại lệ-exception
    //Exception là tính huống bất thường xảy ra trong app, trong code
    //khi app chạy. Nó ko phải là 1 value để có thể so sánh
    //Lỗi SQL trùng key, sai khóa ngoại, null trên cột yệu cầu khác null
    //đều là lỗi liên quan SQL nhưng ko thể nói thằng nào bằng thằng nào?
    //Đối với Exception, chỉ có thể đo nó = câu hỏi: MÀY CÓ XUẤT HIỆN KO?
    //ko dùng assertEquals() so-sánh-coi-nó-bằng-nhau-hay-ko
    //trong thiết kế của hàm getFactorial() thì nếu đưa vào n<0 hoặc n>2
    //thì hàm ném ra, sẽ new 1 ngoại lệ
    //cứ đưa n vi phạm, nhận về ngoại lệ
    //vậy nếu có ngoại lệ xảy ra khi n đưa vào cà chớn < 0 > 21
    //CÓ NGHĨA RẰNG HÀM CHẠY ĐÚNG, THẤY NGOẠI LỆ TA LẠI ĂN MỪNG
    //VÌ CHẠY NHƯ THIẾT KẾ -> ĐÚNG CÓ NGOẠI LỆ TA CẦN NÓ XUẤT HIỆN -> MÀU XANH
    //SẼ CÓ TEST CASE, TÌNH HUỐNG TEST: XEM NGOẠI LỆ CÓ XH KO, CÓ -> MÀU XANH
                                             //KO XH NHƯ DỰ KIẾN -> ĐỎ
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
       // MathUtility.getFactorial(-1);  //phai xuất hiện exception 
       // MathUtility.getFactorial(-10); //phai xuất hiện exception
       // MathUtility.getFactorial(21);  //phai xuất hiện exception 
       // MathUtility.getFactorial(40);  //phai xuất hiện exception 
            MathUtility.getFactorial(30);
        //nếu xh exception như kì vong, thì màu XANH
        //vì mau xanh here hàm ý rằng hàm chạy như thiết kế,
        //ném ngoại lệ khi đưa n cà chớn!!!
        //TA CẦN BẮT KĨ THUẬT ĐỂ BẮT NGOẠI LỆ, ĐÚNG NGOẠI LỆ CẦN BẮT XUẤT HIỆN
        //
        
        
    
    }
    
    
}

// Quy ước xanh: nếu tất cả các lời gọi hàm getFactorial()
// đều trả ra giá trị đúng như kì vọng, nói cách khác tất cả các 
// hàm assertEquals() đều so sánh khớp expected vs. actual 
// thi có màu xanh
// XANH : khi tất cả các tình huống test hàm đều chạy đúng
// dỏ: chỉ cần 1 trong đám này sai, coi như ĐỎ CHO TẤT CẢ
// Lí do phía sau: Đã test hàm thi hàm phải đúng cho các tình huống test đưa ra
// Đã TEst thì phải đúng cho các trường hợp dc đưa ra
//Ko chơi trò : hầu hết hàm đúng , lâu lâu mới sai...


