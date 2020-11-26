package com.company;



import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner=new Scanner(System.in);
    public static  void Menu(ArrayList<phonghoc> phonghocArrayList , phonghoc phonghoc, nhapphonghoc nhapphonghoc,xulyphonghoc xulyphonghoc,
                             xulyfile xulyfile,hienthiphonghoc hienthiphonghoc) throws IOException {
                System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                                  PHÒNG HỌC                                 ║");
                System.out.println("╠════════════════════════╦═══════════════════════════╦═══════════════════════╣");
                System.out.println("║    1.THÊM PHÒNG HỌC    ║      2.SỬA PHÒNG HỌC      ║       3.XÓA PHÒNG     ║");
                System.out.println("╠════════════════════════╬═══════════════════════════╬═══════════════════════╣");
                System.out.println("║4.SẮP XẾP THEO SỨC CHỨA ║     5.TÌM KIẾM PHÒNG      ║     6. HIỂN THỊ       ║");
                System.out.println("╚════════════════════════╩═══════════════════════════╩═══════════════════════╝");
        System.out.println("NHẬP THAO TÁC B CẦN THỰC HIỆN TẠI ĐÂY :\n" +
                "LƯU Ý KHI THỰC HIỆN XONG 1 CÔNG VIỆC CẦN THỰC HIỆN LẠI BƯỚC NHẬP THAO TÁC");
        Scanner scanner = new Scanner(System.in);
        int chon;
        while (true){
            chon = Integer.parseInt(scanner.nextLine());
            if(chon==0) break;
            switch (chon){
                case 1:
                    nhapphonghoc.nhapphong(phonghocArrayList);
                    xulyfile.ghifilephonghoc(phonghocArrayList);

                    break;
                case 2:
                    System.out.printf("Nhập mã phòng muốn sửa:");
                    String tk = scanner.nextLine();
                    xulyphonghoc.sua(phonghocArrayList,tk);
                    xulyfile.ghifilephonghoc(phonghocArrayList);
                    break;
                case 3:
                    System.out.printf("nhập mã phòng cần xóa : ");
                    String tkxoa = scanner.nextLine();
                    xulyphonghoc.xoa(phonghocArrayList,tkxoa);
                    xulyfile.ghifilephonghoc(phonghocArrayList);
                    break;
                case 4:

                    xulyphonghoc.sapxeptheosucchuatuLondenBe(phonghocArrayList);
                    hienthiphonghoc.hienall(phonghocArrayList);
                    break;
                case 5:
                    System.out.println("nhập mã phòng:");
                    String X= scanner.nextLine();
                    xulyphonghoc.timkiem(phonghocArrayList,X);

                    break;
                case 6:
                    hienthiphonghoc.hienall(phonghocArrayList);
                    break;
                default:
                    System.out.println("Nhập lại (1-6)");
                    break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        // write your code here
        ArrayList<phonghoc>phonghocArrayList = new ArrayList<>();
        xulyfile xulyfile = new xulyfile();
        xulyfile.docfilephonghoc(phonghocArrayList);
        phonghoc phonghoc = new phonghoc();
        nhapphonghoc nhapphonghoc = new nhapphonghoc();
        hienthiphonghoc hienthiphonghoc = new hienthiphonghoc();

        xulyphonghoc xulyphonghoc= new xulyphonghoc();


        Menu(phonghocArrayList,phonghoc,nhapphonghoc,xulyphonghoc,xulyfile,hienthiphonghoc);
    }
}

