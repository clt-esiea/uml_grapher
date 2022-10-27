package fr.lernejo.umlgrapher;

public class UmlGraph {
    private final Class[] newClass;
    public UmlGraph(Class... newClass) {
        this.newClass = newClass;
    }
    public String as(GraphType graphType) {
        String resultGraph = "diagram";
            for (Class count : newClass) {
                switch (graphType) {
                    case MERMAID:
                        resultGraph+=" class "+count.getSimpleName()+"{";
                        if(count.isInterface()) {
                            resultGraph+="<<interface>>\n";
                        }
                        resultGraph+="}\n";
                        break;
                }
            }
            return resultGraph;
    }
}
