package chapter1;

public class Demo4 {

    public void judge(Season season){

        if (Season.SPRING == season){
            System.out.println("春暖花开，正好踏青");
        }else if(Season.SUMMER == season){
            System.out.println("夏日炎炎，适合游泳");
        }else if(Season.FALL == season){
            System.out.println("秋高气爽，进补及时");
        }else if(Season.WINTER == season){
            System.out.println("冬日雪飘，围炉赏雪");
        }else{
            System.out.println("季节为空");
        }
    }

    public static void main(String[] args) {
      Demo4 demo = new Demo4();
      demo.judge(Season.SPRING);
      demo.judge(null);
    }
}
