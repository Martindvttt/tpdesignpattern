package ipi.tpdesignpattern2;

import java.util.List;
import java.util.stream.Collectors;

public class LinearRegression implements DataProcessing {
    @Override
    public List<Data> process(List<Data> datas) {
        return datas.stream()
                .filter(data -> data.getContent().contains("CV 1") || data.getContent().contains("CV 5"))
                .collect(Collectors.toList());
    }
}
