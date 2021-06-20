package chapter3;

public class Test {

    private int priInt;
    public String pubStr;

    public Test() {
    }

    public Test(String pubStr) {
        this.pubStr = pubStr;
    }

    public Test(int priInt, String pubStr) {
        this.priInt = priInt;
        this.pubStr = pubStr;
    }

    private void print(){
        System.out.println("Private Print");
    }
    public void print(String str){
        System.out.println("Public Print: " + str);
    }

    public void setPriInt(int priInt) {
        this.priInt = priInt;
    }

    public void setPubStr(String pubStr) {
        this.pubStr = pubStr;
    }

    public int getPriInt() {
        return priInt;
    }

    public String getPubStr() {
        return pubStr;
    }

}
