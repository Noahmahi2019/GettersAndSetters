public class userObject{

    public static void main(String[] args) {
        User jayceDelgado = new User("jayce", "Delgado", "jayceDelgado1", "gfyhgyhg&&jj");
        User leonelBenton = new User("leonel", "Benton", "leonelBenton2", "buhsdsggy89");

        jayceDelgado.setPassWord("jayce2201");
        System.out.println(jayceDelgado.getPassword());
        leonelBenton.setPassWord("Benton12");
        System.out.println(leonelBenton.getPassword());
    }
    }
