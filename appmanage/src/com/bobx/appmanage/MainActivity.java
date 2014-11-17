package com.bobx.appmanage;

import java.io.UnsupportedEncodingException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
//	private static final String DOWNLOAD = "http://jt.sxsihe.com/shsoftware/";
	private static final String DOWNLOAD = "http://jt.sxsihe.com/hh.php";
	protected static final String TAG = "MainActivity";
	private RequestQueue queue;
	private TextView tv_base;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_base = (TextView) findViewById(R.id.tv_base);
        queue = Volley.newRequestQueue(this);
        getAppData();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    /**
     * 获取app信息
     */
    private void getAppData(){
    	StringRequest request = new StringRequest(DOWNLOAD,new Listener<String>() {

			@Override
			public void onResponse(String response) {
//				try {
//					JSONArray array = new JSONArray(response);
//					for(int i = 0 ; i<array.length(); i++){
//						JSONObject object = array.getJSONObject(i);
//						Log.i(TAG,object.getString("name"));
//					}
//				} catch (JSONException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}, new ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError arg0) {
				
			}
		});
    	queue.add(request);
    }
}
