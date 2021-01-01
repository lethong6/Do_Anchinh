package com.company;

import java.io.*;
import java.util.ArrayList;

public class xulyfile {

    static File file = new File("phonghoc.txt");

    public void ghifilephonghoc(ArrayList<phonghoc> phonghocArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (phonghoc phonghoc : phonghocArrayList
        ) {
            fileWriter.write(phonghoc.toString());
        }
        fileWriter.close();
    }

    public void docfilephonghoc(ArrayList<phonghoc> phonghocArrayList) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String maphong,int siso,String csvc,String vitri,int sokw
        String line ="";
        while ((line = bufferedReader.readLine()) != null) {
        phonghocArrayList.add(new phonghoc(line.split("#")[0],Integer.parseInt(line.split("#")[1]),
                   line.split("#")[2],line.split("#")[3]));
               //     Integer.parseInt(line.split("#")[4]),Integer.parseInt(line.split("#")[5])));
        }

    }
}