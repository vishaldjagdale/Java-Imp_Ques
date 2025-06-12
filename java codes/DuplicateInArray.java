import java.util.*;
public class DuplicateInArray {
public int findDuplicate(int[] nums){
Set<Integer>seen = new HashSet<>();
for(int num:nums){
    if(seen.contains(num)){
        return num; // Duplicate found
    }
    seen.add(num);
}
return -1;
    
}
    public static void main(String[] args) {
      DuplicateInArray dup = new DuplicateInArray();
      int nums[]={1,2,3,45,4,3};
      int result=dup.findDuplicate(nums);
      System.out.println(result);
    }
}
