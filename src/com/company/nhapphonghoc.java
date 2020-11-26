package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class nhapphonghoc {
    static Scanner scanner=new Scanner(System.in);
    public  void nhapphong(ArrayList<phonghoc> phonghocArrayList){
        System.out.print("nhập số lượng phòng : ");
        int t=scanner.nextInt();
        for (int i =0;i<t;i++) {
            System.out.printf("nhập phòng thứ %s: ",i+1);
            phonghocArrayList.add(new phonghoc(maphong(), siso(), csvc(), vitri(),sokw()));
        }
    }
    String maphong;
    int siso,sokw;
    String csvc;
    String vitri;
    public String maphong(){
        do {
            System.out.println("Nhập mã phòng: ");
            maphong = scanner.nextLine();
        }while (maphong.equals(""));
        return maphong;
    }
    public int siso(){
        do {
            System.out.println("Nhập sức chứa: ");
            siso = Integer.parseInt(scanner.nextLine());
        }while (siso<=0);
        return  siso;
    }
    public String csvc(){
        do {
            System.out.println("Nhập cơ sở vật chất: ");
            csvc = scanner.nextLine();
        }while (csvc.equals(""));
        return csvc;
    }
    public String vitri(){
        do {
            System.out.println("Nhập vị trí phòng: ");
            vitri = scanner.nextLine();
        }while (vitri.equals(""));
        return vitri;
    }
    public int sokw(){
        do {
            System.out.println("Nhập số kw điện phòng học tiêu thụ: ");
           sokw = Integer.parseInt(scanner.nextLine());
        }while (sokw<=0);
        return  sokw;
    }
}