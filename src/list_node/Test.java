package list_node;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
//        for (int i = 0; i < linkedList.size(); i++){
//            System.out.print(linkedList.get(i) + " ");
//        }
        for (Integer list : linkedList){
            System.out.print(list + " ");
        }
    }
}
