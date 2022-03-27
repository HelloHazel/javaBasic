package chap14;

class Computer1{
    private String os;
    private int memory;

    // 오버로드 메소드1
    public void setComputer(String os){
        this.os = os;
        System.out.println("OS는 " + os + "로 변경했습니다.");
    }

    // 오버로드 메소드2
    public void setComputer(int memory){
        this.memory = memory;
        System.out.println("메모리는 " + memory + "GB입니다");
    }
    //오버로드 메소드3

    public void setComputer(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB로 변경했습니다.");
    }
    public void show(){
        System.out.println("PC의 OS" + os + "입니다.");
        System.out.println("PC의 메모리는 " + memory + "GB 입니다.");
    }
}
public class OverLoadMethod {
    public static void main(String[] args) {
        //객체 생성
        Computer1 com = new Computer1();

        //인수2개로 인수형태가 String형, .int형 순서의 setCoputer 메소드 호출
        com.setComputer("windows 11", 32);
        com.show();
        System.out.println("==============================");
    }
}
