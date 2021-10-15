package bridge;

public abstract class Student {
    protected ToStudy study;

    protected Student(ToStudy study){
        this.study = study;
    }

    public abstract void study();
}
