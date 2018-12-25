//Task 1.1
{sum x where 0=deltas x: "J"$/:x,x 0}
//Task 1.2
{sum"J"$/:x where x=(`int$.5*count x)rotate x}

//Task 2.1
{sum {max[x]-min x} each x}
//Task 2.2
{sum {$[null i:first where 0=mod[(1_x)%x 0;1]; .z.s 1_x; x[i+1]%x 0] } each asc each x}

//Task 3.1
0 3 2 31 326 ~ {
    c: 0.5*-1+{$[0=x mod 2;x-1;x]}floor sqrt x-1;
    c1:c1*c1:(1+2*c);
    c2:c2*c2:(1+2*c+1);
    side: 0.25*c2-c1;
    r: (x-c1+1) mod side;
    `long$0^c+1+abs r-(-1+0.5*side)

}each 1 12 23 1024 361527

flip `a`b!(1 2 3; 7 8 9)

//Task 4
.aoc.d4.t1: {sum {all 1>=count each group " " vs x} each x};
.aoc.d4.t2: {sum {all 1>=count each group asc each " " vs x} each x};
