/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mouse.mathutil.main;

import com.mouse.mathutil.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("1st upload from Local to GitHub!!!");
        //System.out.println("Welcome to GitHub");
        //Test trâu bò, tức là dùng mắt để nhìn đúng sai
        long expected = 120; // tui kì vọng hàm tính giai thừ trả 120
        long actual ;       // nếu tui đưa vào 5 
        int input = 5;      // đầu vào 5
        actual = MathUtility.getFactorial(input); // xem ói ra mấy
        System.out.println("5!: Expected: " + expected + "; Actual: " + actual);
        // mốt test case, 1 tính huống xài hàm, test hàm, dùng hàm
        
        //case 2: 0! thì sao ???
        expected= 1;
        input =0;
        actual = MathUtility.getFactorial(input); // xem ói ra mấy
        System.out.println("0!: Expected: " + expected + "; Actual: " + actual);
        
        //case 3: 2! thì sao ???
        expected= 2;
        input =2;
        actual = MathUtility.getFactorial(input); // xem ói ra mấy
        System.out.println("2!: Expected: " + expected + "; Actual: " + actual);
        
        //case : -1! thì saoo ???
        //expected =???; // ngoại lệ mà, ko so sánh dc, ko phải là value
        // mà nó chỉ xuất hiện thôi
        input=-1;
         actual = MathUtility.getFactorial(input);
        //ko in dc ngoại lệ chỉ coi nó xh hay không ???
        
        //chúng ta phải nhìn để kết luận, nhìn nhìu case
        // chơi trò thông minh hơn - TEST AUTOMATION DÙNG THƯ VIỆN
        
        
    }
    
}
