public class demoConstructor {

        int x;

        public demoConstructor(){
            x=5;
        }

        public static void main(String[] args){
            demoConstructor myObj = new demoConstructor();
            System.out.println(myObj.x);
        }

}
