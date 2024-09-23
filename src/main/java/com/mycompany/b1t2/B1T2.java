/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b1t2;

/**
 *
 * @author MINH PHUC
 */
import java.util.Scanner;

public class B1T2 {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhận input từ người dùng
        Scanner scanner = new Scanner(System.in);
        
        // Yêu cầu người dùng nhập tên
        System.out.print("Nhập tên của bạn: ");
        String Phúc = scanner.nextLine();
        
        // In ra màn hình lời chào
        System.out.println("Hello " + Phúc);
        
        // Đóng scanner
        scanner.close();
    }
}

