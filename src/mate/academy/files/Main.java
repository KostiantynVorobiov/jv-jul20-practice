package mate.academy.files;

import mate.academy.files.service.BufferedFileReaderService;
import mate.academy.files.service.FileReaderService;

public class Main {

    public static void main(String[] args) {
        // read file
        FileReaderService readerService = new BufferedFileReaderService();
        printAll(readerService);
    }

    private static void printAll(FileReaderService readerService) {
        String content = readerService.readFile("file.txt");
        System.out.println(content);
    }

}
