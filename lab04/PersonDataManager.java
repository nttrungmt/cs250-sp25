import java.util.ArrayList;
public class PersonDataManager {
    private ArrayList<Person> listPerson; //store the collection of Person objects

    public PersonDataManager() {
	this.listPerson = new ArrayList<>();
    }

    // This method displays all Person records on the Console
    public void show() {
        for(Person obj : listPerson)
             System.out.println(obj);
    }

    // This method adds a new Person object to the listPerson
    public void addPerson(int ssn, String name, String birthday) {
        listPerson.add(new Person(ssn, name, birthday));
    }

    /* This method loads Person objects from a text file into listPerson
     * @param filePath: The input file path
     * @return none
     */
    public void loadFromTextFile(String filePath) {
        //TODO: add code below
    }    
    
    /* This method writes the Person objects in listPerson to a text file
     * @param path: the output file path
     * @return none
     */
    public void saveToTextFile(String filePath) {
        //TODO: add code below
    }
}
