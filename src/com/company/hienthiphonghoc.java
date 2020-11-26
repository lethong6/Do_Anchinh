package com.company;

import java.util.ArrayList;

public class hienthiphonghoc{
    public void hien(phonghoc phonghoc) {

        System.out.printf("|%s|%s|%s|%s|%s|%s|\n", phonghoc.getMaphong(), phonghoc.getsiso(), phonghoc.getCsvc(), phonghoc.getVitri(),phonghoc.getSokw(),xulyphonghoc.tinhtien(phonghoc.getSokw()));

    }
    public void hienall(ArrayList<phonghoc> phonghocArrayList){
        System.out.printf("|%s|%s|%s|%s|%s|%s|\n","mã phòng","sĩ số","cơ cở vật chất","vị trí","số kwh","Tiền điện");
        for (phonghoc phonghoc:phonghocArrayList){
            hien(phonghoc);
        }
    }
}