package com.saif.viewbindingexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saif.viewbindingexample.databinding.UserItemBinding

class UserListAdapter(private val userList: List<User>) :
        RecyclerView.Adapter<UserListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListAdapter.ViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserListAdapter.ViewHolder, position: Int) {
        val user = userList[position]
        holder.itemBinding.tvUserItem1.text = user.username
        holder.itemBinding.tvUserItem2.text = user.age.toString()
    }

    override fun getItemCount() = userList.size

    class ViewHolder(val itemBinding: UserItemBinding) : RecyclerView.ViewHolder(itemBinding.root)
}