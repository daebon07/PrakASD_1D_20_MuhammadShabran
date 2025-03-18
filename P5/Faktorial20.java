package P5;
public class Faktorial20 {
    int faktorialBF (int n){
        int fakto = 1;
    int i = 1;
    do {
        fakto = fakto * i;
        i++;
    } while(i <= n);
    return fakto;
    }

    int faktorialDc(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n* faktorialDc (n-1);
            return fakto;
        }
    }
}
