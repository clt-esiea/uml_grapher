package fr.lernejo.umlgrapher;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import java.util.concurrent.Callable;

@Command(name = "Launcher", mixinStandardHelpOptions = true)
class Launcher implements Callable<Integer> {

    @Option(names = {"-c", "--classes"}, description = "Renseigner les classes d'où faire partir l'analyse !")
    private final Class<?>[] initClasses = {};

    @Option(names = {"-g", "--graph-type"}, description = "Sélectionner le type de graph que l'on souhaite en sortie !")
    private final GraphType graphType = GraphType.Mermaid;
    @Override
    public Integer call() throws Exception {
        UmlGraph newGraph = new UmlGraph(initClasses);
        String output = newGraph.as(graphType);
        System.out.println(output);
        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new Launcher()).execute(args);
        System.exit(exitCode);
    }
}
