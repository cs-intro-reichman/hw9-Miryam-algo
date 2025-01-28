public class TestTry {
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        MemoryBlock block1 = new MemoryBlock(1, 10);
        list.addFirst(block1);
        System.out.println(list);

        for(int i = 0; i < 5; i++){
            MemoryBlock block = new MemoryBlock(i, 8);
            list.add(i, block);
        }
        MemorySpace ms = new MemorySpace(100);
        System.out.println(ms);

        // System.out.println(list);
        // MemoryBlock lastBlock = new MemoryBlock(3, 11);
        // MemoryBlock firstBlock = new MemoryBlock(1, 9);
        // list.addFirst(firstBlock);
        // System.out.println(list);
        // list.addLast(lastBlock);
        // System.out.println(list);
        // Node getNode = list.getNode(5);
        // System.out.println(getNode);
        
        // MemoryBlock getBlock = list.getBlock(5);
        // System.out.println(getBlock);
        // System.out.println(list.indexOf(getBlock));
        // list.remove(0);
        // System.out.println(list);

        // list.remove(list.getSize()-1);
        // System.out.println(list);

        
        // list.remove(3);
        // System.out.println(list);
        // list.remove(list.getSize());


    }
    
}
