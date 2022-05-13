package com.google.firebase.quickstart.auth.viewmodelfull

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private var firstName : String = ""
    private var lastName : String = ""
    private var first : String = ""
    private var last: String = ""

    fun setFirstName(value: String) {
        this.firstName = value
        first = value
    }
    fun getFirstName() : String? {
        return first
    }

    fun setLastName(value: String)
    {
        this.lastName = value
        last = value

    }
    fun getLastName() : String?
    {
        return last
    }

}