public class Test {
    Student student = new Student("Danil", "Khomichenko");
    public boolean test = true;
    boolean testPrintStudent10Times(){
        String name = "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n" +
                "Danil Khomichenko \n";
        String nameFromMethod = student.printStudent10Times();
        if (!name.equals(nameFromMethod))
            test = false;
        return test;
    }
    public static void main(String[] args) {
    }
}
