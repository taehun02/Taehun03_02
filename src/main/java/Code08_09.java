 interface Rabbit07 {
     abstract void sleep();
 }
class HouseRabbit implements Rabbit07 {
    public void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit implements Rabbit07 {
    public void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_09 {
    public static void main(String[] args) {
        HouseRabbit houseRabbit = new HouseRabbit();
        MountainRabbit mountainRabbit = new MountainRabbit();

        houseRabbit.sleep();
        mountainRabbit.sleep();
    }
}