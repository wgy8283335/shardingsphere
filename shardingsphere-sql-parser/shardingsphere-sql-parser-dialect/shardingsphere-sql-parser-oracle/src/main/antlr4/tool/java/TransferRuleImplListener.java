import com.google.common.base.Strings;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransferRuleImplListener extends TransferRuleBaseListener{
    
    private FileWriter writer;

    private ParseTreeProperty<String> parseTreeProperty;
    
    public String getProperty(ParseTree ctx) { return parseTreeProperty.get(ctx); }
    
    public void setProperty(ParseTree ctx, String s) { parseTreeProperty.put(ctx, s); }
    
    public TransferRuleImplListener(final FileWriter writer) {
        this.writer = writer;
        this.parseTreeProperty = new ParseTreeProperty<String>();
    }
    
    public String getG4Rule(ParseTree ctx) {
        String g4Rule = parseTreeProperty.get(ctx);
        Pattern pattern = Pattern.compile("\\s\\s+"); //去掉空格符合换行符     
        Matcher matcher = pattern.matcher(g4Rule);
        String result = matcher.replaceAll(" ");
        return result;
    }
    
    @Override public void exitSentences(final TransferRuleParser.SentencesContext ctx) {
        StringBuilder buf = new StringBuilder();
        for (TransferRuleParser.RulesContext rulesContext : ctx.rules()) {
            buf.append(getProperty(rulesContext));
        }
        if (ctx.SEMI_()!=null && !Strings.isNullOrEmpty(ctx.SEMI_().getText())) {
            buf.append(ctx.SEMI_().getText());
        }
        setProperty(ctx, buf.toString());
    }

    @Override public void exitIdentifierRule(final TransferRuleParser.IdentifierRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        for(int i = 0; i< ctx.identifiers().getChildCount(); i++) {
            String temp = ctx.identifiers().getChild(i).getText();
            if (".".equals(temp)) {
                buf.append(" DOT_ ");
            } else {
                buf.append(underline2Camel(temp));
            }
        }
        buf.append(" ");
        setProperty(ctx, buf.toString());
    }

    @Override public void exitKeywordsRule(final TransferRuleParser.KeywordsRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append(ctx.keyWords().getChild(0).getText());
        for (TerminalNode node : ctx.keyWords().KEYWORD_().subList(1, ctx.keyWords().KEYWORD_().size())) {
            buf.append(" ");
            buf.append(node.getText());
        }
        buf.append(" ");
        setProperty(ctx, buf.toString());
    }

    @Override public void exitSQRule(final TransferRuleParser.SQRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        if (ctx.SQ_()!=null && ctx.SQ_().get(0)!=null && !Strings.isNullOrEmpty(ctx.SQ_().get(0).getText())) {
            buf.append(" SQ_ ");
        }
        buf.append(getProperty(ctx.rules()));
        if (ctx.SQ_()!=null && ctx.SQ_().get(1)!=null && !Strings.isNullOrEmpty(ctx.SQ_().get(1).getText())) {
            buf.append(" SQ_ ");
        }
        setProperty(ctx, buf.toString());
    }

    @Override public void exitLBERule(final TransferRuleParser.LBERuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append(" (");
        if (ctx.COMMA_()!=null && !Strings.isNullOrEmpty(ctx.COMMA_().getText())) {
            buf.append("COMMA_");
        }
        buf.append(getProperty(ctx.rules().get(0)));
        for (TransferRuleParser.RulesContext rulesContext : ctx.rules().subList(1,ctx.rules().size())) {
            buf.append(" | ");
            buf.append(getProperty(rulesContext));
        }
        buf.append(") ");
        setProperty(ctx, buf.toString());
    }

    @Override public void exitLBEMultiRule(final TransferRuleParser.LBEMultiRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append(" (");
        if (ctx.COMMA_()!=null && !Strings.isNullOrEmpty(ctx.COMMA_().getText())) {
            buf.append("COMMA_");
        }
        buf.append(getProperty(ctx.rules().get(0)));
        for (TransferRuleParser.RulesContext rulesContext : ctx.rules().subList(1,ctx.rules().size())) {
            buf.append(" | ");
            buf.append(getProperty(rulesContext));
        }
        buf.append(")+ ");
        setProperty(ctx, buf.toString());
    }

    @Override public void exitLBTMultiRule(final TransferRuleParser.LBTMultiRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append(" (");
        if (ctx.COMMA_()!=null && !Strings.isNullOrEmpty(ctx.COMMA_().getText())) {
            buf.append("COMMA_");
        }
        buf.append(getProperty(ctx.rules().get(0)));
        for (TransferRuleParser.RulesContext rulesContext : ctx.rules().subList(1,ctx.rules().size())) {
            buf.append(" | ");
            buf.append(getProperty(rulesContext));
        }
        buf.append(")* ");
        setProperty(ctx, buf.toString());
    }
    @Override public void exitLBTRule(final TransferRuleParser.LBTRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append(" (");
        if (ctx.COMMA_()!=null && !Strings.isNullOrEmpty(ctx.COMMA_().getText())) {
            buf.append("COMMA_");
        }
        buf.append(getProperty(ctx.rules().get(0)));
        for (TransferRuleParser.RulesContext rulesContext : ctx.rules().subList(1,ctx.rules().size())) {
            buf.append(" | ");
            buf.append(getProperty(rulesContext));
        }
        buf.append(")? ");
        setProperty(ctx, buf.toString());
    }

    @Override public void exitLPRule(final TransferRuleParser.LPRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append(" LP_(");
        if (ctx.COMMA_()!=null && !Strings.isNullOrEmpty(ctx.COMMA_().getText())) {
            buf.append("COMMA_");
        }
        buf.append(getProperty(ctx.rules().get(0)));
        for (TransferRuleParser.RulesContext rulesContext : ctx.rules().subList(1,ctx.rules().size())) {
            buf.append(" | ");
            buf.append(getProperty(rulesContext));
        }
        buf.append(")RP_ ");
        setProperty(ctx, buf.toString());
    }

    @Override public void exitATRule(final TransferRuleParser.ATRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("AT_ ");
        buf.append(getProperty(ctx.rules()));
        setProperty(ctx, buf.toString());
    }

    @Override public void exitEqualRule(final TransferRuleParser.EqualRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append(getProperty(ctx.rules().get(0)));
        for (TransferRuleParser.RulesContext rulesContext : ctx.rules().subList(1,ctx.rules().size())) {
            if(ctx.EQ_().size()>0 && !Strings.isNullOrEmpty(ctx.EQ_().get(0).getText())) {
                buf.append(" EQ_ ");
            }
            buf.append(getProperty(rulesContext));
        }
        setProperty(ctx, buf.toString());
    }

    @Override public void exitVERTICALRule(final TransferRuleParser.VERTICALRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append(" | ");
        buf.append(getProperty(ctx.rules()));
        setProperty(ctx, buf.toString());
    }

    @Override public void exitSymbolRule(final TransferRuleParser.SymbolRuleContext ctx) {
        StringBuilder buf = new StringBuilder();
        if (ctx.SQ_()!=null && ctx.SQ_().get(0)!=null && !Strings.isNullOrEmpty(ctx.SQ_().get(0).getText())) {
            buf.append(" SQ_ ");
        }
        buf.append(translateSymbol(ctx.children.get(1)));
        if (ctx.SQ_()!=null && ctx.SQ_().get(1)!=null && !Strings.isNullOrEmpty(ctx.SQ_().get(1).getText())) {
            buf.append(" SQ_ ");
        }
        setProperty(ctx, buf.toString());
    }

    private void write(String text) {
        try {
            writer.append(text);
            writer.append(' ');
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private String underline2Camel(String line, boolean ... firstIsUpperCase) {
        String str = "";
        if(line.isEmpty()){
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            String [] strArr;
            // 不包含下划线，且第二个参数是空的
            if(!line.contains("_") && firstIsUpperCase.length == 0){
                sb.append(line.substring(0, 1).toLowerCase()).append(line.substring(1));
                str = sb.toString();
            } else if (!line.contains("_") && firstIsUpperCase.length != 0){
                if (!firstIsUpperCase[0]) {
                    sb.append(line.substring(0, 1).toLowerCase()).append(line.substring(1));
                    str = sb.toString();
                } else {
                    sb.append(line.substring(0, 1).toUpperCase()).append(line.substring(1));
                    str = sb.toString();
                }
            } else if (line.contains("_") && firstIsUpperCase.length == 0) {
                strArr = line.split("_");
                for (String s : strArr) {
                    sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
                }
                str = sb.toString();
                str = str.substring(0, 1).toLowerCase() + str.substring(1);
            } else if (line.contains("_") && firstIsUpperCase.length != 0) {
                strArr = line.split("_");
                for (String s : strArr) {
                    sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
                }
                if (!firstIsUpperCase[0]) {
                    str = sb.toString();
                    str = str.substring(0, 1).toLowerCase() + str.substring(1);
                } else {
                    str = sb.toString();
                }
            }
        }
        return str;
    }

    private String translateSymbol(ParseTree symbol) {
        switch (symbol.getText()) {
            case "(": 
                return "LP_";
            case ")":
                return "RP_";
            case "{":
                return "LBE_:";
            case "}":
                return "RBE_";
            case "[":
                return "LBT_";
            case "]":
                return "RBT_";
            case ";":
                return "SEMI_";
            case ":":
                return "COLON_";
            case "...":
                return "MLT_";
            case ".":
                return "DOT_";
            case "|":
                return "VERTICAL_BAR_";
            case "=":
                return "EQ_";
            case ",":
                return "COMMA_";
            case "\\'":
                return "SQ_";
            case "@":
                return "AT_";
        }
        return null;
    }
}
