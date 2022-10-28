package fr.lernejo;

import fr.lernejo.umlgrapher.GraphType;
import fr.lernejo.umlgrapher.UmlGraph;
import fr.lernejo.umlgrapher.Launcher;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UmlGraphTests {
    @Test
    void empty_interface_with_no_relation() {
        UmlGraph graph = new UmlGraph(Machin.class);
        String output = graph.as(GraphType.Mermaid);

        Assertions.assertThat(output).isEqualTo("""
            classDiagram
            class Machin {
                <<interface>>
            }
            """);
    }
    @Test
    void test_the_launcher() {
        new Launcher();
    }

    interface Machin {
    }
}
