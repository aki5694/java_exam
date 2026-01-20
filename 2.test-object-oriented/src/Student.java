public class Student {

    int energy = 50;

    void sleep(){
        energy = energy + 50;
        System.out.println("エネルギーが" + energy + "になりました。");
        if (energy<=100){
            System.out.println("フルパワー！");
        }
    }

    void study(){
        energy = energy - 30;
        System.out.println("勉強しました。エネルギーが" + energy + "になりました。");
        if(energy<=0){
            System.out.println("寝てください");
        }
    }

}
