package _08_templatePattern.simpleWithHook.entity;

public abstract class CaffeineBeverageWithHook {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater(){
        System.out.println("Boiling water");
    }

    private void pourInCup(){
        System.out.println("Pouring into cup");
    }

    private boolean customerWantsCondiments(){
        return true;
    }
}
