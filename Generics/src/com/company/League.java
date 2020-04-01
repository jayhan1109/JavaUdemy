package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class League<T extends Team>{
    private String name;
    private List<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println(team.getName()+" is already on this league");
            return false;
        }else{
            league.add(team);
            System.out.println(team.getName()+" added to this league "+this.name);
            return true;
        }
    }

    public void print(){
        Collections.sort(league);
        for(T team:league){
            System.out.println(team.getName()+": "+team.ranking());
        }
    }

}

