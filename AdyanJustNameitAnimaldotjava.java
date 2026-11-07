class Animals{
    void eating(){
        System.out.println("Eating...Animals...eatingmethoding");
    }
}
class Lion extends Animals{
    void roar(){
        System.out.println("Roaring...Lion...roarmethoding");
    }
}

class BabyLion extends Lion{
    void weep(){
        System.out.println("Weeping...BabyLion...weepmethoding");
    }
}

class AdyanJustNameitAnimaldotjava {
    public static void main(String[] args) {
        BabyLion obj=new BabyLion();
        obj.eating();
        obj.roar();
        obj.weep();
    }
}