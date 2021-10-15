package bridge;

public class JavaStudy implements ToStudy{
    @Override
    public void studyTechnology(String technology) {
        System.out.println(String.format("Study Java + technology: %s", technology));
    }
}
