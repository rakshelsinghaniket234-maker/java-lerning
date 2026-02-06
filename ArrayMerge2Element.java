public class ArrayMerge2Element {
    public static void main(String[]args){
        int[] a = {3,5,8,9,4};
        int[] b = {10,1,2,6,5,74};
        
        int[] c = new int[a.length+b.length];


        merge(c,a,b);
        for (int i : c) {//normal
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void merge(int[]c,int[]a,int[]b) {
        int i = 0, j = 0, k = 0;

        while (i<a.length && j<b.length) {
            if (a[i]<b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
            else{ 
                c[k] = b[j]; 
                j++;
                k++;
            }
        }
        
        if (i==a.length) {//a array khtam to b ke bache hue ele lelo
            while (j<b.length) {
                c[k] = b[j];
            k++;
            j++;
        
            }
            while (j<a.length) {//b array khtam to a ke bache hue ele lelo
                c[k] = a[i];
                k++;
                i++;
            }
        }
    }
}

