public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
         //   int a=78; //already initialized outside  block in same method, hence u cannot initialize again but u can change the value
            //to create new one we add int a , other to change just a
            a=100; //reassign the origin ref var to some other value
            System.out.println(a);
            int c = 99;
            //values initialised in this block,will remain in block
        }
        System.out.println(a); //will print the inital one , not the inside the box one
     //   System.out.println(c); //cannot use outside the box

    }
    static void random(int marks){
        int num =67;
        System.out.println(num);
        System.out.println(marks);
    }
}
