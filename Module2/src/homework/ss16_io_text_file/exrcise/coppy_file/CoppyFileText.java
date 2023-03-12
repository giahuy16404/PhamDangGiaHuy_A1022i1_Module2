package homework.ss16_io_text_file.exrcise.coppy_file;

import java.io.*;

public class CoppyFileText {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter source file path: ");
        String sourceFile = reader.readLine();

        System.out.print("Enter target file path: ");
        String targetFile = reader.readLine();

        File source = new File(sourceFile);
        File target = new File(targetFile);

        FileInputStream inputStream = new FileInputStream(source);
        FileOutputStream outputStream = new FileOutputStream(target);

        int length;
        byte[] buffer = new byte[1024];

        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }
}
