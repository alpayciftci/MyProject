package huffman;

import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class HuffmanNode implements Comparable<HuffmanNode> {
    int frequency;
    char character;
    HuffmanNode left;
    HuffmanNode right;

    HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    HuffmanNode(int frequency, HuffmanNode left, HuffmanNode right) {
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;
    }
}

class HuffmanCoding {
    private HuffmanNode root;
    private final Map<Character, String> huffmanCodeMap = new HashMap<>();

    private void buildHuffmanTree(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode newNode = new HuffmanNode(left.frequency + right.frequency, left, right);
            priorityQueue.offer(newNode);
        }

        root = priorityQueue.poll();
        generateHuffmanCodes(root, "");
    }

    private void generateHuffmanCodes(HuffmanNode node, String code) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            huffmanCodeMap.put(node.character, code);
        }

        generateHuffmanCodes(node.left, code + "0");
        generateHuffmanCodes(node.right, code + "1");
        //System.out.println(huffmanCodeMap);
    }

    private String encode(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            encodedText.append(huffmanCodeMap.get(ch));
        }
        return encodedText.toString();
    }

    private String decode(BitSet bitSet, int bitLength) {
        StringBuilder decodedText = new StringBuilder();
        HuffmanNode currentNode = root;
        for (int i = 0; i < bitLength; i++) {
            currentNode = bitSet.get(i) ? currentNode.right : currentNode.left;
            if (currentNode.left == null && currentNode.right == null) {
                decodedText.append(currentNode.character);
                currentNode = root;
            }
        }
        return decodedText.toString();
    }

    public void compressFile(String inputFile, String outputFile) {
        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                text.append(line).append("\n");
            }
            //System.out.println(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String trimmedText = text.toString().trim();

        buildHuffmanTree(trimmedText);
        String encodedText = encode(trimmedText);

        //System.out.println(encodedText);

        BitSet bitSet = new BitSet(encodedText.length());
        for (int i = 0; i < encodedText.length(); i++) {
            if (encodedText.charAt(i) == '1') {
                bitSet.set(i);
            }
        }

        try (FileOutputStream fos = new FileOutputStream(outputFile);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(bitSet);
            oos.writeInt(encodedText.length());
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void decompressFile(String inputFile, String outputFile) throws IOException, ClassNotFoundException {
        BitSet bitSet;
        int bitLength;

        try (FileInputStream fis = new FileInputStream(inputFile);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            bitSet = (BitSet) ois.readObject();
            bitLength = ois.readInt();
        }

        String decodedText = decode(bitSet, bitLength);
        String convertedText = decodedText.replace("\n", "\r\n"); // Replace Unix newlines with Windows newlines

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(convertedText);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LocalTime start = LocalTime.now();

        HuffmanCoding huffmanCoding = new HuffmanCoding();
        huffmanCoding.compressFile("new.txt", "compressed.txt");
        huffmanCoding.decompressFile("compressed.txt", "decompressed.txt");

        LocalTime finish = LocalTime.now();
        long millis = Duration.between(start, finish).toMillis();
        System.out.println("Compression and Decompression took: " + millis + " milliseconds");
    }
}
