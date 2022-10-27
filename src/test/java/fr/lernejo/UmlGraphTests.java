package fr.lernejo;

import fr.lernejo.umlgrapher.GraphType;
import fr.lernejo.umlgrapher.UmlGraph;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UmlGraphTests {
    @Test
    void empty_interface_with_no_relation() {
        //UmlGraph graph = new UmlGraph(Machin.class);
        Class[] machinClass = new Class[]{Machin.class};
        //UmlGraph graph = new UmlGraph(Machin.class);
        UmlGraph graph = new UmlGraph(machinClass);
        String output = graph.as(GraphType.Mermaid);

        Assertions.assertThat(output).isEqualTo("""
            classDiagram
            class Machin {
                <<interface>>
            }
            """);
    }

    interface Machin {
    }
}
