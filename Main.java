void main() {
    LinkedList linkedlist = new LinkedList();


    linkedlist.addValueBegin(5);
    linkedlist.addValueBegin(8);
    linkedlist.addValueEnd(10);
    linkedlist.addValueEnd(44);

    linkedlist.showValue();

    linkedlist.containsValue(4);
    linkedlist.containsValue(5);

    linkedlist.removeValue(10);

    linkedlist.showValue();


}
