package com.company;

import java.util.ArrayList;

public class hienthiphonghoc{
    public void hien(phonghoc phonghoc) {

        System.out.printf("|%10s|%10s|%20s|%10s|\n", phonghoc.getMaphong(), phonghoc.getsiso(), phonghoc.getCsvc(),
                phonghoc.getVitri());
        System.out.println("-------------------------------------------------------");
    }
    public void hienall(ArrayList<phonghoc> phonghocArrayList){
        System.out.println("-------------------------------------------------------");
        System.out.printf("|%10s|%10s|%20s|%10s|\n","mã phòng","sức chứa","cơ cở vật chất","vị trí");
        System.out.println("-------------------------------------------------------");
        for (phonghoc phonghoc:phonghocArrayList){
            hien(phonghoc);
        }
    }
}
