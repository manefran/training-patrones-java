package bridge;

public class DevStudent extends Student{

    public DevStudent(ToStudy study){
        super(study);
    }

    @Override
    public void study() {
        study.studyTechnology("SQL");
    }
}
