package chapter4;
@FunctionalInterface
public interface Child {

    void eat();
   // void laugh();

    default void cry(){
        System.out.println("crying ...");
    }


}
