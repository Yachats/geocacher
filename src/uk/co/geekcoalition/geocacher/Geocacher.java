package uk.co.geekcoalition.geocacher;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.GeoPoint; 

public class Geocacher extends MapActivity {
	private MapView map;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        map = new MapView(this, "api_key_goes_here");
        GeoPoint p = new GeoPoint((int) (40.689213 * 1000000), (int) (-74.044558 * 1000000));
        MapController mc = map.getController();
        mc.animateTo(p);
        mc.setZoom(20);
        setContentView(map);
        map.setSatellite(true); 
    }
    
    @Override
    public boolean isRouteDisplayed() {
    	return false;
    }
}