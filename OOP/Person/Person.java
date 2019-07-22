/**
 * Created by UGURINAL
 * 7/23/2019
 * 12:55 AM
 **/


public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }
        this.age = age;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFullName(){
        if(this.firstName.equals("") && this.lastName.equals("")){      //  if(this.firstName.isEmpty()){};
            return "Unnamed person";
        }else if(this.firstName.equals("")){
            return this.lastName;
        }else if(this.lastName.equals("")){
            return this.firstName;
        }else{
            return this.firstName+" "+this.lastName;
        }

    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){

        return (this.age > 12 && this.age <20);

    }


}
