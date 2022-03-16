public class Cat extends Animal{
 private int catIQ;
 Cat(int size,String Specie,String animalSubSpecies, String animalHabitat,boolean isExtinct,String animalSex){
     this.setAnimalSize(size);
     this.setAnimalSpecie(Specie);
     this.setAnimalSubSpecies(animalSubSpecies);
     this.setAnimalHabitat(animalHabitat);
     this.setAnimalSex(animalSex);
 }
    public Cat(int size, String animalSex) {
        super();
    }
    @Override
    public void animalNoise() {
        System.out.println("Cat  goes Mjaau");
    }
    public void setCatIQ() {
        System.out.println("Enter the IQ of the cat:");
        this.catIQ= object.nextInt();
    }
    public int getCatIQ(){
        return this.catIQ;
    }
}
