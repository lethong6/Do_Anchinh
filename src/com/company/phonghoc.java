package com.company;

public class phonghoc {

    private String maphong;
    private int siso;
    private  String csvc;
    private String vitri;
    public phonghoc(String maphong,int siso,String csvc,String vitri){
        this.maphong=maphong;
        this.siso=siso;
        this.csvc=csvc;
        this.vitri=vitri;

    }
    public phonghoc(){

    }

    @Override
    public  String toString(){
        return  maphong+"#"+siso+"#"+csvc+"#"+vitri+"\n";
    }
    public String getMaphong(){
        return maphong;
    }
    public void setMaphong(String s){
        this.maphong = maphong;
    }
    public int getsiso(){
        return siso;
    }
    public void setSiso(String s) {
        this.siso=siso;
    }
    public String getCsvc(){
        return csvc;
    }
    public void setCsvc(String s){
        this.csvc=csvc;
    }
    public String getVitri(){
        return vitri;
    }
    public void setVitri(String s){
        this.vitri=vitri;
    }


}

