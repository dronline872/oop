public class Main {
    public static void main(String[] args) {
        GBList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("Размер: " + linkedList.size()); 

        int elementAtIndex2 = linkedList.get(2);
        System.out.println("Элемент с индексом 2: " + elementAtIndex2); 

        linkedList.add(4);
        linkedList.update(0, 5);
        linkedList.remove(1);

        System.out.print("Обновленный список: ");
        for (Integer element : linkedList) {
            System.out.print(element + " ");
        }
    }
}