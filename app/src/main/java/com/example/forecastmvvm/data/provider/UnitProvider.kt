package com.example.forecastmvvm.data.provider

import com.example.forecastmvvm.internal.UnitSystem

interface UnitProvider{
    fun getUnitSystem(): UnitSystem
}