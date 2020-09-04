import java.util.Map;

public class Parameters {
    /**
     * This method parses a string with parameters and values, returning them inside a Map.
     * @param params
     * @return
     */
    public Map<String, String> buildMap(String params){
        // Implement logic here
        return null;
    }

    public static void main(String[] args) {
        String params = "title=Cosmos&author=Sagan&isbn=0375508325&year=1980";
        Map<String, String> map = new Parameters().buildMap(params);
        map.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
