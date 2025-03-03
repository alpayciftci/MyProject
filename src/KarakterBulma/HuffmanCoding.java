package KarakterBulma;

import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class HuffmanNode {
    int frequency;
    char character;
    HuffmanNode left, right;

    HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    HuffmanNode(int frequency, HuffmanNode left, HuffmanNode right) {
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }
}

class HuffmanCoding {
    public static Map<Character, String> generateHuffmanCodes(HuffmanNode root) {
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateCodesHelper(root, "", huffmanCodes);
        return huffmanCodes;
    }

    private static void generateCodesHelper(HuffmanNode node, String code, Map<Character, String> huffmanCodes) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.character, code);
        }
        generateCodesHelper(node.left, code + '0', huffmanCodes);
        generateCodesHelper(node.right, code + '1', huffmanCodes);
    }

    public static HuffmanNode buildHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>((a, b) -> a.frequency - b.frequency);

        for (var entry : frequencyMap.entrySet()) {
            priorityQueue.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode parent = new HuffmanNode(left.frequency + right.frequency, left, right);
            priorityQueue.add(parent);
        }

        return priorityQueue.poll();
    }

    public static void serializeHuffmanTree(HuffmanNode node, DataOutputStream out) throws IOException {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            out.writeByte(1); // Leaf node flag
            out.writeChar(node.character);
        } else {
            out.writeByte(0); // Internal node flag
            serializeHuffmanTree(node.left, out);
            serializeHuffmanTree(node.right, out);
        }
    }

    public static void writeEncodedFile(String fileName, HuffmanNode root, String encodedText) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {
            // Serialize the Huffman tree
            serializeHuffmanTree(root, out);

            // Write the encoded text
            byte[] encodedBytes = convertToByteArray(encodedText);
            out.write(encodedBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] convertToByteArray(String encodedText) {
        int byteLength = (encodedText.length() + 7) / 8;
        byte[] byteArray = new byte[byteLength];
        for (int i = 0; i < encodedText.length(); i++) {
            if (encodedText.charAt(i) == '1') {
                byteArray[i / 8] |= (byte) (1 << (7 - (i % 8)));
            }
        }
        return byteArray;
    }


    public static byte[] readEncodedFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] encodedData = new byte[fis.available()];
            fis.read(encodedData);
            return encodedData;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static HuffmanNode rebuildHuffmanTree(DataInputStream in) throws IOException {
        int flag = in.readByte();
        if (flag == 1) {  // Leaf node
            char character = in.readChar();
            return new HuffmanNode(character, 0);
        } else {  // Internal node
            HuffmanNode left = rebuildHuffmanTree(in);
            HuffmanNode right = rebuildHuffmanTree(in);
            return new HuffmanNode(0, left, right);
        }
    }

    public static String decodeData(byte[] encodedData, HuffmanNode root, int startIndex) {
        StringBuilder decodedText = new StringBuilder();
        HuffmanNode currentNode = root;

        for (int i = startIndex; i < encodedData.length; i++) {
            for (int bit = 7; bit >= 0; bit--) {
                currentNode = ((encodedData[i] & (1 << bit)) == 0) ? currentNode.left : currentNode.right;
                if (currentNode.left == null && currentNode.right == null) {
                    decodedText.append(currentNode.character);
                    currentNode = root;
                }
            }
        }
        return decodedText.toString();
    }


    public static void writeDecodedFile(String fileName, String decodedText) {
        // Replace Unix newlines with Windows newlines
        String convertedText = decodedText.replace("\n", "\r\n");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(convertedText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        try {
            // Encoding Part
            File file = new File("new.txt");
            Scanner scanner = new Scanner(file);  // Create a Scanner object to read the file
            // Read the entire contents of the file into a StringBuilder
            StringBuilder sentenceBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                sentenceBuilder.append(scanner.nextLine()).append("\n");
            }
            scanner.close();

            String text = sentenceBuilder.toString().trim(); // Convert the StringBuilder to a single string
            // Build frequency map
            Map<Character, Integer> frequencyMap = new HashMap<>();
            for (char c : text.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
            // Build Huffman Tree
            HuffmanNode root = buildHuffmanTree(frequencyMap);
            // Generate Huffman Codes
            Map<Character, String> huffmanCodes = generateHuffmanCodes(root);
            // Print Huffman Codes to check
//            System.out.println("Huffman Codes:");
//            for (var entry : huffmanCodes.entrySet()) {
//                System.out.println(entry.getKey() + ": " + entry.getValue());
//            }
            // Encode the text to a StringBuilder
            StringBuilder encodedText = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (c == '\n') {
                    encodedText.append(huffmanCodes.get(c));
                } else {
                    encodedText.append(huffmanCodes.getOrDefault(c, ""));
                }
            }

            // Writing Encoded text to a file
            writeEncodedFile("encoded_file.txt", root, encodedText.toString());

            // Decoding Part
            byte[] encodedData = readEncodedFile("encoded_file.txt");
            if (encodedData != null) {
                DataInputStream in = new DataInputStream(new ByteArrayInputStream(encodedData));
                HuffmanNode decodedRoot = rebuildHuffmanTree(in);
                int startIndex = encodedData.length - in.available(); // Determine where encoded data starts
                String decodedText = decodeData(encodedData, decodedRoot, startIndex);
                //System.out.println("Decoded Text: " + decodedText);
                writeDecodedFile("decoded_file.txt", decodedText);
            } else {
                System.out.println("Failed to read encoded file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalTime finish = LocalTime.now();

        long millis = Duration.between(start, finish).toMillis();
        System.out.println("Compression and Decompression took: " + millis + " milliseconds");
    }
}
