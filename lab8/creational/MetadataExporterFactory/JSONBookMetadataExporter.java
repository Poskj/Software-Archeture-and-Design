package creational.MetadataExporterFactory;
//new class on new folder
import creational.JSONBookMetadataFormatter;
import creational.BookMetadataExporter;
import creational.BookMetadataFormatter;

public class JSONBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createFormatter() {
        return new JSONBookMetadataFormatter();
    }
}
