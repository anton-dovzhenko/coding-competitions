//------------------------------------
//Task 6
if[not 17~.aoc.d6.t1("1, 1";"1, 6";"8, 3";"3, 4";"5, 5";"8, 9"); '"[AssertionException] .aoc.d6.t1"];
if[not 16=.aoc.d6.t2[("1, 1";"1, 6";"8, 3";"3, 4";"5, 5";"8, 9");32]; '"[AssertionException] .aoc.d6.t2"];

//------------------------------------
//Task 7
if[not "CABDFE"~.aoc.topSort("CA";"CF";"AB";"AD";"BE";"DE";"FE"); '"[AssertionException] .aoc.topSort"];

//------------------------------------
//Task 8
if[not 138~.aoc.d8.t1"2 3 0 3 10 11 12 1 1 0 1 99 2 1 1 2"; '"[AssertionException] .aoc.d8.t1"];
if[not 66~.aoc.d8.t1"2 3 0 3 10 11 12 1 1 0 1 99 2 1 1 2"; '"[AssertionException] .aoc.d8.t2"];

//------------------------------------
//Task 11
if[not (`energy`x`y`size!enlist each(29;33;45;3))~flip .aoc.d11.t1[300;18;3]; '"[AssertionException] .aoc.d11.t1 case 1"];
if[not (`energy`x`y`size!enlist each(30;21;61;3))~flip .aoc.d11.t1[300;42;3]; '"[AssertionException] .aoc.d11.t1 case 2"];
if[not (`energy`x`y`size!enlist each(30;20;58;3))~flip .aoc.d11.t1[300;6392;3]; '"[AssertionException] .aoc.d11.t1 case 3"];
if[not (`energy`x`y`size!enlist each(83;233;268;13))~flip .aoc.d11.t2[300;6392]; '"[AssertionException] .aoc.d11.t2"];

//------------------------------------
//Task 12
if[not 325=.aoc.d12.t1[input.dir,"2018_12.input0";20]; '"[AssertionException] .aoc.d12.t1 case 1"];
if[not 3258=.aoc.d12.t1[input.dir,"2018_12.input";20]; '"[AssertionException] .aoc.d12.t1 case 2"];

//------------------------------------
//Task 12
if[not "7,3"~.aoc.d13.t1[input.dir,"2018_13.input0"]; '"[AssertionException] .aoc.d13.t1 case 1"];
if[not "16,45"~.aoc.d13.t1[input.dir,"2018_13.input"]; '"[AssertionException] .aoc.d13.t1 case 2"];
