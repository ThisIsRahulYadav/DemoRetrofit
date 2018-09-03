package dumyprojects.com.demoretrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lenovo on 9/3/2018.
 */

public class RetrofitApi {
    private static final String BASE_URL = "http://sss.ashishsrivastava.info/WebApi/Common/";

    public static PostService postService=null;

    public static PostService getService(){
        if(postService==null){
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            postService =retrofit.create(PostService.class);
        }
        return postService;
    }



    public interface PostService {

        @GET("Financial?Strtype=13")
        Call<Result> getUserDetails(@Query("StateName") String apiKey);
    }
}
