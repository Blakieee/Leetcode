//231: power of 2 has only one 1-bit
//so when check whether a number is a power of 2, we can:
x & (x-1) == 0

1000 & 0111 = 0; //so power of 2

// 191: remove LSB (least significant bit)
// x= 100010, x-1 = 100001
//  x&x-1 = 100000
x = x & (x-1)

//190: if x&1==1, it means LSB == 1
