package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int s,sum; 
        s = name.length() - name.replaceAll(" ", "").length();
        sum = age;
        while( sum > 10){ sum = sum -7;}
        return sum;
    }

    public int calculateB() {
       int s, sum ; 
        s =  location.length();
        sum = s + income;
        while( sum > 10){ sum = sum -7;}
        return sum;
    }

    public int calculateC() {
        int s,sum; 
        s = calculateA();
        sum = s + calculateB(); 
        sum = sum - height;
        while ( sum <0) {sum = sum +10;}
        return sum;
    }

    public int calculateD() {
        int sum ; 
        sum = calculateA();
        
        
        if ( sum < 5){sum = sum + calculateB();}
        else {sum = sum + calculateC();}
        
        sum = sum - income;
        
        while ( sum <0) {sum = sum +10;}
        return sum;    
    }

    public int calculateE() {
        int sum ; 
       
       sum = age;
       sum = sum *income;
       sum = sum *income;
       sum = sum *height;
       sum = (int)Math.sqrt(sum);
        while ( sum>10) {sum = sum/2;}
        return sum;  
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
