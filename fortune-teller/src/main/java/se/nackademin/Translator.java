/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author kinde
 */
public class Translator {
    private String [] adj= {"stor","liten","stark","svag","mjuk","hård","snabb","vacker","ljus","mörk"};
    private String [] ver= {"springa","ljuga","flyga","se","vara","äta","mäta","gå","röra","resa"};
    private String [] sub= {"en lönehöjning","en lönesänkning","en fotboja","en katt",
        "en hund","ett hus","ett barn","ett elstängsel","en dator","ett golv"};


    public String Verb( int s){
        return ver[s];
    }
    
    public String Adjektiv( int s){
        return adj[s];
    }
    
    public String Substantiv( int s){
        return sub[s];
    }
}
