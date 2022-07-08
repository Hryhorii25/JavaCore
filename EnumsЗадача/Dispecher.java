package EnumsЗадача;


import java.util.Scanner;

public class Dispecher {

    enum  Level{


        JUNIOR(0,33,Skils.HTML,Skils.JAVA_SCRIPT,Skils.CSS){
        @Override
        public void showSkills() {
            System.out.println(this);
        for (Skils skils:getSkils()){
            System.out.println(skils);
        }

        }
    },




        MIDDLE(34,66,Skils.ANDROID,Skils.JAVA,Skils.XML){
        @Override
        public void showSkills() {
            System.out.println(this);
            for (Skils skils:getSkils()){
                System.out.println(skils);
            }
            }
            },


        SENIOR(67,100,Skils.IOS,Skils.MAVEL,Skils.RETROFIT){
            @Override
            public void showSkills() {
                System.out.println(this);
                for (Skils skils:getSkils()){
                    System.out.println(skils);
                }
            }
        };



        int min,max;
        private Skils[] skils;

        Level(int min,int max,Skils...skils){
this.min =min;
this.max = max;
this.skils=skils;
        }

        public int getMin() { return min; }
        public int getMax() {
            return max;
        }
        public Skils[] getSkils() {
            return skils;
        }
        public abstract  void showSkills();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter data:");
            try {
                //int number = scanner.nextLine();
                Integer integer = Integer.valueOf(scanner.nextInt());
                if (integer >= 0 && integer <= 100) {
                    for (Level level : Level.values()) {
                        if (level.getMin() <= integer && level.getMax() >= integer) {
                            level.showSkills();
                            break;
                        }
                    }
                    break;

                } else {
                    System.out.println("data npt in range");
                }
            } catch (NumberFormatException e ) {
                System.out.println("This is not a number");
            } ;
        }
    }
}