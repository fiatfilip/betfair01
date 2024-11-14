package ro.siit.java8;

public class SwitchCase {
    private BlogRole role;
    public static void main(String[] args) {

        SwitchCase switchCase = new SwitchCase();
        switchCase.role = BlogRole.USER;
        System.out.println(switchCase.role.listRoles());
        //System.out.println(switchCase.role.name());

        BlogRole currentRole = BlogRole.EDITOR;
        switch (currentRole) {
            case ADMIN:
                System.out.println("R");
                System.out.println("W");
                System.out.println("X");
                break;
            case EDITOR:
                System.out.println("R");
                System.out.println("W");
                break;
            case USER:
                System.out.println("R");
                break;

        }

        switch (currentRole) {
            case ADMIN:
                System.out.println("X");
            case EDITOR:
                System.out.println("W");
            case USER:
                System.out.println("R");
        }

        System.out.println(
                switch(currentRole){
                    case ADMIN -> "RWX";
                    case EDITOR -> "RW";
                    case USER -> "R";
                }
        );
    }
}
