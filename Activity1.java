/**
 * @author Muhammad Fahd, Syed Ali
 * @version 1.0
 * Activity1
 * Term : Spring 2023
 * Year : 2023
 */

interface Enclosures{                       
    final int FISH_PER_ENCLOSURE = 12;      
    final int TIGERS_PER_ENCLOSURE = 2;
    final int DEFAULT_PER_ENCLOSURE = 1;
    /**
     * Interface with constant values,Group03,Muhammad Fahd, Syed Ali, "Activity01",Spring, 2022    
     */
}

class Animal implements Enclosures{      
    //
    public String type;
    public int occupancy;
    /**
     * @param type, type of animal
     * @param occupancy, enclosure of animal
     */

    public Animal(){                                     //Default constructor
        this.type = "";
        this.occupancy = DEFAULT_PER_ENCLOSURE;
    }
    public Animal(String type,int occupancy){     
        this.type = type;
        this.occupancy = occupancy;
    }
    @Override
    public String toString(){
        return "Number of "+type+"'s per enclosure is "+occupancy;
    }
}
class Fish extends Animal{                  //Fish inheritence of Animal class(used to create fish ojects),Group03,Muhammad Fahd, Syed Ali, "Activity01",Spring, 2022
    public String waterType;
    public static int fishCount;
    /**
     * 
     * @param type, type of animal
     * @param waterString, type of water animal swims in (fresh,salt)
     */

    public Fish(String type,String waterString){          
        super(type,FISH_PER_ENCLOSURE);
        this.waterType = waterString;
        fishCount++;                                      //Count of number of Fish objects
    }
    @Override
    public String toString(){
        return super.toString()+", swims in "+waterType;            //Uses animal superclass to return super toString
    }
}

class Tiger extends Animal{                 //Tiger inheritence of Animal class(used to create tiger objects),Group03,Muhammad Fahd, Syed Ali, "Activity01",Spring, 2022
    public String habitat;
    public static int tigerCount;
    /**
     * 
     * @param type, type of animal
     * @param habitat, habitat of animal
     */

    public Tiger(String type,String habitat){
        super(type,TIGERS_PER_ENCLOSURE);
        this.habitat = habitat;
        tigerCount++;                                       //Count for number of Tiger objects
    }       
    @Override
    public String toString(){
        return super.toString()+", roams in "+habitat;      //uses animal class to return super toString
    }
}