package BoksMaci;

public class MainBoks {
    public static void main(String[] args){
        Fighter f1 = new Fighter("A" , 10 , 120 , 100, 30);
        Fighter f2 = new Fighter("B" , 20 , 85 , 85, 40);

        Match match = new Match(f1, f2, 90, 95);
        match.run();
    }
}
