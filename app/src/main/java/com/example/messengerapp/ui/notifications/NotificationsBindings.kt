package com.example.messengerapp.ui.notifications

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerapp.data.bd.entity.UserInfo
import com.fredrikbogg.android_chat_app.ui.notifications.NotificationsListAdapter


@BindingAdapter("bind_notifications_list")
fun bindNotificationsList(listView: RecyclerView, items: List<UserInfo>?) {
    items?.let { (listView.adapter as NotificationsListAdapter).submitList(items) }
}
