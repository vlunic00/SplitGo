package com.example.splitgo

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions


fun drawRoute3(googleMap: GoogleMap){
    var map = googleMap

    val lovrinacJug1 = LatLng(43.510318, 16.492349)
    map.addMarker(MarkerOptions().position(lovrinacJug1).title("3"))
    map.moveCamera(CameraUpdateFactory.newLatLng(lovrinacJug1))

    val poljicka1 = LatLng(43.510783, 16.480511)
    map.addMarker(MarkerOptions().position(poljicka1).title("2, 3, 5, 5A"))
    map.moveCamera(CameraUpdateFactory.newLatLng(poljicka1))

    val poljicka2 = LatLng(43.509181, 16.475063)
    map.addMarker(MarkerOptions().position(poljicka2).title("2, 3, 5, 5A, 8, 14, 15"))
    map.moveCamera(CameraUpdateFactory.newLatLng(poljicka2))

    val poljicka3 = LatLng(43.507703, 16.470600)
    map.addMarker(MarkerOptions().position(poljicka3).title("2, 3, 5, 5A, 8, 14, 15"))
    map.moveCamera(CameraUpdateFactory.newLatLng(poljicka3))

    val poljicka4 = LatLng(43.506653, 16.464291)
    map.addMarker(MarkerOptions().position(poljicka4).title("2, 3, 5, 5A, 8, 14, 15"))
    map.moveCamera(CameraUpdateFactory.newLatLng(poljicka4))

    val poljicka5 = LatLng(43.505883, 16.459849)
    map.addMarker(MarkerOptions().position(poljicka5).title("2, 3, 5, 5A, 8, 11, 14"))
    map.moveCamera(CameraUpdateFactory.newLatLng(poljicka5))

    val poljicka6 = LatLng(43.505167, 16.455600)
    map.addMarker(MarkerOptions().position(poljicka6).title("2, 3, 5, 5A, 8, 11, 14"))
    map.moveCamera(CameraUpdateFactory.newLatLng(poljicka6))

    val zvonimirova1 = LatLng(43.505541, 16.450354)
    map.addMarker(MarkerOptions().position(zvonimirova1).title("2, 3, 5, 5A, 8, 11"))
    map.moveCamera(CameraUpdateFactory.newLatLng(zvonimirova1))

    val pazar = LatLng(43.507354, 16.442372)
    map.addMarker(
        MarkerOptions()
        .position(pazar).title("2, 2A, 3, 5, 5A, 8, 9, 10, 11, 15, 18"))
    map.moveCamera(CameraUpdateFactory.newLatLng(pazar))

    val opcina = LatLng(43.512653, 16.442522)
    map.addMarker(
        MarkerOptions()
        .position(opcina).title("1, 2, 2A, 3, 5, 5A, 8, 9, 10, 11, 16, 22"))
    map.moveCamera(CameraUpdateFactory.newLatLng(opcina))

    val solinska = LatLng(43.516049, 16.444847)
    map.addMarker(
        MarkerOptions()
        .position(solinska).title("1, 2A, 3, 9, 10, 11, 16, 17, 22"))
    map.moveCamera(CameraUpdateFactory.newLatLng(solinska))

    val domovinskogRata = LatLng(43.518536, 16.448001)
    map.addMarker(
        MarkerOptions()
        .position(domovinskogRata).title("1, 2A, 3, 9, 10, 16, 22"))
    map.moveCamera(CameraUpdateFactory.newLatLng(domovinskogRata))

    val hercegovacka1 = LatLng(43.520877, 16.449471)
    map.addMarker(MarkerOptions().position(hercegovacka1).title("2A, 3, 14"))
    map.moveCamera(CameraUpdateFactory.newLatLng(hercegovacka1))

    val hercegovacka2 = LatLng(43.521313, 16.455973)
    map.addMarker(MarkerOptions().position(hercegovacka2).title("2A, 3, 14"))
    map.moveCamera(CameraUpdateFactory.newLatLng(hercegovacka2))

    val hercegovacka3 = LatLng(43.521546, 16.463151)
    map.addMarker(MarkerOptions().position(hercegovacka3).title("3, 14"))
    map.moveCamera(CameraUpdateFactory.newLatLng(hercegovacka3))

    val brda2 = LatLng(43.521927, 16.468022)
    map.addMarker(MarkerOptions().position(brda2).title("3, 9, 11, 14"))
    map.moveCamera(CameraUpdateFactory.newLatLng(brda2))

    val brda1 = LatLng(43.521698, 16.472877)
    map.addMarker(MarkerOptions().position(brda1).title("3, 14"))
    map.moveCamera(CameraUpdateFactory.newLatLng(brda1))

    val polyline1 = map.addPolyline(
        PolylineOptions()
        .clickable(false)
        .add(
            LatLng(lovrinacJug1.latitude, lovrinacJug1.longitude),
            LatLng(43.509870, 16.492484),
            LatLng(43.511628, 16.484952),
            LatLng(43.512227, 16.484351),
            LatLng(poljicka1.latitude,poljicka1.longitude),
            LatLng(poljicka2.latitude, poljicka2.longitude),
            LatLng(poljicka3.latitude, poljicka3.longitude),
            LatLng(poljicka4.latitude, poljicka4.longitude),
            LatLng(poljicka5.latitude, poljicka5.longitude),
            LatLng(poljicka6.latitude, poljicka6.longitude),
            LatLng(43.504967, 16.453752),
            LatLng(43.505326, 16.452564),
            LatLng(43.505464, 16.451767),
            LatLng(zvonimirova1.latitude, zvonimirova1.longitude),
            LatLng(43.505556, 16.449184),
            LatLng(43.505758, 16.447875),
            LatLng(43.506984, 16.442403),
            LatLng(pazar.latitude, pazar.longitude),
            LatLng(43.507832, 16.442457),
            LatLng(43.508976, 16.443224),
            LatLng(43.509357, 16.442178),
            LatLng(43.510279, 16.441239),
            LatLng(43.510987, 16.440992),
            LatLng(43.511333, 16.441550),
            LatLng(43.512375, 16.442236),
            LatLng(opcina.latitude, opcina.longitude),
            LatLng(43.514694, 16.443588),
            LatLng(43.515713, 16.444189),
            LatLng(solinska.latitude, solinska.longitude),
            LatLng(domovinskogRata.latitude, domovinskogRata.longitude),
            LatLng(43.519595, 16.449274),
            LatLng(43.520739, 16.448974),
            LatLng(hercegovacka1.latitude, hercegovacka1.longitude),
            LatLng(43.521478, 16.451978),
            LatLng(hercegovacka2.latitude, hercegovacka2.longitude),
            LatLng(hercegovacka3.latitude, hercegovacka3.longitude),
            LatLng(brda2.latitude, brda2.longitude),
            LatLng(43.522070, 16.469017),
            LatLng(43.522049, 16.470744),
            LatLng(brda1.latitude, brda1.longitude),
            ))


}

