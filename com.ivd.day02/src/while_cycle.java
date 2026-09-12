public class while_cycle {
    public static void main(String[] args) {
        /*0.1mm纸足够大，折叠多少次才能跟喜马拉雅山一样高（8848860mm）*/
        double paper=0.1;
        double mountain=8848860;

        int count =0;
        while(paper<mountain){
            paper=paper*2;
            count++;
        }
        System.out.println(count);
    }
}
