package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TienDien {
    private String maphong;
    private int Sokw;
    private int Sothang;

    public TienDien(String maphong, int sokw, int sothang) {
        this.maphong = maphong;
        Sokw = sokw;
        Sothang = sothang;
    }
    public TienDien(){}
    public  String toString(){
        return  maphong+"#"+Sokw+"#"+Sothang+"\n";
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public int getSokw() {
        return Sokw;
    }

    public void setSokw(int sokw) {
        Sokw = sokw;
    }

    public int getSothang() {
        return Sothang;
    }

    public void setSothang(int sothang) {
        Sothang = sothang;
    }
}
class nhapTiendien{
    Scanner  scanner=new Scanner(System.in);
    String maphong;
    int Sokw,Sothang;
    public String maphong() {
        do {
            System.out.println("Nhập mã phòng: ");
            maphong = scanner.nextLine();
        } while (maphong.equals(""));
        return maphong;
    }
    public int Sokw() {
        do {
            System.out.println("Nhập số kw điện phòng học tiêu thụ: ");
            Sokw = Integer.parseInt(scanner.nextLine());
        } while (Sokw <= 0);
        return Sokw;
    }
    public int sothang() {
        do {
            System.out.println("nhập số tháng dùng điện");
            Sothang = Integer.parseInt(scanner.nextLine());
        } while (Sothang <= 0);

        return Sothang;
    }
    public void nhaptiendien(ArrayList<TienDien> tienDienArrayList){
        while (true) {
            tienDienArrayList.add(new TienDien(maphong(),Sokw(),sothang()));
            System.out.println("Ban co muon nhap tiep khong C/K");
            String chon =scanner.nextLine();
            if(chon.equalsIgnoreCase("k")) break;
        }

    }
}
class xulytiendien{
    public static Scanner sc = new Scanner(System.in);

    public void sua(ArrayList<TienDien> tienDienArrayList) {
        boolean kt = false;
        String keyword = sc.nextLine();
        for (int i = 0; i < tienDienArrayList.size(); i++) {
            if (keyword.equalsIgnoreCase(tienDienArrayList.get(i).getMaphong())) {
                kt = true;
                System.out.println(" Tìm thấy thông tin");
                System.out.println("Nhập mã phòng mới :");
                String maphong = sc.nextLine();
                System.out.println("Nhập lại số kw  mới :");
                int sokw = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại số tháng  mới :");
                int sothang = Integer.parseInt(sc.nextLine());
                tienDienArrayList.set(i, new TienDien(maphong, sokw,sothang));
            }

        }
        if (kt == false) System.out.println("Không tìm thấy mã phòng muốn sửa !");

    }

    public void xoa(ArrayList<TienDien> tienDienArrayList ) {
        String keyword = sc.nextLine();
        boolean kt = false;
        for (int i = 0; i < tienDienArrayList.size(); i++) {
            if (keyword.equalsIgnoreCase(tienDienArrayList.get(i).getMaphong())) {
                kt = true;
                System.out.println("Xóa thành công phòng có mã :" + tienDienArrayList.get(i).getMaphong());
                tienDienArrayList.remove(i);
            }
        }
        if (kt == false) System.out.println("Không tìm thấy mã phòng cần xóa !");
    }

    public void timkiem(ArrayList<TienDien> tienDienArrayList) {
        String keyword = sc.nextLine();
        boolean kt = false;

        for (TienDien tienDien : tienDienArrayList
        ) {
            if (keyword.equalsIgnoreCase(tienDien.getMaphong())) {
                System.out.println("Tìm kiếm thành công .");
                hientiendien hientiendien= new hientiendien();
               hientiendien.hientiendien(tienDien);
               kt = true;
            }
        }
        if (kt == false) System.out.println("Không tìm thấy mã phòng cần tìm !");
    }

    public void sapxepsotientulondenbe(ArrayList<TienDien> tienDienArrayList) {
        Collections.sort(tienDienArrayList, new Comparator<TienDien>() {
            @Override
            public int compare(TienDien o1, TienDien o2) {
                if (o1.getSokw() > o2.getSokw()) return -1;
                return 1;
            }
        });
    }
public int tiendien(int Sokw,int Sothang){
        int t=0;
        return Sokw*Sothang*1500;
}


}
class hientiendien{
    public void hientiendien(TienDien tienDien){
        xulytiendien xuly=new xulytiendien();
        System.out.printf("|%20s|%20s|%20s|%20s|\n",tienDien.getMaphong(),tienDien.getSokw(),tienDien.getSothang()
                ,xuly.tiendien(tienDien.getSokw(),tienDien.getSothang()));
        System.out.println("-------------------------------------------------------------------------------------");
    }
    public void hienalltiendien(ArrayList<TienDien>tienDienArrayList){
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("|%20s|%20s|%20s|%20s|\n","Mã phòng","Số kw","Số tháng","Tiền điện");
        System.out.println("-------------------------------------------------------------------------------------");
        for (TienDien tienDien:tienDienArrayList
             ) {hientiendien(tienDien);
            
        }
    }
}
class xulyfiletiendien {

    static File file = new File("tiendien.txt");

    public void ghifile(ArrayList<TienDien> tienDienArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (TienDien tienDien : tienDienArrayList
        ) {
            fileWriter.write(tienDien.toString());
        }
        fileWriter.close();
    }

    public void docfile(ArrayList<TienDien> tienDienArrayList) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String maphong,int siso,String csvc,String vitri,int sokw
        String line ="";
        while ((line = bufferedReader.readLine()) != null) {
//            tienDienArrayList.add(new tiendien(line.split("#")[0],Integer.parseInt(line.split("#")[1]),
//                    line.split("#")[2],line.split("#")[3]));
//            //    line.split("#")[0],Integer.parseInt(line.split("#")[1],Integer.parseInt(line.split("#")[2])
            tienDienArrayList.add(new TienDien(line.split("#")[0],Integer.parseInt(line.split("#")[1]),Integer.parseInt(line.split("#")[2])));
        }

    }
}
