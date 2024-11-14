package ro.siit.java8;

import java.util.ArrayList;
import java.util.Collections;

public enum BlogRole {
    ADMIN, EDITOR, USER;

    public String listRoles() {
        var sb = new StringBuffer();
        for (var role : BlogRole.values()) {
            sb.append(role.name() + ", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
