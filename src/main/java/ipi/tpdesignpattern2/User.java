package ipi.tpdesignpattern2;
import java.util.Arrays;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<Data> cvList = Arrays.asList(
                new Data("Text", "CV 1 technicien informatique"),
                new Data("PDF", "CV 2 ingénieur études et développement"),
                new Data("Word", "CV 3 testeur logiciel"),
                new Data("PDF", "CV 4 chercheur en biologie")
        );

        RecruitmentView recruitmentView = new RecruitmentView(cvList);

        recruitmentView.setStrategy(new KMeansPartitioning());
        System.out.println("Application de l'algorithme de partitionnement en Kmoyennes sur les données");
        System.out.println(recruitmentView.analyze());

        recruitmentView.setStrategy(new LinearRegression());
        System.out.println("Application de l'algorithme de regression linéaire sur les données");
        System.out.println(recruitmentView.analyze());

        recruitmentView.setStrategy(new ClassificationTree());
        System.out.println("Application de l'algorithme des arbres de classification sur les données");
        System.out.println(recruitmentView.analyze());
    }
}
