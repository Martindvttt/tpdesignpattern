package ipi.tpdesignpattern2;

import java.util.List;
import java.util.stream.Collectors;

public class ClassificationTree implements DataProcessing {
    @Override
    public List<Data> process(List<Data> datas) {
        return datas.stream()
                .filter(data -> "PDF".equals(data.getFormat()))
                .collect(Collectors.toList());
    }
}


