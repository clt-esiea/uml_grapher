package fr.lernejo.umlgrapher;

public class UmlGraph {
    public UmlGraph(Class elementClass) {

    }
    public String as(GraphType graphType) {
        return """
        classDiagram
        class Machin {
            <<interface>>
        }
        """;
    }
}
