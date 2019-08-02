package com.czxy.domain;

import java.util.List;

/**
 * @author
 * @infos 你要做什么
 * @date 2019/7/31
 */
public class ContactsVo {

    private Contacts contactsShow;
    private Chat chat;
    private List<Chat> chatList;

    @Override
    public String toString() {
        return "ContactsVo{" +
                "contactsShow=" + contactsShow +
                ", chat=" + chat +
                ", chatList=" + chatList +
                '}';
    }

    public Contacts getContactsShow() {
        return contactsShow;
    }

    public void setContactsShow(Contacts contactsShow) {
        this.contactsShow = contactsShow;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public List<Chat> getChatList() {
        return chatList;
    }

    public void setChatList(List<Chat> chatList) {
        this.chatList = chatList;
    }

    public ContactsVo() {
    }

    public ContactsVo(Contacts contactsShow, Chat chat, List<Chat> chatList) {
        this.contactsShow = contactsShow;
        this.chat = chat;
        this.chatList = chatList;
    }
}
