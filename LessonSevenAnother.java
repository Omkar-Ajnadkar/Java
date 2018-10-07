public class LessonSevenAnother{
    public static void main(String[] args) {
        LessonSeven Frank = new LessonSeven();
        Frank.name = "Frank";
        System.out.println(Frank.name);
        //Following line will give error...
        // System.out.println(Frank.attack);
    }
}