package com.zhuangxv.miraiplus.component;

import net.mamoe.mirai.contact.Friend;

/**
 * @author xiaoxu
 * @date 2020-08-07 15:52
 */
public class FriendPlus {

    private final Friend friend;

    protected FriendPlus(Friend friend) {
        this.friend = friend;
    }

    public long getQQ() {
        return this.friend.getId();
    }

    public String getAvatarUrl() {
        return this.friend.getAvatarUrl();
    }

    public String getNick() {
        return this.friend.getNick();
    }

    public void sendMessage(MessagePlus messagePlus) {
        this.friend.sendMessage(messagePlus.getMessageChain());
    }

}
