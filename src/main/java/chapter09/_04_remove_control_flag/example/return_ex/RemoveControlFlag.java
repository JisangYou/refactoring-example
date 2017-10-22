package chapter09._04_remove_control_flag.example.return_ex;

/**
 * Remove Control Flag (제어 플래그 제거)
 * <p>
 * 논리 연산식의 제어 플래그 역할을 하는 변수가 있을 땐
 * - 그 변수를 break문이나 return문으로 바꾸자
 */
public class RemoveControlFlag {
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private String foundMiscreant(String[] people) {
        for (String aPeople : people) {
            if (aPeople.equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (aPeople.equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void someLaterCode(String found) {
        System.out.println(found);
    }

    private void sendAlert() {
        System.out.println("alert");
    }
}
