public class Main {
    public static void main(String[] args) {
        String resourceName = "/inputParameters.json";
        String parameterValue = "NiFi Start Status Activity";
        ParserClass parse = new ParserClass();
        System.out.println(parse.parseJson(resourceName,parameterValue));
    }
}
