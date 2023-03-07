package com.example.messengerapp.data.model

import com.example.messengerapp.data.bd.entity.Chat
import com.example.messengerapp.data.bd.entity.UserInfo

data class ChatWithUserInfo(
    var mChat: Chat,
    var mUserInfo: UserInfo
)