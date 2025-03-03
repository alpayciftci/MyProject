package huffman;

public class BuildHuffmanTreeNew {


//    private void buildHuffmanTree(String text) {
//        Map<Character, Integer> frequencyMap = new HashMap<>();
//        for (char ch : text.toCharArray()) {
//            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
//        }
//
//        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();
//        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
//            priorityQueue.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
//        }
//
//        // Ensure there are at least two nodes to merge
//        if (priorityQueue.size() == 1) {
//            HuffmanNode singleNode = priorityQueue.poll();
//            priorityQueue.offer(singleNode);
//            priorityQueue.offer(singleNode);
//        }
//
//        while (priorityQueue.size() > 1) {
//            HuffmanNode left = priorityQueue.poll();
//            HuffmanNode right = priorityQueue.poll();
//            HuffmanNode newNode = new HuffmanNode(left.frequency + right.frequency, left, right);
//            priorityQueue.offer(newNode);
//        }
//
//        root = priorityQueue.poll();
//        generateHuffmanCodes(root, "");
//    }
//


}
