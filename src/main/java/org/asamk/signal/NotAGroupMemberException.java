package org.asamk.signal;

import org.freedesktop.dbus.exceptions.DBusExecutionException;

public class NotAGroupMemberException extends DBusExecutionException {

    public NotAGroupMemberException(String message) {
        super(message);
    }

    public NotAGroupMemberException(byte[] groupId, String groupName) {
        super("User is not a member in group: " + groupName + " (" + Base64.encodeBytes(groupId) + ")");
    }
}
