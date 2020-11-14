package com.saif.viewbindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.saif.viewbindingexample.databinding.ActivityMainListBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvUser.layoutManager = LinearLayoutManager(this)
        binding.rvUser.adapter = UserListAdapter(getUserList())

    }

    private fun getUserList(): List<User> {
        val userList = mutableListOf<User>()
        for (i in 1..20) {
            userList.add(User("Username $i", i))
        }
        return userList
    }
}

data class User(val username: String, val age: Int)