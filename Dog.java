public class Dog extends Animal {
    boolean isDogLoud=true;
    Dog(int size,String animalSpecie, String animalSubSpecies, String animalHabitat,boolean isExtinct,String animalSex){
        this.setAnimalSize(size);
        this.setAnimalSpecie(animalSpecie);
        this.setAnimalSubSpecies(animalSubSpecies);
        this.setAnimalHabitat(animalHabitat);
        this.setAnimalSex(animalSex);
    }
    public boolean DogLoud() {
        System.out.println("Is the dog loud?(y/n)");
        char answer=object.next().charAt(0);
        if(answer=='y'){
            System.out.println("Dog is quite loud");
           return this.isDogLoud=true;
        }
        else
            return this.isDogLoud=false;
    }
    public void isDogLoud(){
        if(isDogLoud){
            System.out.println("Dog is quite loud");
        }
        else{
            System.out.println("Dog is quiet");
        }
    }
public void animalNoise(){
    System.out.println("Dog goes Wuuf");
}
}
