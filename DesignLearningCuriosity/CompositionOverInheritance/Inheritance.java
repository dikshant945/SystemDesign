package DesignLearningCuriosity.CompositionOverInheritance;
// If I Want to add anything to Animal like is Endangered than i hve to update to all millions of subclasses even if 1 class is true !
public class Inheritance {

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

    private class lion extends Animal{
        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public String getDiet() {
            return diet;
        }

        public void setDiet(String diet) {
            this.diet = diet;
        }


        private String colour;
        private String diet;
    }


    private class tiger extends Animal{
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
