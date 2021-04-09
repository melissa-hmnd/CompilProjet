
import java.util.HashMap;
import java.util.LinkedList;

public class QGenerator extends LTBaseListener{

    private LinkedList<String> pile = new LinkedList<>();
    private ListeQuad q = new ListeQuad();
    private int cpt =0;
    String temp;
    private static HashMap<String,String> br = new HashMap<>();

    int saveCondition;

    public void exitProg(LTParser.ProgContext ctx){
        System.out.println("Les Quads \n");
        q.affQ();
    }

    //public void enterProg()

    public void exitAff(LTParser.AffContext ctx){

        if(ctx.ID() != null){
            String s = pile.pop();
            q.addQuad("="," ",s,ctx.ID().getText());
        }
    }

     public void exitExp (LTParser.ExpContext ctx){
        if(ctx.exp() != null){
            String s1 = pile.pop();
            String s2 = pile.pop();
            String temp = "Temp"+(++cpt);
            q.addQuad(ctx.pm().getText(),s1,s2,temp);
        }
     }

     public void exitComplicated(LTParser.ComplicatedContext ctx){
        if(ctx.complicated() !=null){
            String s1 = pile.removeLast();
            String s2 = pile.removeLast();
            String temp = "Temp"+(++cpt);
            q.addQuad(ctx.md().getText(),s2,s1,temp);
        }
     }

     public void exitFex (LTParser.FexContext ctx){
        if(ctx.exp()==null){
            pile.add(ctx.getText());
        }
     }

     public  void exitCond (LTParser.CondContext ctx){
        String s1 = pile.removeLast();
        String s2 = pile.removeLast();
        saveCondition = q.addQuad(getBr(ctx.op().getText()),s2,s1," ");
     }

     public void exitElse(LTParser.InstifContext ctx){
        q.getQuad(saveCondition).setQuad(3," "+(q.quads.size()+1));
        saveCondition = q.addQuad("BR"," "," "," ");
     }

     public void exitInstif(LTParser.InstifContext ctx){
         q.getQuad(saveCondition).setQuad(3," "+q.quads.size());
     }

    public void exitInstdo(LTParser.InstdoContext ctx){
        q.getQuad(saveCondition).setQuad(3," "+(q.quads.size()+1));
    }



    private static String getBr(String s){
        return br.get(s);
     }


}
