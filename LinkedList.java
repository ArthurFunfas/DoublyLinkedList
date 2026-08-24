public class LinkedList {
    Node begin;
    Node end;
    int size;

    public LinkedList() {
        this.end = null;
        this.begin = null;
        size = 0;
    }

    public boolean nodeEmpty(){
        if (begin == null){
            return true;
        }else{
            return false;
        }
    }

    public void addValueBegin(int value) {
        Node currentNode = new Node(value);

        if (nodeEmpty()) {
            begin = currentNode;
            end = currentNode;
        }else{
            currentNode.next = begin;
            currentNode.next.preview = begin;
            begin = currentNode;
        }

        size++;
    }

    public void addValueEnd(int value) {
        Node currentNode = new Node(value);

        if (nodeEmpty()) {
            begin = currentNode;
            end = currentNode;
        }else{
            currentNode.preview = end;
            end.next = currentNode;
            end = currentNode;
        }

        size++;
    }
    public void showValue(){
        Node currentNode = begin;

        while( currentNode != null){
            System.out.println("Nó atual: " + currentNode.value);
            if( currentNode.preview != null){
                System.out.println("Nó anterior: " + currentNode.preview.value);
            }
            if (currentNode.next != null){
                System.out.println("Próximo nó: " + currentNode.next.value);
            }
            System.out.println("----------------------------------");
            currentNode = currentNode.next;
        }

        System.out.println("A lista possui: " + getSize() + " nó(s)\n");
    }

    public int getSize(){
        int size = 0;

        Node currentNode = begin;

        while (currentNode != null){
            size++;

            currentNode = currentNode.next;
        }
        return size;
    }

    public boolean containsValue( int value){
        Node currentNode = begin;

        while (currentNode != null) {
            if (currentNode.value == value){
                System.out.println("O valor " + value  + " está na lista.\n");
                return true;
            }
            currentNode = currentNode.next;

        }
        System.out.println("O valor " + value  + " não está na lista.\n");
        return false;
    }

    public boolean removeValue( int value){
        if(nodeEmpty()){
            return false;
        }

        Node currentNode = begin;

        while (currentNode != null){
            if (currentNode.value == value) {

                if (currentNode == begin) {
                    begin = currentNode.next;

                    if (begin == null) {
                        end = null;
                    } else {
                        currentNode.preview = null;
                    }

                } else if (currentNode == end) {
                    end = currentNode.preview;
                    end.next = null;

                } else {
                    currentNode.preview.next = currentNode.next;
                    currentNode.next.preview = currentNode.preview;
                }

                currentNode.next = null;
                currentNode.preview = null;

                size--;

                return true;
            }
            currentNode = currentNode.next;

        }
        return false;
    }
}