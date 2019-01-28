import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public List<String> buildString() {
        String a = "abcdefghigklmnopqrstuvwxyz";
        List<String> s = new ArrayList<>();

        for (int i = 0; i < 999999; i++) {
            StringBuilder ss = new StringBuilder();
            int redom = (int) (1 + Math.random() * 25);
            for (int j = 0; j < redom; j++) {
                int redoms = (int) (1 + Math.random() * 25);
                ss.append(a.charAt(redoms));
            }
            s.add(ss.toString());
        }
        return s;
    }

    public List<String> tryStringBuilder(List<String> s) {

        StringBuilder builder = new StringBuilder();
        List<String> builders = new ArrayList<>();
        long times = System.currentTimeMillis();
        for (String value : s) {
            builder.append(value).append("|");
        }
        int n = builder.length() / 3800;
        if (n == 0) {
            builders.add(builder.toString());
            return builders;
        } else {
            int q = 0;
            int j = 3800;
            while (q != builder.length() - 1) {
                if (builder.charAt(j) == '|') {
                    builders.add(builder.substring(q, j));
                    q = j;
                    if (j + 3800 < builder.length()) {
                        j = j + 3800;
                    } else {
                        j = builder.length()-1;
                    }
                } else {
                    j--;
                }
            }
            System.out.println(System.currentTimeMillis() - times);
            return builders;
        }
    }


    public List<StringBuilder> tryStringBuilder2(List<String> s) {

        StringBuilder builder = new StringBuilder();
        List<StringBuilder> builders = new ArrayList<>();

        long times = System.currentTimeMillis();

        for (int i = 0; i < s.size(); i++) {

            if (builder.length() + s.get(i).length() + 1 <= 3800) {
                builder.append(s.get(i));
                builder.append("|");
            } else {
                builders.add(builder);
                builder = new StringBuilder("|");
                builder.append(s.get(i));
                builder.append("|");
            }
        }
        builders.add(builder);

        System.out.println(System.currentTimeMillis() - times);

        return builders;
    }


    public List<StringBuilder> tryStringBuilder3(List<String> s) {
        List<StringBuilder> builders = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        long times = System.currentTimeMillis();
        for (String temp : s) {
            stringBuilder.append(temp).append("|");
        }
        if (stringBuilder.length() <= 3800) {
            builders.add(stringBuilder);
            System.out.println(System.currentTimeMillis() - times);
            return builders;
        }

        String totalString = stringBuilder.toString();

        while (totalString.length() > 3800) {
            String blockString = totalString.substring(0, 3800);
            totalString = totalString.substring(3800);
            int lastIndex = blockString.lastIndexOf("|");
            String resultString = blockString.substring(0, lastIndex);
            String tailString = blockString.substring(lastIndex, 3800);
            totalString = tailString + totalString;
            builders.add(new StringBuilder(resultString));
            //System.out.println("===========>" + totalString);
        }
        System.out.println(System.currentTimeMillis() - times);
        return builders;
    }


    public static void main(String args[]) {
        TestClass tc = new TestClass();
        List<String> buildString =tc.buildString();
        List<StringBuilder> list2 = tc.tryStringBuilder2(buildString);
        List<StringBuilder> list3 = tc.tryStringBuilder3(buildString);
    }
}
