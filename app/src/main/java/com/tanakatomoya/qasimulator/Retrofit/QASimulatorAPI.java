package com.tanakatomoya.qasimulator.Retrofit;

import com.tanakatomoya.qasimulator.Model.SpinGlassModel;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


//multipart/form-data形式でPOST
public interface QASimulatorAPI {
    @Multipart
    @POST("QASimulator/solve/")
    Call<SpinGlassModel> createSpinGlassModel(@Part("name") RequestBody name,
                                              @Part("trotter_num") RequestBody trotter_num,
                                              @Part("site_num") RequestBody site_num,
                                              @Part("result") RequestBody result,
                                              @Part("data\"; filename=\"SG.csv\" ")
                                                      RequestBody file);

}
