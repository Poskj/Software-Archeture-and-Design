package creational.MetadataExporterFactory;
//new class on new folder
import creational.XMLBookMetadataFormatter;
import creational.BookMetadataExporter;
import creational.BookMetadataFormatter;
import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createFormatter() throws ParserConfigurationException{
        return new XMLBookMetadataFormatter();
    }
}
