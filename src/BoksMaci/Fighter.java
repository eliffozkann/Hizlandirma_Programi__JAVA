package BoksMaci;

public class Fighter {
    String name;
    int damamge; //hasar
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damamge = damage;
        this.health = health;
        this.weight = weight;

        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe){ //foe = rakip, karşıt

        System.out.println(this.name + " => " + foe.name + " " + this.damamge + " hasar vurdu.");
        if (foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı!");
            return foe.health;
        }
        if(foe.health - this.damamge < 0){
            return  0;
        }
        return foe.health - this.damamge;
    }

    boolean isDodge(){
       double randomNumber = Math.random() * 100;
       return randomNumber <= this.dodge;
    }
}
