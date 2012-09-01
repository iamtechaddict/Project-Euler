var sum:BigInt = 0
(1 to 1000).foreach(x => sum = sum+((BigInt(x)).pow(x)))
println(sum.mod("10000000000"))