fun drawRoute9(googleMap: GoogleMap){
    var map = googleMap

    val polyline2 = map.addPolyline(
        PolylineOptions()
            .clickable(false)
            .add(
                LatLng(43.520506, 16.468052),
                LatLng(43.520047, 16.473041),
                LatLng(43.519923, 16.474210),
                LatLng(43.519705, 16.474532),
                LatLng(43.519409, 16.474521),
                LatLng(43.517190, 16.468505),
                LatLng(43.516638, 16.467961),
                LatLng(43.517828, 16.464581),
                LatLng(43.518046, 16.463165),
                LatLng(43.518062, 16.461802),
                LatLng(43.517735, 16.459785),
                LatLng(43.516669, 16.456620),
                LatLng(43.516366, 16.453916),
                LatLng(43.515790, 16.451867),
                LatLng(43.519641, 16.449319),
                LatLng(43.519139, 16.448386),
                LatLng(43.515451, 16.443912),
                LatLng(43.512487, 16.442292),
                LatLng(43.511367, 16.441530),
                LatLng(43.510993, 16.440983),
                LatLng(43.510207, 16.441283),
                LatLng(43.509355, 16.442157),
                LatLng(43.508985, 16.443230),
                LatLng(43.507861, 16.442484),
                LatLng(43.507631, 16.442393),
                LatLng(43.506962, 16.442404),
                LatLng(43.506970, 16.441267),
                LatLng(43.506775, 16.441117),
                LatLng(43.506557, 16.441208),
                LatLng(43.506448, 16.441508),
                LatLng(43.503234, 16.442930),
            ))

    map.addMarker(MarkerOptions().position(LatLng(43.520506, 16.468052)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.518531, 16.472048)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.516913, 16.468261)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.516952, 16.467295)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.518057, 16.463079)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.517995, 16.460847)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.516509, 16.455289)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.516034, 16.451673)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.519251, 16.448572)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.516016, 16.444538)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.512440, 16.442167)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.507336, 16.442355)).title("9"))
    map.addMarker(MarkerOptions().position(LatLng(43.503234, 16.442930)).title("9"))

}