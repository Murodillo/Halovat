package uz.halovat.halovat.Menus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_mosques_map.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R


class MosquesMapActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mosques_map)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Xarita"
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)


        cv_masjid_info.setOnClickListener {
            val intent = Intent(this, MosqueInfoActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right)
        }




    }



    override fun onMapReady(googleMap: GoogleMap) {
        val innovation = LatLng(41.348710, 69.208313)
        googleMap.addMarker(
            MarkerOptions()
                .position(innovation)
                .title("Minestry of Innovation")
        )
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(innovation, 15f))
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }
}