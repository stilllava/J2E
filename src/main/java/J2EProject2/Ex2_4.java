package J2EProject2;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class Ex2_4 {
    public static void main(String[] args) throws Exception {
        Object[][] data = {
                {"Mark", "Andrews", "Red", new Integer(2), Boolean.TRUE},
                {"Tom", "Ball", "Blue", new Integer(99), Boolean.FALSE},
                {"Alan", "Chung", "Green", new Integer(838), Boolean.FALSE},
                {"Jeff", "Dinkins", "Turquois", new Integer(8), Boolean.TRUE},
                {"Amy", "Fowler", "Yellow", new Integer(3), Boolean.FALSE},
                {"Brian", "Gerhold", "Green", new Integer(0), Boolean.FALSE},
                {"James", "Gosling", "Pink", new Integer(21), Boolean.FALSE},
                {"David", "Karlton", "Red", new Integer(1), Boolean.FALSE},
                {"Dave", "Kloba", "Yellow", new Integer(14), Boolean.FALSE},
                {"Peter", "Korn", "Purple", new Integer(12), Boolean.FALSE},
                {"Phil", "Milne", "Purple", new Integer(3), Boolean.FALSE},
                {"Dave", "Moore", "Green", new Integer(88), Boolean.FALSE},
                {"Hans", "Muller", "Maroon", new Integer(5), Boolean.FALSE},
                {"Rick", "Levenson", "Blue", new Integer(2), Boolean.FALSE},
                {"Tim", "Prinzing", "Blue", new Integer(22), Boolean.FALSE},
                {"Chester", "Rose", "Black", new Integer(0), Boolean.FALSE},
                {"Ray", "Ryan", "Gray", new Integer(77), Boolean.FALSE},
                {"Georges", "Saab", "Red", new Integer(4), Boolean.FALSE},
                {"Willie", "Walker", "Phthalo Blue", new Integer(4), Boolean.FALSE},
                {"Kathy", "Walrath", "Blue", new Integer(8), Boolean.FALSE},
                {"Arnaud", "Weber", "Green", new Integer(44), Boolean.FALSE}
        };
        List<PersonInfo> personList = new ArrayList<>();
        for (Object[] a : data) {
            String firstName = (String) a[0];
            String lastName = (String) a[1];
            String color = (String) a[2];
            int number = ((Integer) a[3]).intValue();
            boolean isVegetarian = (Boolean) a[4];
            PersonInfo person = new PersonInfo(firstName, lastName, color, number, isVegetarian);
            personList.add(person);
        }
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();
        Element root = doc.createElement("people");
        doc.appendChild(root);
        for (PersonInfo person : personList) {
            Element personElement = doc.createElement("person");
            root.appendChild(personElement);
            personElement.setAttribute("firstname", person.getFirstName());
            personElement.setAttribute("lastname", person.getLastName());
            personElement.setAttribute("color", person.getColor());
            personElement.setAttribute("number", String.valueOf(person.getNumber()));
            personElement.setAttribute("vegetarian", String.valueOf(person.isVegetarian()));
        }
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(new File("people.xml")));
        transformer.transform(source, result);
        System.out.println("XML文件已经生成：people.xml");
        for(PersonInfo t:personList)
            System.out.println(t.getFirstName()+","+t.getLastName()+","+t.getColor()+","+t.getNumber()+","+t.isVegetarian());
    }
}
class PersonInfo {
    private String firstName;
    private String lastName;
    private String color;
    private int number;
    private boolean isVegetarian;
    public PersonInfo() {
    }
    public PersonInfo(String firstName, String lastName, String color, int number, boolean isVegetarian) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.color = color;
        this.number = number;
        this.isVegetarian = isVegetarian;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}
