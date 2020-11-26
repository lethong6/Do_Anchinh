package com.company;

public class phonghoc {

    private String maphong;
    private int siso,sokw;
    private  String csvc;
    private String vitri;
    public phonghoc(String maphong,int siso,String csvc,String vitri,int sokw){
        this.maphong=maphong;
        this.siso=siso;
        this.csvc=csvc;
        this.vitri=vitri;
        this.sokw =sokw;
    }
    public phonghoc(){

    }

    @Override
    public  String toString(){
        return  maphong+"#"+siso+"#"+csvc+"#"+vitri+"#"+sokw+"\n";
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

    public int getSokw() {
        return sokw;
    }

    public void setSokw(int sokw) {
        this.sokw = sokw;
    }
}

