package com.example.gggsapplication.RentALawn

data class LawnListing(var address : String ?= null, var availableHours : String ?= null,
                       var price : String ?= null, var email : String ?= null,
                       var phone : String ?= null, var visibility : Boolean = false)
