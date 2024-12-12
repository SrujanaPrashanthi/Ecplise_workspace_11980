
public class ArrayDemo2 {
public static void main(String[] args) {
String[] employees = new String[] {"Wills", "Smith", "Jones", "Alex", "Anna"};

System.out.println("Array traversal using for loop");
for(int i=0; i<employees.length; i++) {
System.out.println(employees[i]);
}

System.out.println("Array traversal using for each loop");
for(String employee : employees) {
System.out.println(employee);
}
}
}


