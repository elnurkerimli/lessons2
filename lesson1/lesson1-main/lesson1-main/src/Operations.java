/**
 * @author ELNUR KARIMLI
 * PROJECT_NAME : threads
 */

public class Operations implements  Runnable{

    public Operations(String name) {
        this.name = name;
        System.out.println(name+"\sOperation Started");
    }

    String name;

    @Override
    public void run() {

        try {
            for (int i=5 ; i>0 ; i++) {
                System.out.println(this.name+":"+i);
            }
        }
        catch (Exception e){
                System.out.println(this.name+"Error Encountered !");
        }

        System.out.println(name+"\sTransaction Finished.");
    }
}
