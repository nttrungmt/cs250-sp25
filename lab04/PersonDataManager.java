package lab04;

import java.util.*;
import java.io.*;
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

    /* This method loads Person objects from a binary file into listPerson
     * @param filePath: The input file path
     * @return none
     */
    public void loadFromBinaryFile(String filePath) {
        //TODO: add code below
    }    
    
    /* This method writes the Person objects in listPerson to a binary file
     * @param path: the output file path
     * @return none
     */
    public void saveToBinaryFile(String filePath) {
        //TODO: add code below
    }
    
     //the program entry point
     public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //use to read user's command
	PersonDataManager manager = new PersonDataManager(); //the data manager instance
	while(true) {
		System.out.print("PersonDataManager> ");
		String line = sc.nextLine(); //read the next command
		String[] cmds = line.split("\\s+");
		//TODO: continue with the code to handle the commands received from the users below
	}
     }
}
