package com.vlille.checker.ui.listener;

import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.vlille.checker.ui.MapFragment;

import org.osmdroid.util.GeoPoint;

/**
 * A TabListener to modify the current map center.
 */
public class MapTabListener extends TabListener<MapFragment> implements ActionBar.TabListener {

    private GeoPoint geoPoint;

    public MapTabListener(SherlockFragmentActivity activity, GeoPoint geoPoint) {
        super(activity, "map", MapFragment.class);

        this.geoPoint = geoPoint;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        super.onTabSelected(tab, ft);

        if (geoPoint != null) {
            MapFragment mapFragment = (MapFragment) getFragment();
            mapFragment.setCenter(geoPoint);

            // Reset to null to not change the center on each tab change.
            geoPoint = null;
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        super.onTabUnselected(tab, ft);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        super.onTabReselected(tab, ft);
    }

}