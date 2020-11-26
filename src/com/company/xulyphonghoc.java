package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class xulyphonghoc {
    public static Scanner sc = new Scanner(System.in);

    public void sua(ArrayList<phonghoc> phonghocArrayList, String keyword) {
        boolean kt = false;

        for (int i = 0; i < phonghocArrayList.size(); i++) {
            if (keyword.equalsIgnoreCase(phonghocArrayList.get(i).getMaphong())) {
                kt = true;
                System.out.println(" Tìm thấy thông tin");
                System.out.println("Nhập mã phòng mới :");
                String maphong = sc.nextLine();
                System.out.println("Nhập sĩ số mới :");
                int siso = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cơ sở vật chất mới :");
                String cs = sc.nextLine();
                System.out.println("Nhập vị trí mới :");
                String vitri = sc.nextLine();
                System.out.println("nhập số kw mới");
                int sokw = Integer.parseInt(sc.nextLine());

                phonghocArrayList.set(i, new phonghoc(maphong, siso, cs, vitri,sokw));
                timkiem(phonghocArrayList, maphong);
            }

        }
        if (kt == false) System.out.println("Không tìm thấy thông tin !");

    }

    public void xoa(ArrayList<phonghoc> phonghocArrayList, String keyword) {
        boolean kt = false;
        for (int i = 0; i < phonghocArrayList.size(); i++) {
            if (keyword.equalsIgnoreCase(phonghocArrayList.get(i).getMaphong())) {
                kt = true;
                System.out.println("Xóa thành công phòng có mã :" + phonghocArrayList.get(i).getMaphong());
                phonghocArrayList.remove(i);
            }
        }
        if (kt == false) System.out.println("Không tìm thấy .");
    }

    public void timkiem(ArrayList<phonghoc> phonghocArrayList, String keyword) {
        boolean kt = false;
        for (phonghoc phonghoc : phonghocArrayList
        ) {
            if (keyword.equalsIgnoreCase(phonghoc.getMaphong())) {
                System.out.println("Tìm kiếm thành công .");
                hienthiphonghoc hienthiphonghoc = new hienthiphonghoc();
                hienthiphonghoc.hien(phonghoc);
                kt = true;
            }
        }
        if (kt == false) System.out.println("Không tìm thấy !");
    }

    public void sapxeptheosucchuatuLondenBe(ArrayList<phonghoc> phonghocArrayList) {
        Collections.sort(phonghocArrayList, new Comparator<phonghoc>() {
            @Override
            public int compare(phonghoc o1, phonghoc o2) {
                if (o1.getsiso() > o2.getsiso()) return -1;
                return 1;
            }
        });
    }

    public static int tinhtien(int sokw) {
        int tien = 0;


            return tien = sokw * 1560;


    }

}

