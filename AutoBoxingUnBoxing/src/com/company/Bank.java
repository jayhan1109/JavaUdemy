package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch(Branch branch){
        branches.add(branch);
    }

    public void addBranch(String name){
        branches.add(new Branch(name));
    }

}
