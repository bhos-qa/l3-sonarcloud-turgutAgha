package org.turgut;

public class Main {

    enum PermissionLevel {
        ADMIN,
        DEVELOPER,
        USER
    }

    ;

    public static class PermissionManager {
        private PermissionLevel mCurrentLevel = PermissionLevel.USER;

        public String getMCurrentLevel() {
            switch (this.mCurrentLevel) {
                case USER:
                    return "USER";
                case ADMIN:
                    return "ADMIN";
                case DEVELOPER:
                    return "DEVELOPER";
                default:
                    return null;
            }

        }

        public void setMCurrentLevel(PermissionLevel level) {
            this.mCurrentLevel = level;
        }
    }

    public static void main(String[] args) {
        PermissionManager pm = new PermissionManager();
        System.out.println(pm.getMCurrentLevel());
        pm.setMCurrentLevel(PermissionLevel.ADMIN);
        System.out.println(pm.getMCurrentLevel());
    }
}