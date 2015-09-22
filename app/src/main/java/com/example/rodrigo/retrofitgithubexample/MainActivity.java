package com.example.rodrigo.retrofitgithubexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * MainActivity.java class.
 *
 * @author Rodrigo Cericatto
 * @since 29/09/2014
 */
public class MainActivity extends Activity {

    //--------------------------------------------------
    // Constants
    //--------------------------------------------------

    public static final String END_POINT = "https://api.github.com";

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private GithubService mService;

    //--------------------------------------------------
    // Activity Life Cycle
    //--------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(END_POINT).build();

        mService = restAdapter.create(GithubService.class);
        mService.listRepos("graffiti75", new Callback<List<Repo>>() {
            @Override
            public void failure(RetrofitError retrofitError) {
                String cause = retrofitError.getCause().getMessage();
                String errorCause = "The error cause is " + cause + ".";
                Toast.makeText(MainActivity.this, errorCause, Toast.LENGTH_LONG) .show();
            }

            @Override
            public void success(List<Repo> object, Response response) {
                String login = object.get(0).getOwner().login;
                Integer status = response.getStatus();
                String success = "The HTTP status is " + status + ", and the login is " + login + ".";
                Toast.makeText(MainActivity.this, success, Toast.LENGTH_LONG).show();
            }
        });
    }
}