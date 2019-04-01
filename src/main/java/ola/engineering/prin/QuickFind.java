package ola.engineering.prin;

public class QuickFind {

private int[] id;
public QuickFind(int N) {

    id = new int[N];
    for (int i=0; i < N; i++){
        id[i] = i;
    }
}

public boolean connected(int p, int q) {
//    really checking the positions of the ints p and q
    return id[p] == id[q];
}

public void union(int p, int q) {
//    get the position of the ints
    int pid = id[p];
    int qid = id[q];

    for (int i = 0; i < id.length; i++) {
//if the current number's position is the same as pid,
// then switch the id to qid
//  In the end, all will have qid as id
        if(id[i] == pid) id[i] = qid;
    }


}


}
