import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person returnObject = this.persons.get(0);
        
        for (Person prs : this.persons) {
            if (returnObject.getHeight() > prs.getHeight()) {
                returnObject = prs;
            }
        }
        
        return returnObject;
    }
    
    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person returnObject = this.persons.get(0);
        
        for (Person prs : this.persons) {
            if (returnObject.getHeight() > prs.getHeight()) {
                returnObject = prs;
            }
        }
        
        this.persons.remove(returnObject);
        
        return returnObject;
    }
}
