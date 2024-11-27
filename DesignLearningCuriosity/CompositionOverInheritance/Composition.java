package DesignLearningCuriosity.CompositionOverInheritance;
// Now with the help of composition we can assign at runtime and requires and set whatever we want !
public class Composition {
    private class Animal{
        public String getAge() {
            return Age;
        }

        public void setAge(String age) {
            Age = age;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getWeight() {
            return Weight;
        }

        public void setWeight(String weight) {
            Weight = weight;
        }

        String Name;
        String Age;
        String Weight;
        boolean isEndangered;
    }

    public class UniqueCharacters {
        public String colour;
        String diet;
        String habitat;
        boolean isEndangered;

        public String getDiet() {
            return diet;
        }

        public void setDiet(String diet) {
            this.diet = diet;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public String getHabitat() {
            return habitat;
        }

        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        public boolean isEndangered() {
            return isEndangered;
        }

        public void setEndangered(boolean endangered) {
            isEndangered = endangered;
        }
    }

    public class lion  {
        private Animal animal;
        private UniqueCharacters uniqueCharacters;

       public lion(){
            animal = new Animal();
            uniqueCharacters = new UniqueCharacters();
            setChars();
        }

        void setChars(){
           animal.setAge("15");
           uniqueCharacters.setColour("Green");
        }
    }


    private class tiger extends Animal {
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getHabitat() {
            return habitat;
        }

        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        public String getDiet() {
            return diet;
        }

        public void setDiet(String diet) {
            this.diet = diet;
        }

        private String color;
        private String habitat;
        private String diet;
    }
}
