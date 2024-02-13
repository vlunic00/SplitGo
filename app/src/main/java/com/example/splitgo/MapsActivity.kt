package com.example.splitgo

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.example.splitgo.databinding.ActivityMapsBinding



class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val linije = resources.getStringArray(R.array.linije)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, linije)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        var onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            if (position == 0) {
                map.clear()
                drawRoute3(map)
            } else if (position == 1) {
                map.clear()
                drawRoute9(map)
            }
        }

        val homeLatLng = LatLng(43.514741, 16.462205)
        val zoomLevel = 15f

        enableMyLocation()

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(homeLatLng, zoomLevel))

        val textView = findViewById<TextView>(R.id.TextView1)

        val appName = "SplitGo"

        val ss = SpannableString(appName)
        val fColor1 = ForegroundColorSpan(Color.BLUE)
        val fColor2 = ForegroundColorSpan(Color.rgb(235, 219, 0))

        ss.setSpan(fColor1, 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(fColor2, 5, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        textView.setText(ss)

    }



    private val REQUEST_LOCATION_PERMISSION = 1

    private fun isPermissionGranted() : Boolean {
        return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
    }

    private fun enableMyLocation(){
        if(isPermissionGranted()) {
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            map.isMyLocationEnabled = true
        }
        else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_LOCATION_PERMISSION
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_LOCATION_PERMISSION) {
            if (grantResults.contains(PackageManager.PERMISSION_GRANTED)) {
                enableMyLocation()
            }
        }
    }

    fun logInScreen(view: View){
        val intent = Intent(this, LogInActivity::class.java)
        startActivity(intent)
    }
}
