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

.aoc.d6.t2: {[x;y]
  x: "J"$", "vs/:x;
  range: flip (min x;max x);
  p: {x cross y} . .aoc.common.range each range;
  sum{z>sum sum abs x -\:y}[x;;y]'[p]
 };


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


//------------------------------------
//Task 9
// Sub tasks 1 and 2 are same
// Absense of linked-list makes solution very slow
.aoc.d9.t1: {[players;lastMarble]
    .tmp.m: 0 2 1;
    .tmp.p: players#0;
    {
        //x@0 - active marble index
        //x@1 - next marble
        a: y 0;
        n: y 1;
        //logging progress
        if[0=n mod 10000;0N!n];

        if[n=x+1;:y];
        c: count .tmp.m;
        if[0=n mod 23
            ; del: (a-7) mod c
            ; .tmp.p[n mod count .tmp.p]+: .tmp.m[del]+n
            ; .tmp.m: (del#.tmp.m), (del+1)_.tmp.m
            ; a: del mod -1+c
            ; :(a;n+1)
        ];

        $[a=c-2
            ; [.tmp.m,:n; a: c]
            ; $[a=c-1
                ;[.tmp.m: .tmp.m[0],n,1_.tmp.m; a:1]
                ;[.tmp.m: ((a+2)#.tmp.m),n,(a+2)_.tmp.m; a: a+2]
            ]
        ];
        (a;n+1)

    }[lastMarble]/[(1;3)];
    high: max .tmp.p;
    delete m from `.tmp;
    delete p from `.tmp;
    high
 };

.aoc.d9.t2: .aoc.d9.t1;


//------------------------------------
//Task 10.1
data: read0 hsym`$input.dir,"2018_10.input";
positions: {"J"$ ", "vs(x?">")#x:(1+x?"<")_x}each data;
velocities: {"J"$ ", "vs(x?">")#x:(1+x?"<")_x}each last each"velocity"vs/:data;

.aoc.d10.t2: {
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

.aoc.d10.sec: .aoc.d8.t2[positions;velocities];
.aoc.d10.t1: {
  b:(min x;max x);
  w: 1+b[1;0]-b[0;0];
  h: 1+b[1;1]-b[0;1];
  c: (h*w)#"_";
  pos:{y[0]+x*y[1]}[w]'[x-\:b 0];
  c[pos]: "a";
  c: w cut c;
  ("\n","\n" sv c),"\n"
 };
.aoc.d10.message: .aoc.d10.t1 positions+'.aoc.d10.sec*velocities;


//------------------------------------
//Task 11
.aoc.d11.prepare: {[size;serial]
  matrix: (1+til size) cross 1+til size;
  levels: size cut {
    ID: y[0]+10;
    lvl: ID*y[1];
    lvl: lvl+x;
    lvl: ID*lvl;
    lvl: floor mod[lvl;1000]%100;
    lvl-5
  }[serial]each matrix;
  sums levels
 };

.aoc.d11.t1: {[size;serial;squareSize]
  levelSums: .aoc.d11.prepare[size;serial];
  1#`energy xdesc flip`energy`x`y`size ! flip raze
    {[x;y;i;j](sum x[i+y-1;j+til y]-0^x[i-1;j+til y];i+1;j+1;y)}
      [levelSums;squareSize]'[til size+1-squareSize]'[til size+1-squareSize]
 };

.aoc.d11.t2: {[size;serial]
  levelSums: .aoc.d11.prepare[size;serial];
  1#`energy xdesc raze {[levelSums;size;squareSize]
    0N!"processing size ",string squareSize;
    1#`energy xdesc flip`energy`x`y`size ! flip raze
      {[x;y;i;j](sum x[i+y-1;j+til y]-0^x[i-1;j+til y];i+1;j+1;y)}
        [levelSums;squareSize]'[til size+1-squareSize]'[til size+1-squareSize]
  }[levelSums;size] each 1+til size
 };


//------------------------------------
//Task 12
.aoc.d12.parse: {
    data: read0 hsym`$x;
    state: 15_data 0;
    patterns: 2_data;
    patterns: patterns where patterns like "*#";
    state: "#"=state;
    patterns: "#"=5#'patterns;
    patterns: 2 sv/:"J"$string patterns;
    `state`patterns!(state;patterns)
 };

.aoc.d12.nextGen: {[patterns;maxGen;x]
    //x@0 - next generation number
    //x@1 - offset
    //x@2 - generation state
    i: x 0;
    if[i~maxGen+1;:x];
    o: x 1;
    ng: x 2;
    ng: 0000b,ng,0000b;
    ng: ng (til -2+count ng)+\:til 5;
    ng: (2 sv/:"J"$string ng) in patterns;
    p: where ng;
    ng: (1+last[p]-first p)#first[p] _ng;
    if[ng~x 2;:x];
    (i+1;-2+o+first p;ng)
 };

.aoc.d12.t1: {[file;gen]
    data: .aoc.d12.parse file;
    rs: .aoc.d12.nextGen[data`patterns;gen]/[(1;0;data`state)];
    sum rs[1] + where rs 2
 };


//------------------------------------
//Task 13

//(left;straight;right)
.aoc.d13.static.options: (">v<^"!"^>v<";">v<^"!">v<^";">v<^"!"v<^>");
.aoc.d13.static.move: ">v<^"!(0 1;1 0; 0 -1;-1 0);
.aoc.d13.static.rounds: ("v\\";"v\/";"^\/";"^\\";">\\";">\/";"<\\";"<\/")!"><><v^^v";

.aoc.d13.parse: {
    data: read0 hsym`$x;
    map: {x^("<>^v"!"--||")x}each data;
    carts: where each data in "^v><";
    carts: (carts;til count carts);
    carts: carts@\:where not 0=count each carts 0;
    carts: flip carts;
    carts: raze{x[1],'x 0}each carts;
    cartDirections: {data[x 0;x 1]}each carts;
    `map`carts`cartDirections!(map;carts;cartDirections)
 };

.aoc.d13.t1: {
    data: .aoc.d13.parse x;
    result: {[x;y]
        //y 0 - cart options count
        //y 1 - cart directions
        //y 2 - cart positions
        if[(count y 2)>count distinct y 2;:y];
        y: {
            o: y 0;
            d: y 1;
            p: y 2;
            map: first x[p 0;p 1];
            $[map="+"
                ; [d: (.aoc.d13.static.options@o mod 3)d; o:o+1]
                ; $[map in "\\\/"
                    ; d: .aoc.d13.static.rounds@d,map
                    ;
                ]
            ];
            p+:.aoc.d13.static.move d;
            (o;d;p)
       } [x] each flip y;
       flip y
    }[data`map]/[((count data`carts)#0;data`cartDirections;data`carts)];
    collides:  {x where 1<count each x}value group result 2;
    {x[1],",",x 0}string result[2] first raze collides
 };


//------------------------------------
//Task 14
.aoc.d14.t1: {[recipes;current;recipeOffset;recipeLimit]
    raze string recipeLimit#recipeOffset _ last
    {
        //y@0 - current recipes (active)
        //y@1 - recipe scores

        //log progress
        if[mod[count y 1;10000]=0;0N!count y 1];

        if[x<=count y 1;:y];
        c: y[1]@y[0];
        y[1],: "J"$/:string sum c;
        y[0]: (y[0]+c+1) mod count y[1];
        y
    }[recipeOffset+recipeLimit]/[(current;recipes)]
 };

.aoc.d14.t2: {[recipes;sequence]
    //global list is used to avoid unnecessary copying when running `over` function.
    .tmp.recipes: recipes;
    {[x;y]
        //y@0 - current recipes (active)
        //y@1 - current iteration (helps to avoid convergence until sequence is found)
        //y@2 - recipes tail to be inspected for sequence
        if[0<count (raze string (neg y[2]+count x)#.tmp.recipes) ss x;:y];
        c: .tmp.recipes@y[0];
        appx: "J"$/:string sum c;
        .tmp.recipes,: appx;
        ((y[0]+c+1) mod count .tmp.recipes;1+y 1;count appx)
    }[sequence]/[(0 1;0;0)];
    offset: first (raze string .tmp.recipes) ss sequence;
    delete recipes from `.tmp;
    offset
 };