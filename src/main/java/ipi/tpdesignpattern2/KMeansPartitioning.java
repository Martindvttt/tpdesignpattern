package ipi.tpdesignpattern2;

import java.util.List;
import java.util.stream.Collectors;

public class KMeansPartitioning implements DataProcessing {
    @Override
    public List<Data> process(List<Data> datas) {
        return datas.stream()
                .filter(data -> data.getContent().contains("informatique"))
                .collect(Collectors.toList());
    }
}
