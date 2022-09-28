package org.turgut;

public class Main {

    enum PermissionLevel {
        ADMIN, DEVELOPER, USER;
    }

    public static class PermissionManager {
        private PermissionLevel mCurrentLevel = PermissionLevel.USER;

        public String getMCurrentLevel() {
            return switch (this.mCurrentLevel) {
                case USER -> "USER";
                case DEVELOPER -> "DEVELOPER";
                case ADMIN -> "ADMIN";
            };
        }

        public void setMCurrentLevel(PermissionLevel level) {
            this.mCurrentLevel = level;
        }
    }
}