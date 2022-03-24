package creational;

import creational.MetadataExporterFactory.CSVBookMetadataExporter;
import creational.MetadataExporterFactory.JSONBookMetadataExporter;
import creational.MetadataExporterFactory.XMLBookMetadataExporter;

public class Main {

    public static void main(String[] args) throws Exception{
        // Implemented method
        //    ***ระหว่าง CSV, JSON และ XML ให้เลือกอย่างใดอย่างหนึ่งในการ run ที่เหลือให้ commit***---
        // BookMetadataExporter exporter = new CSVBookMetadataExporter();
        //   BookMetadataExporter exporter = new JSONBookMetadataExporter();
        BookMetadataExporter exporter = new XMLBookMetadataExporter();
        //    ***ระหว่าง CSV, JSON และ XML ให้เลือกอย่างใดอย่างหนึ่งในการ run ที่เหลือให้ commit***---
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);
    }
}
