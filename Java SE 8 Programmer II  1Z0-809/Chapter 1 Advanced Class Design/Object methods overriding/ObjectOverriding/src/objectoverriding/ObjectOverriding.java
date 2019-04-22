/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoverriding;

import org.apache.commons.lang3.builder.*;
/**
 *
 * @author gab12
 */
public class ObjectOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hippo hippoOne = new Hippo(1001, 50, "Hipidihopodo", 120, "Male");
        Hippo hippoOtherOne = new Hippo(1001, 51, "Hipidihopodo", 120, "Male");
        Hippo hippoTwo = new Hippo(1002, 52, "Hipidihopodo", 120, "Male");
        Hippo hippoThree = new Hippo(1003,53,  "Hipidihopodo", 120, "Male");
        
        System.out.println("toString(): "+hippoOne);
        System.out.println("equals(): "+hippoOne.equals(hippoOtherOne));
        System.out.println("equals(): "+hippoOne.equals(hippoTwo));
        System.out.println("hashCode(): "+hippoOne.hashCode());
    }
}

class Hippo {

    private int id;
    private Integer zooId;
    private String name;
    private double weight;
    private String gender;

    public Hippo(int id, int zooId, String name, double weight, String gender) {
        this.id = id;
        this.zooId = zooId;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
    
    @Override
    public int hashCode(){
        return id + 7 * zooId.hashCode();
    }
    
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Hippo)) return false;
        Hippo otherHippo = (Hippo)obj;
        return otherHippo.id == this.id;
    }
    
    /* Overriding equals() with Apache Common lang
       1. Compares all instance variables
    
        public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    ---------------------------------------
        2. Compares some instance variables
        public boolean equals(Object obj) {
            if ( !(obj instanceof LionEqualsBuilder)) return false;
            Lion other = (Lion) obj;
            return new EqualsBuilder().appendSuper(super.equals(obj))
                .append(idNumber, other.idNumber)
                .append(name, other.name)
                .isEquals();
    
    */
}