public class Quad {

    String operateur, operendeG, operendeD, res;

    public Quad(){
        this.operateur=null;
        this.operendeG=null;
        this.operendeD=null;
        this.res=null;
    }

    public Quad(String operateur, String operendeG, String operendeD, String res){
        this.operateur=operateur;
        this.operendeG=operendeG;
        this.operendeD=operendeD;
        this.res=res;
    }

    public String getOperateur() {
        return operateur;
    }

    public String getRes() {
        return res;
    }

    public void setQuad(int index, String s)
    {   // x = 1 c opt
        if(index == 1) operateur = s;
        //x=2 c op1
        if(index == 2) operendeG = s;
        //x=3 c op2
        if(index == 3) operendeD = s;
        //x=4 c res
        if(index == 4) res = s;
    }

    public String toString()
    {
        return "("+operateur+","+operendeG+","+operendeD+","+res+")";
    }


}
