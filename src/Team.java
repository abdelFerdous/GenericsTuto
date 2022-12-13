import java.util.ArrayList;

public class Team<T extends Player /* & Interface1 & interface2*/> implements Comparable<Team<T>> {

    private String name ;
    private int played =0;
    private int won=0;
    private int lost=0;
    private int tied=0;

    private ArrayList<T>  members= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println("player already exists");
            return false;
        }else{
            members.add(player);
            System.out.println("player" + player.getName()+"has been added");
            return true;
        }

    }

    public int numPlayer(){
        return this.members.size();
    }

    public void matchResults(Team<T> enemy , int ourScore , int enemyScore){
        if(ourScore < enemyScore){
            this.lost++;
        }else if(ourScore == enemyScore){
            this.tied++;
        }else{
            this.won++;
        }
        this.played++;

        if(enemy != null){
            enemy.matchResults(null , enemyScore , ourScore);
        }
    }
    public int ranking(){
        return (this.won * 2)+this.tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()> team.ranking()){
            return 1;
        }else if(this.ranking()< team.ranking()){
            return -1;
        }else{
            return 0;
        }
    }


}
