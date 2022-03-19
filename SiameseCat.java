public class SiameseCat extends Cat {
    boolean clawTrimmed=false;
    SiameseCat(int size, String animalSex) {
        super(size, animalSex);
        this.setAnimalSize(size);
        this.setAnimalSex(animalSex);
    }
   public boolean clawsTrimeed(){
       System.out.println("Are the claws trimmed?(y/n)");
       char answer=object.next().charAt(0);
       if(answer=='y'){
          return  this.clawTrimmed=true;
       }
       else
       return this.clawTrimmed=false;
   }
   public void areClawsTrimmed(){
        if(this.clawTrimmed){
            System.out.println("Claws are trimmed");
   }
        else{
            System.out.println("Claws are not trimmed");
        }
}
    }
