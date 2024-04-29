package midterm.ani_loladze_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {

    public String toString() {
        String studentName = "Ani Loladze";
        return "Fantasy by " + studentName;
    }

    @Override
    public String methodHammer3(String argDoctor5) {
        // Example implementation
        return "methodHammer3 implementation with argument: " + argDoctor5;
    }

    @Override
    public List<String> methodCinema4(String argTopology6) {
        // Example implementation
        List<String> resultList = new ArrayList<>();
        resultList.add("methodCinema4 implementation with argument: " + argTopology6);
        return resultList;
    }

    @Override
    public String getTrain1() {
        // Example implementation
        return "getTrain1 implementation";
    }

    @Override
    public String getBatumi2() {
        // Example implementation
        return "getBatumi2 implementation";
    }
}
