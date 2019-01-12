//------------------------------------
//Task 1
.aoc.d1.t1: {sum x where 0=deltas x: "J"$/:x,x 0};
.aoc.d1.t2: {sum"J"$/:x where x=(`int$.5*count x)rotate x};

//------------------------------------
//Task 2
.aoc.d2.t1: {sum {max[x]-min x} each x};
.aoc.d2.t2: {sum {$[null i:first where 0=mod[(1_x)%x 0;1]; .z.s 1_x; x[i+1]%x 0] } each asc each x};


//------------------------------------
//Task 3
.aoc.d3.t1: {
    c: 0.5*-1+{$[0=x mod 2;x-1;x]}floor sqrt x-1;
    c1:c1*c1:(1+2*c);
    c2:c2*c2:(1+2*c+1);
    side: 0.25*c2-c1;
    r: (x-c1+1) mod side;
    `long$0^c+1+abs r-(-1+0.5*side)

 };


.aoc.d3.getNextKeys: {
    l: last x;
    n:(l[0]-til y),\:l[1]+1;
    l: last n;
    n,: l[0],/:l[1]-1+til y;
    l: last n;
    n,: (l[0]+1+til y),\:l[1];
    l: last n;
    n,: l[0],/:l[1]+1+til y;
    n
 };


.aoc.d3.resolveValues: {.tmp.dict[x]: sum .tmp.dict x+/:(0 1; -1 1; -1 0; -1 -1; 0 -1; 1 -1; 1 0; 1 1)};


.aoc.d3.t2: {[x]
    .tmp.dict: enlist[0 0]!enlist 1;
    size: 2;
    while[x>max value .tmp.dict;
        .aoc.d3.resolveValues each .aoc.d3.getNextKeys[key .tmp.dict;size];
        size+: 2
    ];
    result: {i:x binr y; x@$[y=x@i;i+1;i]}[value .tmp.dict;x];
    delete dict from `.tmp;
    result
 };


//------------------------------------
//Task 4
.aoc.d4.t1: {sum {all 1>=count each group " " vs x} each x};
.aoc.d4.t2: {sum {all 1>=count each group asc each " " vs x} each x};


//------------------------------------
//Task 5
.aoc.d5.t1: {[offsets]
    offsets: "J"$offsets;
    p: 0; //pointer
    steps: 0;
    while[p within (0;-1+count offsets);
        np: p+offsets p; //nextPointer
        offsets[p]+: 1;
        p: np;
        steps+: 1;
    ];
    steps
 };


.aoc.d5.t2: {[offsets]
    offsets: "J"$offsets;
    p: 0; //pointer
    steps: 0;
    while[p within (0;-1+count offsets);
        offset: offsets p;
        np: p+offset; //nextPointer
        offsets[p]+: $[offset>=3;-1;1];
        p: np;
        steps+: 1;
    ];
    steps
 };


//------------------------------------
//Task 6
.aoc.d6.t1: {
    L: count x;
    mult: `long$reverse 10 xexp til L;
    conf: sum x * mult;
    cache: `u#0#0N;
    while[not conf in cache;
        cache,: conf;
        i: first where x=max x;
        v: x@i;
        x[i]: 0;
        x: x + floor v%L;
        x[(1+i+til mod[v;L]) mod L]+: 1;
        conf: sum x * mult;
    ];
    count cache
 };


.aoc.d6.t2: {
    L: count x;
    mult: `long$reverse 10 xexp til L;
    conf: sum x * mult;
    cache: `u#0#0N;
    seen: 0N;
    while[not conf=seen;
        if[(null seen)&conf in cache; seen: conf; seenIter: count cache];
        cache,: conf;
        i: first where x=max x;
        v: x@i;
        x[i]: 0;
        x: x + floor v%L;
        x[(1+i+til mod[v;L]) mod L]+: 1;
        conf: sum x * mult;
    ];
    count[cache]-seenIter
 };