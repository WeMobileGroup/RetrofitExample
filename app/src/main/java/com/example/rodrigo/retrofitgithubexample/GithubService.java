package com.example.rodrigo.retrofitgithubexample;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * GitHubService.java class.
 *
 * @author Rodrigo Cericatto
 * @since 29/09/2014
 */
public interface GithubService {
    @GET("/users/{user}/repos")
    void listRepos(@Path("user") String user, Callback<List<Repo>> callback);
}