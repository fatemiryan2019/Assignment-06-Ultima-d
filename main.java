public class Main {
    public static final int worldTime = 0;
    public static final int year = 525600;
    public static final int day = 1440;
    public static final int hour = 60;
    public static int year(){
        return 1+worldTime/year;
    }
    public static int day(){
        return 1+worldTime%year/day;
    }
    public static int hour(){
        return worldTime%year%day/hour;
    }
    public static int min(){
        return worldTime%year%day%hour;
    }
    public static int tram(){
        return (1+worldTime/day)%9;
    }
    public static int felu(){
        return (1+worldTime/day)%14;
    }
    public static void main(String[] args){
        System.out.printf("worldTime = "+worldTime+"\nIt is "+hour()+":%02d on day "+day()+" of the year "+year()
                +".\nTrammel is in day "+tram()+" of its 9 day phase.\nFelucca is in day "+felu()
                +" of its 14 day phase.\n\n\n",min());
        System.out.printf("WorldTime = 168260271\nIt is 9:51 on day 48 of the year 321\nTrammel is in day 1 of its 9 day phase.\nFelucca is in day 4 of its 14 day phase.\n");
        System.out.printf("WorldTime = 27364375\nIt is 0:55 on day 24 of the year 53\nTrammel is in day 5 of its 9 day phase.\nFelucca is in day 6 of its 14 day phase.\n");
        System.out.printf("WorldTime = 67294091\nIt is 0:11 on day 13 of the year 129\nTrammel is in day 5 of its 9 day phase.\nFelucca is in day 1 of its 14 day phase.\n");
    }

}
