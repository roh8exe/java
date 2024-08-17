public class _3_BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int precession =3;
        System.out.println(sqrt(n,precession));
    }
    static double sqrt(int n,int precession){
        int start =0;
        int end =n;
        double root = 0.0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end =mid-1;
            }else{
                start = mid+1;
            }
        }
        double increment =0.1;
        for(int i=0;i<precession;i++){
            while(root*root<=n){
                root+= increment;
            }
            root-= increment;
            increment /=10;
        }
        return root;
    }
}
