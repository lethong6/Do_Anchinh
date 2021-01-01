package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class nhapphonghoc {
    static Scanner scanner = new Scanner(System.in);


    String maphong;
    int siso;
    String csvc;
    String vitri;

    public String maphong() {
        do {
            System.out.println("Nhập mã phòng: ");
            maphong = scanner.nextLine();
        } while (maphong.equals(""));
        return maphong;
    }

    public int siso() {
        do {
            System.out.println("Nhập sức chứa: ");
            siso = Integer.parseInt(scanner.nextLine());
        } while (siso <= 0);
        return siso;
    }

    public String csvc() {
        do {
            System.out.println("Nhập cơ sở vật chất: ");
            csvc = scanner.nextLine();
        } while (csvc.equals(""));
        return csvc;
    }

    public String vitri() {
        do {
            System.out.println("Nhập vị trí phòng: ");
            vitri = scanner.nextLine();
        } while (vitri.equals(""));
        return vitri;
    }


    public void nhapphong(ArrayList<phonghoc> phonghocArrayList) {

        while (true) {
            String maphong = maphong();
            int siso = siso();
            String csvc = csvc();
            String vitri = vitri();
            phonghocArrayList.add(new phonghoc(maphong, siso, csvc, vitri));
            System.out.println("Ban co muon nhap tiep khong C/K");
            String chon =scanner.nextLine();
            if(chon.equalsIgnoreCase("k")) break;
        }
    }
}