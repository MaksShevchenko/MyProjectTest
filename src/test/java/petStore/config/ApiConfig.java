package petStore.config;

public class ApiConfig {
    private static final String DEFAULT_BASE_URL = "https://petstore.swagger.io/v2/pet";
    private final String BASE_URL;
    private final String API_KEY;
    private final int TIME_OUT;

    public ApiConfig(String BASE_URL, String API_KEY, int TIME_OUT) {
        this.BASE_URL = BASE_URL;
        this.API_KEY = API_KEY;
        this.TIME_OUT = TIME_OUT;
    }
    //public static apiConfig(){}


    public String getBASE_URL() {
        return BASE_URL;
    }

    public String getAPI_KEY() {
        return API_KEY;
    }

    public int getTIME_OUT() {
        return TIME_OUT;
    }

}
