package com.company;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void menuChinh(nhapTiendien nhapTiendien,xulyfiletiendien xulyfiletiendien,ArrayList<TienDien>
            tienDienArrayList,hientiendien hientiendien,xulytiendien xulytiendien,nhapphonghoc nhapphonghoc, xulyfile xulyfile, ArrayList<phonghoc>
            phonghocArrayList,xulyphonghoc xulyphonghoc,hienthiphonghoc hienthiphonghoc) throws IOException {
        while (true) {
            System.out.println("                   CHÀO MỪNG ĐẾN VỚI ĐỒ ÁN CỦA LÊ MINH THÔNG");
            System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                     MANU                                   ║");
            System.out.println("╠══════════════════════════════════════╦═════════════════════════════════════╣");
            System.out.println("║             I  PHÒNG HỌC             ║          II   TIỀN ĐIỆN             ║");
            System.out.println("╚══════════════════════════════════════╩═════════════════════════════════════╝");
            int chon = Integer.parseInt(scanner.nextLine());
            if (chon == 0) break;
            switch (chon) {
                case 1:
                    menuPhongHoc( nhapphonghoc,  xulyfile,
                            phonghocArrayList, xulyphonghoc, hienthiphonghoc);
                    break;
                case 2:
                    menuTienDien( nhapTiendien, xulyfiletiendien,
                            tienDienArrayList, hientiendien, xulytiendien);
                    break;
                default:
                    break;
            }
        }
    }
    public static void menuTienDien(nhapTiendien nhapTiendien,xulyfiletiendien xulyfiletiendien,ArrayList<TienDien>
            tienDienArrayList,hientiendien hientiendien,xulytiendien xulytiendien) throws IOException {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                              II   TIỀN ĐIỆN                                ║");
        System.out.println("╠════════════════════════╦═══════════════════════════╦═══════════════════════╣");
        System.out.println("║    1.THÊM PHÒNG HỌC    ║      2.SỬA PHÒNG HỌC      ║       3.XÓA PHÒNG     ║");
        System.out.println("╠════════════════════════╬═══════════════════════════╬═══════════════════════╣");
        System.out.println("║ 4.SẮP XẾP THEO SỨC CHỨA║     5.TÌM KIẾM PHÒNG      ║     6. HIỂN THỊ       ║");
        System.out.println("╚════════════════════════╩═══════════════════════════╩═══════════════════════╝");
        System.out.println("NHẬP THAO TÁC BẠN CẦN THỰC HIỆN TẠI ĐÂY :\n" +
                "LƯU Ý KHI THỰC HIỆN XONG 1 CÔNG VIỆC CẦN THỰC HIỆN LẠI BƯỚC NHẬP THAO TÁC");
        while (true) {
//            System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
//            System.out.println("║                              II   TIỀN ĐIỆN                                ║");
//            System.out.println("╠════════════════════════╦═══════════════════════════╦═══════════════════════╣");
//            System.out.println("║    7.THÊM PHÒNG HỌC    ║      8.SỬA PHÒNG HỌC      ║       9.XÓA PHÒNG     ║");
//            System.out.println("╠════════════════════════╬═══════════════════════════╬═══════════════════════╣");
//            System.out.println("║10.SẮP XẾP THEO SỨC CHỨA║    11.TÌM KIẾM PHÒNG      ║    12. HIỂN THỊ       ║");
//            System.out.println("╚════════════════════════╩═══════════════════════════╩═══════════════════════╝");
//            System.out.println("NHẬP THAO TÁC BẠN CẦN THỰC HIỆN TẠI ĐÂY :\n" +
//                    "LƯU Ý KHI THỰC HIỆN XONG 1 CÔNG VIỆC CẦN THỰC HIỆN LẠI BƯỚC NHẬP THAO TÁC");
            int chon = Integer.parseInt(scanner.nextLine());
            if (chon == 0) break;
            switch (chon) {
                case 1:
//                    System.out.println("Nhập mã phòng: ");
                    nhapTiendien.nhaptiendien(tienDienArrayList);
                    xulyfiletiendien.ghifile(tienDienArrayList);

                    break;
                case 2:
                    System.out.printf("Nhập mã phòng muốn sửa:");
                    xulytiendien.sua(tienDienArrayList);
                    xulyfiletiendien.ghifile(tienDienArrayList);
                    break;
                case 3:
                    System.out.printf("nhập mã phòng cần xóa : ");


                    xulytiendien.xoa(tienDienArrayList);
                    xulyfiletiendien.ghifile(tienDienArrayList);
                    break;
                case 4:

                    xulytiendien.sapxepsotientulondenbe(tienDienArrayList);
                    hientiendien.hienalltiendien(tienDienArrayList);
                    break;
                case 5:
                    System.out.printf("nhập mã phòng cần tìm:");


                    xulytiendien.timkiem(tienDienArrayList);
                    break;
                case 6:
                    hientiendien.hienalltiendien(tienDienArrayList);
                    break;
                default:
                    break;

            }
        }
    }
    public static void menuPhongHoc(nhapphonghoc nhapphonghoc, xulyfile xulyfile, ArrayList<phonghoc>
            phonghocArrayList,xulyphonghoc xulyphonghoc,hienthiphonghoc hienthiphonghoc) throws IOException {
        int chon;
        System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                               I   PHÒNG HỌC                                ║");
            System.out.println("╠════════════════════════╦═══════════════════════════╦═══════════════════════╣");
            System.out.println("║    1.THÊM PHÒNG HỌC    ║      2.SỬA PHÒNG HỌC      ║       3.XÓA PHÒNG     ║");
            System.out.println("╠════════════════════════╬═══════════════════════════╬═══════════════════════╣");
            System.out.println("║4.SẮP XẾP THEO SỨC CHỨA ║     5.TÌM KIẾM PHÒNG      ║     6. HIỂN THỊ       ║");
            System.out.println("╚════════════════════════╩═══════════════════════════╩═══════════════════════╝");
            System.out.println("NHẬP THAO TÁC BẠN CẦN THỰC HIỆN TẠI ĐÂY :\n" +
                    "LƯU Ý KHI THỰC HIỆN XONG 1 CÔNG VIỆC CẦN THỰC HIỆN LẠI BƯỚC NHẬP THAO TÁC");
        while (true) {
//            System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
//            System.out.println("║                               I   PHÒNG HỌC                                ║");
//            System.out.println("╠════════════════════════╦═══════════════════════════╦═══════════════════════╣");
//            System.out.println("║    1.THÊM PHÒNG HỌC    ║      2.SỬA PHÒNG HỌC      ║       3.XÓA PHÒNG     ║");
//            System.out.println("╠════════════════════════╬═══════════════════════════╬═══════════════════════╣");
//            System.out.println("║4.SẮP XẾP THEO SỨC CHỨA ║     5.TÌM KIẾM PHÒNG      ║     6. HIỂN THỊ       ║");
//            System.out.println("╚════════════════════════╩═══════════════════════════╩═══════════════════════╝");
//            System.out.println("NHẬP THAO TÁC BẠN CẦN THỰC HIỆN TẠI ĐÂY :\n" +
//                    "LƯU Ý KHI THỰC HIỆN XONG 1 CÔNG VIỆC CẦN THỰC HIỆN LẠI BƯỚC NHẬP THAO TÁC");
            chon = Integer.parseInt(scanner.nextLine());
            if (chon == 0) break;
            switch (chon) {
                case 1:
                    nhapphonghoc.nhapphong(phonghocArrayList);
                    xulyfile.ghifilephonghoc(phonghocArrayList);

                    break;
                case 2:
                    System.out.printf("Nhập mã phòng muốn sửa:");
                    String tk = scanner.nextLine();
                    xulyphonghoc.sua(phonghocArrayList, tk);
                    xulyfile.ghifilephonghoc(phonghocArrayList);
                    break;
                case 3:
                    System.out.printf("nhập mã phòng cần xóa : ");
                    String tkxoa = scanner.nextLine();
                    xulyphonghoc.xoa(phonghocArrayList, tkxoa);
                    xulyfile.ghifilephonghoc(phonghocArrayList);
                    break;
                case 4:

                    xulyphonghoc.sapxeptheosucchuatuLondenBe(phonghocArrayList);
                    hienthiphonghoc.hienall(phonghocArrayList);
                    break;
                case 5:
                    System.out.printf("nhập mã phòng cần tìm:");
                    String X = scanner.nextLine();
                    xulyphonghoc.timkiem(phonghocArrayList, X);

                    break;
                case 6:
                    hienthiphonghoc.hienall(phonghocArrayList);
                    break;
                default:
                    break;
            }
        }

    }
        public static void main (String[]args) throws IOException {

            // write your code here
            ArrayList<phonghoc> phonghocArrayList = new ArrayList<>();
            xulyfile xulyfile = new xulyfile();
            xulyfile.docfilephonghoc(phonghocArrayList);


            nhapphonghoc nhapphonghoc = new nhapphonghoc();
            hienthiphonghoc hienthiphonghoc = new hienthiphonghoc();

            xulyphonghoc xulyphonghoc = new xulyphonghoc();


//            Menu(phonghocArrayList, phonghoc, nhapphonghoc, xulyphonghoc, xulyfile, hienthiphonghoc);

            ArrayList<TienDien> tienDiens=new ArrayList<>();
            xulyfiletiendien xulyfiletiendien=new xulyfiletiendien();
            xulyfiletiendien.docfile(tienDiens);
            nhapTiendien nhapTiendien=new nhapTiendien();
            hientiendien hientiendien=new hientiendien();
            xulytiendien xulytiendien=new xulytiendien();
            menuChinh(nhapTiendien,xulyfiletiendien,tienDiens,hientiendien,xulytiendien,nhapphonghoc,xulyfile,phonghocArrayList,xulyphonghoc,hienthiphonghoc);

        }
    }


