//------------------------------------
//----- common
.aoc.common.range: {x[0]+til 1+x[1]-x[0]};

//------------------------------------
//Task 1.1
sum"J"$read0 hsym`$input.dir,"2018_1.input"
//Task 1.2
{
    x: x, last[x]+y;
    g: group x;
    i: (key g)@where 2<=count each value g;
    r: i#g;
    $[0=count i; .z.s[x;y]; (key r)@where value r[;1]=min r[;1]]
}[0;sums "J"$read0 hsym`$input.dir,"2018_1.input"]


//------------------------------------
//Task 2.1
{prd sum {2 3 in count each group x}each x}("abcdef";"bababc";"abbcde";"abcccd";"aabcdd";"abcdee";"ababab")
//Task 2.2 (brute force, should be Trie)
{first raze{
  d:0=last deltas`int$x 0 1;
  $[1=sum not d; enlist(x 0)@where d;()]
}each{x cross x}enlist each x}("abcde";"fghij";"klmno";"pqrst";"fguij";"axcye";"wvxyz")


//------------------------------------
//Task 3.1, 3.2
.aoc.parse:{x:-2#" " vs x;"J"$(","vs -1_x 0), "x" vs x 1};
.aoc.size: {max{(x[0]+x[2];x[1]+x[3])} each x};
data: .aoc.parse each data;
size: .aoc.size data;
count where 1<count each group raze {{(x[0]*size 0)+x 1}each (x 0 1) +/: til[x 2] cross til[x 3]}each data
(til count data) except {distinct raze exec id from select from x where 1<count each id}select id by data from ungroup update id: i from ([]{{(x[0]*size 0)+x 1}each (x 0 1) +/: til[x 2] cross til[x 3]}each data)


//------------------------------------
//Task 4
.aoc.d4.prepare: {
  x: `time xasc update time: {"P"$(string 400+"J"$x[0 1 2 3]),".",x[5 6],".",x[8 9],"D",x[11 12 13 14 15]} each 1_'17#'payload from ([]payload: x);
  x: update ID: "J"$first each" " vs/:26_'payload from x where payload like "*Guard*";
  x: update fills ID from x;
  x: update sleep: payload like "*asleep*"from x;
  x: update period: next[time]-time from x;
  x
};

.aoc.d4.addMm: {[time;period]
  ((`hh$time)+`int$`minute$time)+til each `long$0^(`long$1e-9*period)%60
 };

.aoc.d4.getStrategy1: {
  sleepyID: exec first ID from`period xdesc select sum period by ID from x where sleep;
  x: select from data where ID=sleepyID, sleep;
  x: update mm: .aoc.d4.addMm[time;period] from x;
  sleepyID*{key[x]@first where max[c]=c:count each value x}group raze x`mm
 };

.aoc.d4.getStrategy2: {
  x: select mm: {c:count each value x;m:max c;(key[x]@first where c=m;m)}group raze .aoc.d4.addMm[time;period] by ID from data where sleep;
  exec first ID*mm[;0]from x where mm[;1]=max mm[;1]
 };

.aoc.d4.getStrategy1 .aoc.d4.prepare read0 hsym`$input.dir,"2018_5.input";
.aoc.d4.getStrategy2 .aoc.d4.prepare read0 hsym`$input.dir,"2018_5.input";


//------------------------------------
//Task 5.1
0 0 4 6 10 ~
  {-1+count{$[32=abs y-last x;-1_x;x,y]} over 0N,`int$x}
  each ("aA";"abBA";"abAB";"aabAAB";"dabAcCaCBAcCcaDA");
//Task 5.2
0 0 0 0 4 ~
  {min {-1+count{$[32=abs y-last x;-1_x;x,y]} over 0N,`int$x} each {x except y, upper y}[x]each distinct lower distinct x}
  each ("aA";"abBA";"abAB";"aabAAB";"dabAcCaCBAcCcaDA");


//------------------------------------
//Task 6.1
.aoc.d6.t1: {
  x: "J"$", "vs/:x;
  range: flip (min x;max x);
  p: {x cross y} . .aoc.common.range each range;
  areas: raze {x: sum each abs x -\:y; x: where x=min x; $[1=count x;first x;()]}[x]'[p];
  max {key[x]!count each value x}group areas
 };
if[not 17~.aoc.d6.t1("1, 1";"1, 6";"8, 3";"3, 4";"5, 5";"8, 9");'"[AssertionException] .aoc.d6.t1"];


.aoc.d6.t2: {[x;y]
  x: "J"$", "vs/:x;
  range: flip (min x;max x);
  p: {x cross y} . .aoc.common.range each range;
  sum{z>sum sum abs x -\:y}[x;;y]'[p]
 };
if[not 16=.aoc.d6.t2[("1, 1";"1, 6";"8, 3";"3, 4";"5, 5";"8, 9");32];'"[AssertionException] .aoc.d6.t2"];


//------------------------------------
//Task 7.1 (Topololical sort)
.aoc.topSort: {
  last{
    L: x@1;
    G: x@0;
    n: first asc distinct (first each G) except last each G;
    filtered: G where not G like n,"*";
    L,:n;
    if[0=count filtered; L,:asc distinct raze G[;1]];
    (filtered;L)
  }/[(x;())]
 };

.aoc.d7.parse: {{(last x@0;first x@1)}each " must be finished before step "vs/:x};

.aoc.d7.t1: {.aoc.topSort .aoc.d7.parse x};
if[not "CABDFE"~.aoc.topSort("CA";"CF";"AB";"AD";"BE";"DE";"FE");'"[AssertionException] .aoc.topSort"];

//Task 7.2
.aoc.d7.t2: {
  data: .aoc.d7.parse x;
  sorted: .aoc.topSort data;
  .tmp.workers: y#0;
  .tmp.completed: sorted!count[sorted]#0;
  {
    c: .tmp.completed y;
    w: .tmp.workers?first w where w=max w:.tmp.workers where .tmp.workers<c;
    if[w=count .tmp.workers; w: .tmp.workers?first w where w=min w:.tmp.workers where .tmp.workers>=c];
    t: (.tmp.workers[w]|.tmp.completed y)+61+(`int$y)-`int$"A";
    .tmp.workers[w]: t;
    deps: distinct raze last each x where x like y,"*";
    .tmp.completed[deps]: .tmp.completed[deps]|t;
  }[data]each sorted;
  time: max .tmp.workers;
  delete workers from `.tmp;
  delete completed from `.tmp;
  time
};


//------------------------------------
//Task 8.1
.aoc.d8.t1: {
  x: "J"$" " vs x;
  first{
    s: x 0;
    tree: x 1;
    n: last tree;
    data: x 2;
    if[0=count data;:x];
    if[0<n 0; :(s;tree,enlist 2#data;2_data)];
    $[0=n 1
      ;(s;[tree: -1_tree; tree[-1+count tree]: last[tree] + (-1 0); tree];data)
      ;(s+sum(n 1)#data;[tree[-1+count tree]: 0 0; tree];(n 1)_data)
    ]
  }/[(0;enlist 2#x;2_x)]
};
if[not 138~.aoc.d8.t1"2 3 0 3 10 11 12 1 1 0 1 99 2 1 1 2";'"[AssertionException] .aoc.d8.t1"];

.aoc.d8.t2: {
  x: "J"$" " vs x;
  {
    //0 - children, 1 - metadata, 2 - children processed, 3 - sum
    if[0>type x;:x];
    tree: x 0;
    n: last tree;
    data: x 1;

    s: $[0=n 0;sum(n 1)#data;$[0=n 2;sum(n 3)@-1+(n 1)#data;0N]];
    $[any 0= n 0 2
      ; [tree: -1_tree
        ; if[0=count tree; :s]
        ; tree[-1+count tree;3],: s
        ; tree[-1+count tree;2]-: 1
        ; (tree;(n 1)_data)
      ]
      ; (tree, enlist (data 0 1 0), enlist 0#0N;2_data)
    ]
  }/[(enlist(x 0;x 1;x 0; 0#0N);2_x)]
};
if[not 66~.aoc.d8.t1"2 3 0 3 10 11 12 1 1 0 1 99 2 1 1 2";'"[AssertionException] .aoc.d8.t2"];


//------------------------------------
//Task 9.1
{
if[1600<x`l;:x];
    m: x`m;
$[0=m mod 23
;[
a: (x[`a]-7) mod count x`c;
l: m+x[`c]@a;
            c: (a#x`c),((a+1)_ x`c);
            if[a=count c;a:0]
        ]
        ;[
            a: (x[`a]+2) mod count x`c;
            if[a=0;a:count x`c];
l: 0;
c: (a#x`c),m,(a _ x`c);
]
];
s: l+x`s;
    p: x`p;
p[x`e]+:l;
    `m`c`a`e`p`s`l!(m+1;c;a;(1+x`e) mod count x`p;p;s;l)

}/[`m`c`a`e`p`s`l!(2;0 1;1;2;10#0;0;0)]



//------------------------------------
//Task 10.1
data: read0 hsym`$input.dir,"2018_10.input";
positions: {"J"$ ", "vs(x?">")#x:(1+x?"<")_x}each data;
velocities: {"J"$ ", "vs(x?">")#x:(1+x?"<")_x}each last each"velocity"vs/:data;

.aoc.d8.t2: {
  first {
    s: x 0; //second
    p: x 1; //current positions
    v: x 2; //velocities
    a: x 3; //rectangle area
    p: p+v;
    b:(min p;max p); //boundaries;
    area: prd last deltas b;
    $[area>a;x;(s+1;p;v;area)]
  }/[(0;x;y;0W)]
 };

.aoc.d8.sec: .aoc.d8.t2[positions;velocities];
.aoc.d8.t1: {
  b:(min x;max x);
  w: 1+b[1;0]-b[0;0];
  h: 1+b[1;1]-b[0;1];
  c: (h*w)#"_";
  pos:{y[0]+x*y[1]}[w]'[x-\:b 0];
  c[pos]: "a";
  c: w cut c;
  ("\n","\n" sv c),"\n"
 };
.aoc.d8.message: .aoc.d8.t1 positions+'.aoc.d8.sec*velocities;