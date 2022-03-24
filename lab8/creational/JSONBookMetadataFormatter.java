package creational;

import java.io.StringWriter;
import java.util.Arrays;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    //implemented file
    private StringWriter stWriter;
    private JSONArray jsArray;
    public JSONBookMetadataFormatter() {
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        stWriter = new StringWriter();
        jsArray = new JSONArray();
        return this;
    }
    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject jsObject = new JSONObject();
        jsObject.put("ISBN", b.getISBN());
        jsObject.put("title", b.getTitle());
        jsObject.put("publisher", b.getPublisher());
        jsObject.put("authors", Arrays.toString(b.getAuthors()));
        jsArray.add(jsObject);
        stWriter.write(jsArray.toJSONString());
        return this;
    }
    @Override
    public String getMetadataString() {
        return stWriter.toString();
    }
}