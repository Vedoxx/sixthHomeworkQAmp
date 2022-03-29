import java.util.Scanner;

public abstract class Animal {
    Scanner input = new Scanner(System.in);
    private float size;
    private String animalFamily;
    private String animalSubFamily;
    private String animalSpecie;
    private String animalSubSpecies;
    private String animalHabitat;
    private String animalSex;

    private void setAnimalFamily(String animalFamily) {
        this.animalFamily = animalFamily;
    }

    private String getAnimalFamily() {
        return this.animalFamily;
    }

    private void setAnimalSubFamily(String subFamily) {
        this.animalSubFamily = subFamily;
    }

    private String getAnimalSubFamily() {
        return animalSubFamily;
    }

    protected void setAnimalSpecie(String animalSpecie) {
        this.animalSpecie = animalSpecie;
    }

    protected String getAnimalSpecie() {
        return this.animalSpecie;
    }

    protected void setAnimalSubSpecies(String subSpecies) {
        this.animalSubSpecies = subSpecies;
    }

    protected String getAnimalSubSpecies() {
        return this.animalSubSpecies;
    }

    protected void setAnimalHabitat(String animalHabitat) {
        this.animalHabitat = this.animalHabitat;
    }

    protected String getAnimalHabitat() {
        return this.animalHabitat;
    }

    protected void setAnimalSex(String animalSex) {
        this.animalSex = animalSex;
    }

    protected String getAnimalSex() {
        return this.animalSex;
    }

    protected void setAnimalSize(int animalSize) {
        this.size = animalSize;
    }

    ;

    protected float getAnimalSize() {
        return this.size;
    }

    //abstract method
    public abstract void animalNoise();

    //method not available for child classes
    private void setAnimalInformation() {
        System.out.println("Enter animal family:");
        String animalFamily = input.next();
        this.setAnimalFamily(animalFamily);
        System.out.println("Enter animal subfamily");
        String animalsubFamily = input.next();
        this.setAnimalSubSpecies(animalSubSpecies);
    }

    protected void setDetailedAnimalInformation() {
        System.out.print("Enter animal specie:");
        String animalSpecie = input.next();
        this.setAnimalSpecie(animalSpecie);
        System.out.print("Enter animal subspecie:");
        String animalSubspecie = input.next();
        this.setAnimalSubSpecies(animalSubspecie);
        System.out.print("Enter animal habitat:");
        String habitat = input.next();
        this.setAnimalHabitat(habitat);
        System.out.println("Enter animal sex:");
        String animalSex = input.next();
        this.setAnimalSex(animalSex);
    }

    protected void getDetailedAnimalInformation() {
        System.out.println("Animal detailed information:");
        System.out.println("Specie:" + getAnimalSpecie());
        System.out.println("Subspecie:" + getAnimalSubSpecies());
        System.out.println("Habitat:" + getAnimalHabitat());
        System.out.println("Sex:" + getAnimalSex());
    }
}
