import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>  {


    private String name;
    private ArrayList<T> League = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team ){
        if(this.League.contains(team)){
            System.out.println(team.getName()+" already in the " + getName()+ " league" );
            return false;
        }else{
            this.League.add(team);
            System.out.println(team.getName()+" has been added to the "+ getName()+" League");
            return true;
        }

    }

    public void showLeagueTables(){
        Collections.sort(League);

        for(T  t : League){
            System.out.println(t.getName() +" : "+ t.ranking());
        }

    }


}
