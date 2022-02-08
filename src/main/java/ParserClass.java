import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;

public class ParserClass {

    public Object parseJson(String resourceName,String parameterValue){
        InputStream is = ParserClass.class.getResourceAsStream(resourceName);
        if (is == null) {
            throw new NullPointerException("Cannot find resource file " + resourceName);
        }
        JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        return object.get(parameterValue);
    }

}
