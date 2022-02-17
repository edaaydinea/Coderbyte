import java.util.Scanner;

class Main {

    public static int b=0;
    public static int count = 0;

    public static int LineOrdering(String[] strArr) {
        // code goes here
        StringBuilder list = new StringBuilder();
        int fact = 1;
        for (String i: strArr){
            if (!list.toString().contains(i.substring(0,1))){
                list.append(i.charAt(0));
            }
            if (!list.toString().contains(i.substring(2))){
                list.append(i.substring(2));
            }
        }
        String[] listarr = new String[list.length()];
        for(int i=0; i <list.length(); i++){
            listarr[i] = list.charAt(i)+"";
        }
        for(int i =1; i <list.length()+1;i++){
            fact *= i;
        }
        String[] combinations = new String[fact];
        heapAlgorithm(listarr, listarr.length, listarr.length,combinations);

        for(int i = ; i <fact; i++){
            combinations[i] = combinations[i].substring(4);
        }
        for(String i: combinations){
            if(relationCheck(i, strArr)){
                count ++;
            }
        }
        return count;
    }

    public static void heapAlgorithm(String a[], int size, int n, String combinations[]){
        if(size == 1){
            String[] temp = new String[n];
            for(int i = 0; i < n ; i++){
                combinations[b] += a[i];
            }
            b++;
        }

        for(int i=0; i <size; i++){
            heapAlgorithm(a,size-1, n, combinations);
            String temp;
            if (size % 2 == 1){
                temp = a[0];
                a[0] = a[size - 1];
            }
            else{
                temp = a[i];
                a[i] = a[size - 1];
            }
            a[size - 1] = temp;
        }
    }

    public static boolean relationCheck(String a, String[] strArr){
        String temp = "";
        for (String s : strArr) {
            String[] c;
            c = s.split("");

            if (c[1].equals("<")) {
                temp = c[0];
                c[0] = c[2];
                c[2] = temp;
            }
            int indexofA = a.indexOf(c[0]);
            int indexofB = a.indexOf(c[2]);

            if (indexofA <= indexofB) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LineOrdering(new String[]{s.nextLine()}));
    }

}