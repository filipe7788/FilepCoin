package br.com.solutis.main;

import br.com.solutis.util.*;

class miner{
    double nonce = 0;
    String hash;
    public String generateHash(block block) {
        do{
            this.nonce++;
            hash = Hash.getSha256(block.timestamp+this.nonce+block.index+block.data);
            System.out.println(hash);
        }while(hash.substring(0,2) != "000");

        block.setHash(hash);
        block.setNonce(this.nonce);

        return block.getHash();
    }
}