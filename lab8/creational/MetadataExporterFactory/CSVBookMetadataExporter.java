package creational.MetadataExporterFactory;
//new class on new folder
import creational.CSVBookMetadataFormatter;
import creational.BookMetadataExporter;
import creational.BookMetadataFormatter;
import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createFormatter() throws IOException {
        return new CSVBookMetadataFormatter();
    }
}
