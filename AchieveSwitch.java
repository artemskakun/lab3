public class AchieveSwitch {
    public void ASwitch(Achieve achieve){
        switch (achieve){
            case SHIP:
                System.out.print(", постройки межпланетного корабля.");
                break;
            case STONE:
                System.out.print("не было находки лунного камня");
                break;
            case WEIGHTLESSNESS:
                System.out.print(", открытия невесомости");
                break;
    }
}
}
