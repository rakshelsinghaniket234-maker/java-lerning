public class LinearSearch{

 public static void main(String[]args){
    
       int[] arr = {12,45,78,65,44,77};

       int target = 44;

       Boolean flag = false;

       for(int i=0; i<arr.length; i++){

          if(arr[i]==target){
          System.out.println("target is exist in array" +arr[i]);
           
      flag = true;//true menas target arry hai
 
        break;


}

 }

       if(flag){
         System.out.println("target is exist in array");

         }

              else{

                   System.out.println("target missing in aaray");
}
}
}

/*
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 65, 44, 77};
        int target = 44;
        boolean flag = false;  // Use lowercase 'boolean' instead of 'Boolean'
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {  // Fixed typo: taget → target
                System.out.println("Target exists in array at index " + i + ": " + arr[i]);
                flag = true;
                break;
            }
        }
        
        if (flag) {  // Fixed: Use flag variable, not target=true
            System.out.println("Target found!");
        } else {
            System.out.println("Target missing in array");
        }
    }
}





 
*/