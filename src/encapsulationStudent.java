public class encapsulationStudent {
    private int marks;

    public void setMarks(int m) {
        marks = m;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String args[]){
        encapsulationStudent s = new encapsulationStudent();
        s.setMarks(85);
        System.out.println(s.getMarks());
    }

}



