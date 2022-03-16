import java.util.Scanner;

public class main {
    static Scanner object=new Scanner(System.in);
    public static void main(String[] args) {
       Cat cat=new Cat( 2,"Tiger","Bengal","forest",false,"male");
       Dog dog=new Dog(3,"Wolf","Japanese wolf","forest",true,"female");
       SiameseCat siameseCat=new SiameseCat(2,"male");
        String[] animalMenu ={"Cat","Siamese cat","Dog"};
        for(int i=0;i<animalMenu.length;i++){
            System.out.println(i+1+"="+animalMenu[i]);
        }
        System.out.print("Answer:");
        int answer=object.nextInt();
        if(answer==1){
            cat.animalNoise(); // abstract method of parent class Animal
            cat.setDetailedAnimalInformation(); // method from parent class Animal
            cat.setCatIQ(); // method from child class  cat
            cat.getDetailedAnimalInformation();// method from parent class Animal
            System.out.println("IQ:"+cat.getCatIQ());
        }
        if(answer==2){
            siameseCat.clawsTrimeed();//method from child class siamesecat
            siameseCat.areClawsTrimmed();//method from child class siamesecat

        }
        if(answer==3){
            dog.animalNoise(); // abstract method of parent class Animal
            dog.setDetailedAnimalInformation(); // method from parent class Animal
            dog.DogLoud(); // method from child class dog
            dog.getDetailedAnimalInformation();// method from parent class Animal
            dog.isDogLoud();// method from child class dog
        }
    }
}
