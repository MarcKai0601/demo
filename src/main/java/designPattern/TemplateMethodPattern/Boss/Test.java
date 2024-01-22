package designPattern.TemplateMethodPattern.Boss;

public class Test {
    @org.junit.Test
    public void test(){
        SoftwareManager softwareManager = new SoftwareManager();

        softwareManager.completeSoftware();

        softwareManager.redoSoftware();
    }
}
