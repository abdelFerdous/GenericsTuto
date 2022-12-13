public class Main {
    public static void main(String[] args) {


        BaseballPlayer joe = new BaseballPlayer("joe");
        FootBallPlayer pepe = new FootBallPlayer("pepe");
        SoccerPlayer ronaldo = new SoccerPlayer("ronaldo");

        Team<FootBallPlayer> madridFb = new Team<>("madrid football");
        Team<FootBallPlayer> barcaFb = new Team<>("barcelona");
        Team<FootBallPlayer> AthleticFb = new Team<>("Athletic");
        Team<BaseballPlayer> chicago = new Team<>("chicagobulls");

        League<Team<FootBallPlayer>> Ligua = new League<>("la ligua");

        Ligua.addTeam(madridFb);
        // Ligua.addTeam(chicago); zbi  hhhhh
        //madrid.addPlayer(joe);
        madridFb.addPlayer(pepe);
        //madrid.addPlayer(ronaldo);
         Team<BaseballPlayer> madridBb =new Team<>("madrid baseball");
        madridBb.addPlayer(joe);

        Team<SoccerPlayer> madridsc = new Team<>("madrid soccer");
        madridsc.addPlayer(ronaldo);
         System.out.println(madridFb.numPlayer());





      /*  ArrayList items = new ArrayList();

        items.add(3);
        items.add(4);
        items.add(5);

        mult(items);*/

    }

    /*public static void mult(ArrayList items){

        for(Object i : items){
            System.out.println((Integer) i* (Integer) i );

        }
    }*/
}