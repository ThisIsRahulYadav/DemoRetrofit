package dumyprojects.com.demoretrofit;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
String API_KEY="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
getData();
    }

    private void getData(){
        final Call<Result> postList=RetrofitApi.getService().getUserDetails(API_KEY);
        postList.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
            Result list=response.body();
                Log.e("the value in list", String.valueOf(list));
                Toast.makeText(MainActivity.this,"SUCCESS",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                Toast.makeText(MainActivity.this,"FAILURE",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
