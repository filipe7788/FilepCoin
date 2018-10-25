package br.com.solutis.main;

import java.util.ArrayList;

public class Blockchain {

    ArrayList<block> blocos = new ArrayList<block>();

    public Blockchain(block block){
        blocos.add(block);
    }

    public block getBlockByIndex(int index){
       return blocos.get(index);
    }
}
