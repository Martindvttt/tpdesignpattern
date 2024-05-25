package ipi.tpdesignpattern2;
import java.util.List;

public class RecruitmentView {
    private List<Data> datas;
    private DataProcessing strategy;

    public RecruitmentView(List<Data> datas) {
        this.datas = datas;
    }

    public void setStrategy(DataProcessing strategy) {
        this.strategy = strategy;
    }

    public List<Data> analyze() {
        return strategy.process(datas);
    }
}
