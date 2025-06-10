import java.util.ArrayList;
class ArrayList1 {
public static void main(String[] args) {
    // ArrayList<String> student= new ArrayList<>();
    // student.add("Vishal");
    // student.add("Vicky");
    // System.out.println(student);
    ArrayList<Integer> list= new ArrayList<>();
    list.add(2);
    list.add(4);
    
    list.add(10);
    // System.out.println(list);
    
    // ArrayList<Integer> newList= new ArrayList<>();
    // newList.addAll(list);
    // System.out.println(newList);
    // newList.remove(0);
    // System.out.println(newList);
    // System.out.println(list.remove(Integer.valueOf(2)));
    // System.out.println(list);
    // list.clear();
    // System.out.println(list);
    // newList.clear();
    // System.out.println(newList);
    // newList.contains(2);
    // System.out.println(newList);

    System.out.println(list.size());
    for(Integer element:list){
        System.out.println("All element of the list are "+ element);
    }

}
}
