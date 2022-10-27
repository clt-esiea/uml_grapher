package fr.lernejo.umlgrapher;

public class UmlGraph {
    private final Class[] newClass;
    public UmlGraph(Class... newClass) {
        this.newClass = newClass;
    }
    public String as(GraphType graphType) {
        String resultGraph = "classDiagram\n";
            for (Class count : newClass) {
                switch(graphType) {
                    case Mermaid:
                        resultGraph=resultGraph+"class "+count.getSimpleName()+" {\n";

                        if(count.isInterface()) {

                            resultGraph=resultGraph+"    <<interface>>\n";
                        }
                        resultGraph=resultGraph+"}\n";

                        break;
                }
            }
            return resultGraph;
    }
}
