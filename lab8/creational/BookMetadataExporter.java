package creational;

import java.io.IOException;
import java.io.PrintStream;
import java.io.FileWriter;
// ใช้ตัวนี้แทน Factory ได้
public abstract class BookMetadataExporter extends BookCollection {
    public void export(PrintStream stream) throws Exception{
        // implemented file
        BookMetadataFormatter formatter = createFormatter();
        for (Book book : books){
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());
        try (FileWriter file = new FileWriter("./exporter.txt")){
            file.write(formatter.getMetadataString());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract BookMetadataFormatter createFormatter() throws Exception;
}
