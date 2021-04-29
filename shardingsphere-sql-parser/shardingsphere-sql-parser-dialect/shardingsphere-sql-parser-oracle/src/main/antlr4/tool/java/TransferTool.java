import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class TransferTool {
    public static void main(String[] args) throws Exception {
        String in = "shardingsphere-sql-parser/shardingsphere-sql-parser-dialect/shardingsphere-sql-parser-oracle/src/main/antlr4/tool/files/oracle.rule";
        String out = "shardingsphere-sql-parser/shardingsphere-sql-parser-dialect/shardingsphere-sql-parser-oracle/src/main/antlr4/tool/files/g4.rule";
        Path inputPath = new File(in).toPath();
        CharStream input = CharStreams.fromPath(inputPath);
        TransferRuleLexer lexer = new TransferRuleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TransferRuleParser parser = new TransferRuleParser(tokens);
        ParseTree tree = parser.sentences();
        ParseTreeWalker walker = new ParseTreeWalker();
        File outputFile = new File(out);
        try {
            FileWriter writer = new FileWriter(outputFile, true);
            TransferRuleImplListener listener = new TransferRuleImplListener(writer);
            walker.walk(listener, tree);
            writer.write(listener.getG4Rule(tree));
            writer.write("\n");
            writer.flush();
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
