def is_pitagorian(a, b, c):
    a *= a
    b *= b
    c *= c
    return a + b == c or a + c == b or b + c == a


for i in range(1, 32):
    for j in range(1, 32):
        for k in range(1, 32):
            if is_pitagorian(i, j, k):
                # print(i, j, k)
                if i + j + k == 103:
                    print(i, j, k)
                    break
