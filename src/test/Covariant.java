package test;

class WildAnimal {
	public String willYouBite(){
		return "Yes";
	}
}
 
class Lion extends WildAnimal {
	public String whoAreYou() {
		return "Lion";
	}
}

class BengalTiger extends WildAnimal {
	public String whoAreYou() {
		return "Bengal Tiger";
	}
}
 
class Zoo {
     WildAnimal getWildAnimal() {
         return new WildAnimal();
     }
 }
 
class AfricaZoo extends Zoo {
     @Override
     Lion getWildAnimal() {
         return new Lion();
     }
}

class IndiaZoo extends Zoo {
     @Override
     BengalTiger getWildAnimal() {
         return new BengalTiger();
     }
}

public class Covariant {
	public static void main(String args[]){
		AfricaZoo afZoo = new AfricaZoo();
		System.out.println(afZoo.getWildAnimal().whoAreYou());
		IndiaZoo inZoo = new IndiaZoo();
		System.out.println(inZoo.getWildAnimal().whoAreYou());
	}
}