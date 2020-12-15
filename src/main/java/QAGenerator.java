import java.util.*;

public class QAGenerator {
    public Map<Question, Answer> qaMap;

    //create new hashmap of 10 Qs wiht arraylist of answer options when object is made
    public QAGenerator(Map<Question, Answer> qaMap) {
        this.qaMap = qaMap;
        qaMap.put(new Question("Q1: Herbs good for longterm gentle treatment\n have higher amounts of which constituents?\n"), new Answer("A- Carbs, lipids, amino acids", "B- Alkaloids, terpenoids, saponins", "C- Vitamins, minerals, terpenoids", "D- Fiber, natural latex, dirt"));
        qaMap.put(new Question("Q2: Herbs with quicker and strong action\n have higher amounts of which constituents?\n"), new Answer("A- Carbs, lipids, amino acids", "B- Vitamins, minerals, terpenoids", "C- Alkaloids, terpenoids, saponins", "D- Lipids, fiber, alkaloids"));
        qaMap.put(new Question("Q3: Which herb would be most unpleasant in a tea?\n"), new Answer("A- Mimosa flower", "B- Gum guggul", "C- Peppermint", "D- Astragalus"));
        qaMap.put(new Question("Q4: Which herb not only alleviates symptoms of depression,\n but actually lifts the mood?\n This herb is not recommended for bipolar disorder.\n"), new Answer("A- St. John’s Wort", "B- Atractylodes", "C- Mimosa Bark", "D- SamE"));
        qaMap.put(new Question("Q5: Which herb is generally safe for all ages for:\n intestinal cramping, tension, and headaches?\n It is also a refreshing beverage.\n"), new Answer("A- Chamomile", "B- Calendula", "C- Baikal Scullcap", "D- Peppermint"));
        qaMap.put(new Question("Q6: What is hormesis?\n"), new Answer("A- A fancy way of saying making little nudges across many parts of the body to bring healing", "B- An herb used to clear damp spleen", "C- The last name of the father of modern medicine", "D- A small town in Greece known for its production of high quality oregano tinctures and spearmint teas"));
        qaMap.put(new Question("Q7: Which ancient Arab physician studied quarantine, testing,\n and on the money, he could sure help us out in 2020?\n"), new Answer("A- Moses Maimonides", "B- Muhammad Ibn Zakariya' al-Razi", "C- Dioscorides", "D- Ibn Sinna"));
        qaMap.put(new Question("Q8: Which combination of 3 fruits is good for diabetes, soothes inflammation,\n speeds up constipation, and slows down diarrhea for your standing ovation?\n"), new Answer("A- Trikatu", "B- Triphala", "C- Gymnema", "D- Chai Hu"));
        qaMap.put(new Question("Q9: Which common early spring and fall weed is full of:\n calcium, potassium, iron and other minerals?\n This herb is great in salad and pesto.\n"), new Answer("A- Mugwort", "B- Bee Balm", "C- Chickweed", "D- Dandelion"));
        qaMap.put(new Question("Q10: There is some recent research that suggests plants may have a sense of:\n"), new Answer("A- Smell", "B- Your mood", "C- Taste", "D- When it’s dinner time"));
    }

    //generate random key-value pair for questions
    public String generateRandomQ() {
        Object[] randomQAPair = qaMap.keySet().toArray();
        Object random = randomQAPair[new Random().nextInt(randomQAPair.length)];
        String newStr = random + "\n" + qaMap.get(random);
        qaMap.remove(random);
        return newStr;
    }
}
